package org.pet.clinic.data.services;

import java.util.Set;

import org.pet.clinic.data.model.Owner;

/**
 * 
 * @author perica
 *
 */
public interface OwnerService {
	
	Owner findByLastName(String lastName);
	
	Owner findById(Long id);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll();
}
