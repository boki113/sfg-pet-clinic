package org.pet.clinic.data.services.map;

import java.util.Set;

import org.pet.clinic.data.model.Vet;
import org.pet.clinic.data.services.CrudService;
import org.pet.clinic.data.services.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {

	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Vet save(Vet entity) {
		return super.save(entity);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Vet entity) {
		super.delete(entity);
	}

	
}
