package com.xworkz.stream.king.dao;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.xworkz.stream.king.dto.KingDTO;

public class KingDAOImpl implements KingDAO {

	Collection<KingDTO> collection = new ArrayList<KingDTO>();

	@Override
	public boolean save(KingDTO dto) {
		boolean added = collection.add(dto);
		System.out.println(dto);
		return added;
	}

	@Override
	public Collection<KingDTO> findByRegion(Predicate<KingDTO> search) {

		return this.collection.stream().filter(r -> search.test(r)).collect(Collectors.toList());
	}

	@Override
	public Optional<KingDTO> findOneByName(Predicate<KingDTO> search) {
		// TODO Auto-generated method stub
		return this.collection.stream().filter(g -> search.test(g)).findFirst();
	}

	@Override
	public Collection<KingDTO> findByNameLike(Predicate<KingDTO> search) {
		// TODO Auto-generated method stub
		return this.collection.stream().filter(d -> search.test(d)).collect(Collectors.toList());
	}

}
