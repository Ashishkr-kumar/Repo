package com.newera.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlRootElement
public class UpdateIncentive {

	private String Month_c;
	private Date StartDate_c;
	private Date EndDate_c;
	private BigDecimal Quota_c;
	private BigDecimal AchievedAmount_c;
	private BigDecimal IncentivePercentage_c;
	private BigDecimal IncentiveAmount_c;
	private BigDecimal Resource_Id_ICM;
	private String recordName;
	private String username;
	
	

	public String getMonth_c() {
		return Month_c;
	}

	public void setMonth_c(String month_c) {
		Month_c = month_c;
	}

	public Date getStartDate_c() {
		return StartDate_c;
	}

	public void setStartDate_c(Date startDate_c) {
		StartDate_c = startDate_c;
	}

	public Date getEndDate_c() {
		return EndDate_c;
	}

	public void setEndDate_c(Date endDate_c) {
		EndDate_c = endDate_c;
	}

	public BigDecimal getQuota_c() {
		return Quota_c;
	}

	public void setQuota_c(BigDecimal quota_c) {
		Quota_c = quota_c;
	}

	public BigDecimal getAchievedAmount_c() {
		return AchievedAmount_c;
	}

	public void setAchievedAmount_c(BigDecimal achievedAmount_c) {
		AchievedAmount_c = achievedAmount_c;
	}

	public BigDecimal getIncentivePercentage_c() {
		return IncentivePercentage_c;
	}

	public void setIncentivePercentage_c(BigDecimal incentivePercentage_c) {
		IncentivePercentage_c = incentivePercentage_c;
	}

	public BigDecimal getIncentiveAmount_c() {
		return IncentiveAmount_c;
	}

	public void setIncentiveAmount_c(BigDecimal incentiveAmount_c) {
		IncentiveAmount_c = incentiveAmount_c;
	}

	public BigDecimal getResource_Id_ICM() {
		return Resource_Id_ICM;
	}

	public void setResource_Id_ICM(BigDecimal resource_Id_ICM) {
		Resource_Id_ICM = resource_Id_ICM;
	}

	public String getRecordName() {
		return recordName;
	}

	public void setRecordName(String recordName) {
		this.recordName = recordName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
