package org.pet.clinic.data.services;
/**
 * 
 * @author perica
 *
 */

import java.util.Set;

import org.pet.clinic.data.model.Pet;

public interface PetService {
	
	Pet findById(Long id);
	
	Pet save(Pet pet);
	
	Set<Pet> findAll();
}
