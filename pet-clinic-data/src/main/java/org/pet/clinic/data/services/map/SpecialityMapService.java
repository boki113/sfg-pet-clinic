package org.pet.clinic.data.services.map;

import java.util.Set;

import org.pet.clinic.data.model.Speciality;
import org.pet.clinic.data.services.SpecialityService;
import org.springframework.stereotype.Service;

@Service
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialityService{

	@Override
	public Set<Speciality> findAll() {
		return super.findAll();
	}

	@Override
	public Speciality findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Speciality save(Speciality entity) {
		return super.save(entity);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Speciality entity) {
		super.delete(entity);
	}

	
}
