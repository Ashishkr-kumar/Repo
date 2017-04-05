package com.newera.model;


public class Items {

	private String ResourceProfileId;
	private long resourceIdICM;
	private long resourceNameId;
	private String PartyId;
	private String PartyName;
	private String Quota_c;
	private String percentage;
	
	public String getResourceProfileId() {
		return ResourceProfileId;
	}
	public void setResourceProfileId(String resourceProfileId) {
		ResourceProfileId = resourceProfileId;
	}
	public String getPartyId() {
		return PartyId;
	}
	public void setPartyId(String partyId) {
		PartyId = partyId;
	}
	public String getPartyName() {
		return PartyName;
	}
	public void setPartyName(String partyName) {
		PartyName = partyName;
	}
	public String getQuota_c() {
		return Quota_c;
	}
	public void setQuota_c(String quota_c) {
		Quota_c = quota_c;
	}
	public String getPercentage() {
		return percentage;
	}
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	public long getResourceIdICM() {
		return resourceIdICM;
	}
	public void setResourceIdICM(long resourceIdICM) {
		this.resourceIdICM = resourceIdICM;
	}
	public long getResourceNameId() {
		return resourceNameId;
	}
	public void setResourceNameId(long resourceNameId) {
		this.resourceNameId = resourceNameId;
	}
}
