package org.pet.clinic.data.model;
/**
 * 
 * @author perica
 *
 */
public class Person extends BaseEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3310072126338926878L;
	
	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
