package com.testcases.helpers;

public class User {
	private String firstName;
	private String lastName;

	public User(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName(){
		return this.firstName;
	}
	
	public String getLastName(){
		return this.lastName;
	}
	@Override
	public String toString() {
		return "First name: " + this.firstName + ",  Last name: " + this.lastName + "\n";
	}
}
