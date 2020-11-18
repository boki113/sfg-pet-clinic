package org.pet.clinic.data.services.map;

import java.util.Set;

import org.pet.clinic.data.model.Owner;
import org.pet.clinic.data.services.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

	@Override
	public Owner save(Long id, Owner entity) {
		return super.save(id, entity);
	}

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}

	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Owner entity) {
		super.delete(entity);
	}

}
