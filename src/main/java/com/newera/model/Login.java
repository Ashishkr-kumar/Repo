package com.newera.model;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Login {

	
	private int loginId;
	private String email;
	private String password;
	
	private boolean resetpasswordInd;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isResetpasswordInd() {
		return resetpasswordInd;
	}
	public void setResetpasswordInd(boolean resetpasswordInd) {
		this.resetpasswordInd = resetpasswordInd;
	}
	
}
