package com.xworkz.stream.king.service;

import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;

import com.xworkz.stream.king.dto.KingDTO;

public interface KingService {

	String validateAndsave(KingDTO dto);

	Collection<KingDTO> validateAndfindByRegion(Predicate<KingDTO> search);

	Optional<KingDTO> validateAndfindOneByName(Predicate<KingDTO> search);

	Collection<KingDTO> validateAndfindByNameLike(Predicate<KingDTO> search);
}
