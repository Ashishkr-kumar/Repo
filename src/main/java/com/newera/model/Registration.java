package com.newera.model;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Registration {

	
	private int registrationId;
	
	private String fname;
	
	private String lname;
	
	private String email;
	
	private String mobile;
	
	private String password;
	
	private String sex;
	
	private boolean resetPasswordInd;
	
	
	private String rewardpoints;
	
	
	public String getRewardpoints() {
		return rewardpoints;
	}
	public void setRewardpoints(String rewardpoints) {
		this.rewardpoints = rewardpoints;
	}
	public boolean isResetPasswordInd() {
		return resetPasswordInd;
	}
	public void setResetPasswordInd(boolean resetPasswordInd) {
		this.resetPasswordInd = resetPasswordInd;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	/*public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}*/
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}
}
