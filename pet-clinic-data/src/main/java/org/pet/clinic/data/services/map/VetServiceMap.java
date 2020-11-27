package org.pet.clinic.data.services.map;

import java.util.Set;

import org.pet.clinic.data.model.Speciality;
import org.pet.clinic.data.model.Vet;
import org.pet.clinic.data.services.CrudService;
import org.pet.clinic.data.services.SpecialityService;
import org.pet.clinic.data.services.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {

	private final SpecialityService specialityService;
	
	public VetServiceMap(SpecialityService specialityService) {
		this.specialityService = specialityService;
	}

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
		if(entity.getSpecialities().size() > 0) {
			entity.getSpecialities().forEach(speciality -> {
				if(speciality.getId() == null) {
					Speciality savedSpeciality = specialityService.save(speciality);
					speciality.setId(savedSpeciality.getId());
				}
			});
		}
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
