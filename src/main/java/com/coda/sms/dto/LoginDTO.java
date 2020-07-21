package com.coda.sms.dto;

public class LoginDTO {

	//@NotBlank(message="UserName should not be Blank")
	private String userName;
	//@NotBlank(message="Password should not be Blank")
	private String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "LoginDTO [userName=" + userName + ", password=" + password + "]";
	}
}
