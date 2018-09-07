package com.usertrgitration.user.model;

import java.util.UUID;

public class UserRegitration {
	private UUID id;
	private String firstName;
	private String lastName;
	private String userEmail;
	private String password;
	private String phone;
	private String dob;
	
	


	public UUID getSweetId() {
		return id;
	}


	public void setSweetId(UUID id) {
		this.id = id;
	}


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


	public String getUserEmail() {
		return userEmail;
	}


	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	
	
	

}
