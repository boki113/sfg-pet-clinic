package org.pet.clinic.data.services.map;

import java.util.Set;

import org.pet.clinic.data.model.PetType;
import org.pet.clinic.data.services.PetTypeService;
import org.springframework.stereotype.Service;

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService{

	@Override
	public Set<PetType> findAll() {
		return super.findAll();
	}

	@Override
	public PetType findById(Long id) {
		return super.findById(id);
	}

	@Override
	public PetType save(PetType entity) {
		return super.save(entity);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(PetType entity) {
		super.delete(entity);
	}
}
