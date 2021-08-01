package com.xworkz.stream.tester;

import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Optional;

import com.xworkz.stream.dao.GroceryDAO;
import com.xworkz.stream.dao.GroceryDAOImpl;
import com.xworkz.stream.dto.GroceryDTO;
import com.xworkz.stream.dto.constants.GroceryType;

public class GroceryTester {

	public static void main(String[] args) {
		Date currentDate = new Date();
		Calendar calender1 = Calendar.getInstance();
		calender1.set(2022, 06, 22);
		Calendar calender2 = Calendar.getInstance();
		calender2.set(2021, 8, 8);
		Calendar calender3 = Calendar.getInstance();
		calender3.set(2021, 9, 28);
		Calendar calender4 = Calendar.getInstance();
		calender4.set(2023, 11, 31);
		Calendar calender5 = Calendar.getInstance();
		calender5.set(2022, 11, 31);

		GroceryDTO dto1 = new GroceryDTO("GulabJamoon", "MTR", 150d, GroceryType.CONDIMENTS_SPICES, 2000d, true, true,
				true, 12000034l, calender1.getTime(), currentDate);
		GroceryDTO dto2 = new GroceryDTO("Fish", "XYZ", 400d, GroceryType.MEAT, 1500d, true, true, false, 00004433l,
				calender2.getTime(), currentDate);
		GroceryDTO dto3 = new GroceryDTO("Potato", "PQR", 250d, GroceryType.VEGETABLES, 8000d, true, true, true,
				77007700l, calender3.getTime(), currentDate);
		GroceryDTO dto4 = new GroceryDTO("Harpic", "Harpic", 300d, GroceryType.HOUSEHOLD_SUPPLIES, 250d, true, false,
				false, 99000034l, calender4.getTime(), currentDate);
		GroceryDTO dto5 = new GroceryDTO("Bru", "Bru", 400d, GroceryType.BEVERAGES, 500d, true, true, true, 55000034l,
				calender5.getTime(), currentDate);

		GroceryDAO dao = new GroceryDAOImpl();
		dao.create(dto1);
		dao.create(dto2);
		dao.create(dto3);
		dao.create(dto4);
		dao.create(dto5);

		Optional<GroceryDTO> temp = dao.findOne((r) -> r.getName().equals("Bru"));

		if (temp.isPresent()) {

			GroceryDTO dto = temp.get();
			System.out.println("found:" + dto);
		} else {
			System.out.println("dto not found");
		}

		Collection<GroceryDTO> all = dao.findAll((p) -> p.getPrice() >= 250);
		all.forEach((t) -> System.out.println(t));

		Optional<GroceryDTO> date = dao.findByManufacturedDate(currentDate);
		if (date.isPresent()) {
			GroceryDTO dt = date.get();
			System.out.println("found  by mfgDate" + dt);
		} else {
			System.out.println("not found");
		}
		/*Collection<GroceryDTO> exp=dao.findAllByExpiredDate();
		exp.forEach((g)->System.out.println(g.getExpiryDate()));*/

		Optional<GroceryDTO> quant = dao.findByMaxQuantity();
		if (quant.isPresent()) {
			GroceryDTO quan = quant.get();
			System.out.println("max quantity found:" + quan);
		} else {
			System.out.println("not found");
		}
	}

}
