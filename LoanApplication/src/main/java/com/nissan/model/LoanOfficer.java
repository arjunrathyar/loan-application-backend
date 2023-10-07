package com.nissan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoanOfficer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int loanOfficerId;

	private String loanOfficerName;

	public int getLoanOfficerId() {
		return loanOfficerId;
	}

	public String getLoanOfficerName() {
		return loanOfficerName;
	}

	public void setLoanOfficerId(int loanOfficerId) {
		this.loanOfficerId = loanOfficerId;
	}

	public void setLoanOfficerName(String loanOfficerName) {
		this.loanOfficerName = loanOfficerName;
	}

}
