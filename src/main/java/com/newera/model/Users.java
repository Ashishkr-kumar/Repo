package com.newera.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Users {

	private String users;
	private int targetAmount=30000;
	public String getUsers() {
		return users;
	}
	public void setUsername(String users) {
		this.users = users;
	}
}
