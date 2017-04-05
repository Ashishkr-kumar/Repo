package com.newera.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Email {

	private String host;
	private String port;
	private String user;
	private String pass;
	private String recipient;
	private String subject;
	private String content;
	private String[] attachFiles;
	
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String[] getAttachFiles() {
		return attachFiles;
	}
	public void setAttachFiles(String[] attachFiles) {
		this.attachFiles = attachFiles;
	}
}
