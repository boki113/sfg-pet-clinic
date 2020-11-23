package org.pet.clinic.data.model;

public class Speciality extends BaseEntity {
	
	private static final long serialVersionUID = 2428566162537128633L;
	
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
