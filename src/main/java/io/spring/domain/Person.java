package io.spring.domain;

public class Person {
	
	int personID;
	String lastName;
	String firstName;
	
	public Person() {		
	}
	
	public Person(int personID, String lastName, String firstName) {
		super();
		this.personID = personID;
		this.lastName = lastName;
		this.firstName = firstName;
	}

	public int getPersonID() {
		return personID;
	}

	public void setPersonID(int personID) {
		this.personID = personID;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "Person [personID=" + personID + ", lastName=" + lastName
				+ ", firstName=" + firstName + "]";
	}
	
}
