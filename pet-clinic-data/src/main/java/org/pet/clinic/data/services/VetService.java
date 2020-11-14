package org.pet.clinic.data.services;

import java.util.Set;

import org.pet.clinic.data.model.Vet;

/**
 * 
 * @author perica
 *
 */
public interface VetService {

	Vet findById(Long id);
	
	Vet save(Vet vet);
	
	Set<Vet> findAll();
}
