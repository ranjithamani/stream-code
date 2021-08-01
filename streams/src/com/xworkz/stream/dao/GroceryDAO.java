package com.xworkz.stream.dao;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;

import com.xworkz.stream.dto.GroceryDTO;

public interface GroceryDAO {
 boolean create(GroceryDTO dto);
 Optional<GroceryDTO> findOne(GrocerySearch search);
 Collection<GroceryDTO> findAll(GrocerySearch search);
 Optional<GroceryDTO> findByManufacturedDate(Date date);
 //Collection<GroceryDTO> findAllByExpiredDate();
 Optional<GroceryDTO> findByMaxQuantity();
}
