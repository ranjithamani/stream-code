package com.xworkz.stream.dao;

import java.util.*;
import java.util.stream.Collectors;

import com.xworkz.stream.comparator.ComparatorForQuantity;
import com.xworkz.stream.dto.GroceryDTO;

public class GroceryDAOImpl implements GroceryDAO{
	
	ComparatorForQuantity comp=new ComparatorForQuantity();

	private Collection<GroceryDTO> collection=new ArrayList<GroceryDTO>();
	@Override
	public boolean create(GroceryDTO dto) {
		boolean created=this.collection.add(dto);
		System.out.println("dto:"+dto);
		System.out.println("dto was created:"+created);
		return created;
	}
	@Override
	public Optional<GroceryDTO> findOne(GrocerySearch search) {
	return this.collection.stream().filter(r-> search.test(r)).findFirst();
		
	}
	@Override
	public Collection<GroceryDTO> findAll(GrocerySearch search) {
	return this.collection.stream().filter(r-> search.test(r)).collect(Collectors.toList());

	}
	@Override
	public Optional<GroceryDTO> findByManufacturedDate(Date date) {
		
		return this.collection.stream().filter((w)->w.getManufacturedDate().equals(date)).findFirst();
	}
	
	@Override
	public Collection<GroceryDTO> findAllByExpiredDate() {
		
		return this.collection.stream().collect(Collectors.toList());
	}
	
	@Override
	public Optional<GroceryDTO> findByMaxQuantity() {
		
		return this.collection.stream().max(comp);
	}
}
