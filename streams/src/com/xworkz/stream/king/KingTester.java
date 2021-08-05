package com.xworkz.stream.king;

import java.util.Collection;
import java.util.Optional;

import com.xworkz.stream.king.dto.KingDTO;
import com.xworkz.stream.king.service.*;

public class KingTester {

	public static void main(String[] args) {
		KingDTO dto1 = new KingDTO("Ashoka", "Pataliputra", "Maurya", 60, "Padmavathi", 4);
		KingDTO dto2 = new KingDTO("Shah Jahan", "Agra", "Mughal", 50, "Mumtaz", 1);
		KingDTO dto3 = new KingDTO("Shivaji", "Maharastra", "Marata", 48, "Lakshmibai", 8);
		KingDTO dto4 = new KingDTO("Krishnadevaraya", "Vijayanagra", "Thuluva", 73, "TirumalaDevi", 2);

		KingService dao=new KingServiceImpl();
		dao.validateAndsave(dto1);
		dao.validateAndsave(dto2);
		dao.validateAndsave(dto3);
		dao.validateAndsave(dto4);

		Collection<KingDTO> region=dao.validateAndfindByRegion(k->k.getRegion().equals("Pataliputra"));
		for (KingDTO kingDTO : region) {
			System.out.println(kingDTO);
			}
		
		Optional<KingDTO> name = dao.validateAndfindOneByName((b) -> b.getName().equals("Shivaji"));
		if(name.isPresent()) {
			KingDTO optional=name.get();
			System.out.println(optional);
		}
		Collection<KingDTO> like=dao.validateAndfindByNameLike((m)->m.getName().equals("Krishnadevaraya"));
		for (KingDTO kingDTO : like) {
			System.out.println(kingDTO);
		}
	}
		

	}


