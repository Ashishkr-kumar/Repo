package com.newera.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlRootElement
public class Incentive {

	private String fromDate;
	private String toDate;
	private List<String> users;
	private String month;
	private BigDecimal totalAmount;
	private String user;
	private BigDecimal calculatedIncentive;
	private BigDecimal percentage;
	private BigDecimal totalIcmAmount;
	private List<Items> resourceList;
	private long resourceIdICM;
	
	
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public List<String> getUsers() {
		return users;
	}
	public void setUsers(List<String> users) {
		this.users = users;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public BigDecimal getCalculatedIncentive() {
		return calculatedIncentive;
	}
	public void setCalculatedIncentive(BigDecimal calculatedIncentive) {
		this.calculatedIncentive = calculatedIncentive;
	}
	public BigDecimal getPercentage() {
		return percentage;
	}
	public void setPercentage(BigDecimal percentage) {
		this.percentage = percentage;
	}
	public BigDecimal getTotalIcmAmount() {
		return totalIcmAmount;
	}
	public void setTotalIcmAmount(BigDecimal totalIcmAmount) {
		this.totalIcmAmount = totalIcmAmount;
	}
	public List<Items> getResourceList() {
		return resourceList;
	}
	public void setResourceList(List<Items> resourceList) {
		this.resourceList = resourceList;
	}
	public long getResourceIdICM() {
		return resourceIdICM;
	}
	public void setResourceIdICM(long resourceIdICM) {
		this.resourceIdICM = resourceIdICM;
	}
	
}
