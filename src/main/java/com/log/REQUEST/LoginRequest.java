package com.log.REQUEST;

public class LoginRequest {

	
	private String UserId;
	private String password;
	
	
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	public LoginRequest() {
		
	}
	public LoginRequest(String userId, String password) {
		UserId = userId;
		this.password = password;
	}
	
	
	
	
	
}
