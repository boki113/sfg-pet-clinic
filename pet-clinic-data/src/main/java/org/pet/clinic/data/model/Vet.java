package org.pet.clinic.data.model;

import java.util.Set;

public class Vet extends Person {

	private static final long serialVersionUID = 8486319869404459904L;
	
	private Set<Speciality> specialities;

	public Set<Speciality> getSpecialities() {
		return specialities;
	}

	public void setSpecialities(Set<Speciality> specialities) {
		this.specialities = specialities;
	}
}
