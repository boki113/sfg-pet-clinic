package org.pet.clinic.data.services.map;

import java.util.Set;

import org.pet.clinic.data.model.Pet;
import org.pet.clinic.data.services.CrudService;

public class PetServiceMap extends AbstractMapService<Pet,Long> implements CrudService<Pet, Long>{

	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}

	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Pet save(Long id, Pet entity) {
		return super.save(id, entity);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Pet entity) {
		super.delete(entity);
	}

	
}
