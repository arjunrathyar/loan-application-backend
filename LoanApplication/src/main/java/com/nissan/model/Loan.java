package com.nissan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Loan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int loanId;
	
	private String loanName;
	
//	@ManyToOne
//	@JoinColumn(name="customerId", nullable=false)
//	private Customer customer;

	public int getLoanId() {
		return loanId;
	}

	public String getLoanName() {
		return loanName;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public void setLoanName(String loanName) {
		this.loanName = loanName;
	}
	
}
