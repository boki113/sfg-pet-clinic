package org.pet.clinic.data.services.map;

import java.util.Set;

import org.pet.clinic.data.model.Owner;
import org.pet.clinic.data.services.CrudService;
import org.pet.clinic.data.services.OwnerService;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

	@Override
	public Owner save(Owner entity) {
		return super.save(entity);
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

	@Override
	public Owner findByLastName(String lastName) {
		return null;
	}

}
