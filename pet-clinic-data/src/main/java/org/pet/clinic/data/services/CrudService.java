package org.pet.clinic.data.services;

import java.util.Set;
/**
 * General CRUD Service
 * 
 * @author perica
 *
 * @param <T>
 * @param <ID>
 */
public interface CrudService<T, ID> {
	
	Set<T> findAll();
	
	T findById(ID id);
	
	T save(ID id, T entity);
	
	void delete(T entity);
	
	void deleteById(ID id);
}
