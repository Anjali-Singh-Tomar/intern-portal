package com.shecan.intern.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Intern {
	
	private String name;
	private String referralCode;
	private double donationRaised;
	
	public Intern(String name, String referralCode, double donationRaised) {
		super();
		this.name = name;
		this.referralCode = referralCode;
		this.donationRaised = donationRaised;
	}
	
	public String getReferralCode() {
		return referralCode;
	}
	public void setReferralCode(String referralCode) {
		this.referralCode = referralCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDonationRaised() {
		return donationRaised;
	}
	public void setDonationRaised(double donationRaised) {
		this.donationRaised = donationRaised;
	}
	
	
}
