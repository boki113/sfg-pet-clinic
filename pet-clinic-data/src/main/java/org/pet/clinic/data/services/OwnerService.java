package org.pet.clinic.data.services;

import org.pet.clinic.data.model.Owner;

/**
 * 
 * @author perica
 *
 */
public interface OwnerService extends CrudService<Owner, Long> {
	
	Owner findByLastName(String lastName);
}
