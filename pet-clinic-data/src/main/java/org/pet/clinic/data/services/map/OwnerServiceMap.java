package org.pet.clinic.data.services.map;

import java.util.Set;

import org.pet.clinic.data.model.Owner;
import org.pet.clinic.data.model.Pet;
import org.pet.clinic.data.services.CrudService;
import org.pet.clinic.data.services.OwnerService;
import org.pet.clinic.data.services.PetService;
import org.pet.clinic.data.services.PetTypeService;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

	private final PetTypeService petTypeService;
	private final PetService petService;
	
	public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
		this.petTypeService = petTypeService;
		this.petService = petService;
	}

	@Override
	public Owner save(Owner entity) {
		
		if(entity != null) {
			if(entity.getPets() != null) {
				entity.getPets().forEach(pet -> {
					if(pet.getPetType() != null) {
						if(pet.getPetType().getId() == null) {
							pet.setPetType(petTypeService.save(pet.getPetType()));
						}
					} else {
						throw new RuntimeException("Pet Type is required!");
					}
					
					if(pet.getId() == null) {
						Pet savedPet = petService.save(pet);
						pet.setId(savedPet.getId());
					}
				});
			}
			
			return super.save(entity);
		}
		return null;
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
