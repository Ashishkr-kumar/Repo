package com.newera.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RewardPoint {

	private String email;
	private String rewardPoint;
	private Long Person_Id_ContactReward;
	private int OldValue_c;
	private int NewValue_c;
	private boolean Voucher_c;
	private int RewardPoints_c;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRewardPoint() {
		return rewardPoint;
	}
	public void setRewardPoint(String rewardPoint) {
		this.rewardPoint = rewardPoint;
	}
	public Long getPerson_Id_ContactReward() {
		return Person_Id_ContactReward;
	}
	public void setPerson_Id_ContactReward(Long long1) {
		Person_Id_ContactReward = long1;
	}
	public int getOldValue_c() {
		return OldValue_c;
	}
	public void setOldValue_c(int oldValue_c) {
		OldValue_c = oldValue_c;
	}
	public int getNewValue_c() {
		return NewValue_c;
	}
	public void setNewValue_c(int newValue_c) {
		NewValue_c = newValue_c;
	}
	
	public int getRewardPoints_c() {
		return RewardPoints_c;
	}
	public void setRewardPoints_c(int rewardPoints_c) {
		RewardPoints_c = rewardPoints_c;
	}
	public boolean isVoucher_c() {
		return Voucher_c;
	}
	public void setVoucher_c(boolean voucher_c) {
		Voucher_c = voucher_c;
	}
	
}
