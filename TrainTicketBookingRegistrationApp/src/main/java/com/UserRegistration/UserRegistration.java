package com.UserRegistration;

public class UserRegistration {
	public String  userName;
	public String emailId;
	public String password;
	public String phoneNumber;
	//constructor with argument passing to assign values
	public UserRegistration(String userName, String emailId, String password, String phoneNumber) {
	
		this.userName = userName;
		this.emailId = emailId;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}
	public UserRegistration(String emailId, String password) {
		this.emailId = emailId;
		this.password = password;
	}
}

