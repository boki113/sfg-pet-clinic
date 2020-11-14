package org.pet.clinic.data.model;

public class PetType extends BaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7878422027851929557L;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
