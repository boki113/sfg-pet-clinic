package org.pet.clinic.data.model;

import java.util.Set;

public class Owner extends Person {

	private static final long serialVersionUID = -8018907123893198122L;
	
	private Set<Pet> pets;

	public Set<Pet> getPets() {
		return pets;
	}

	public void setPets(Set<Pet> pets) {
		this.pets = pets;
	}

}
