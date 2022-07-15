package com.glearning.pg.service;

public class Employee {
	private final String firstName;
		
    private final String lastName;
    private final String dept;
    private String emailAddress;
    
    private String password;

	public Employee(String firstName, String lastName,String dept) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dept = dept;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String string) {
		// TODO Auto-generated method stub
		
	}
	public String getEmailAddress() {
		// TODO Auto-generated method stub
		return null;
	}
}
