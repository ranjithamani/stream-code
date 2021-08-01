package com.xworkz.stream.comparator;

import java.util.Comparator;

import com.xworkz.stream.dto.GroceryDTO;

public class ComparatorForQuantity implements Comparator<GroceryDTO>{
	@Override
	public int compare(GroceryDTO o1, GroceryDTO o2) {
		Double quan1=o1.getQuantity();
		Double quan2=o2.getQuantity();
		
		return quan1.compareTo(quan2);
	}
	

}
