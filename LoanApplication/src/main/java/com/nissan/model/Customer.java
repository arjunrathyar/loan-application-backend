package com.nissan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;

	private String customerName;
	private long phoneNumber; 
	private String address;

	private int loanOfficerId;
	@OneToOne
	@JoinColumn(name = "loanOfficerId", insertable = false, updatable = false)
	private LoanOfficer loanOfficer;

	private int loanId;
	@OneToOne
	@JoinColumn(name = "loanId", insertable = false, updatable = false)
	private Loan loan;
	
	
//	private int loanId;
//	@OneToMany(mappedBy="customer")
//	@JoinColumn(name = "loanId", insertable = false, updatable = false)
//	private List<Loan> loan;

	private int statusId;
	@OneToOne
	@JoinColumn(name = "statusId", insertable = false, updatable = false)
	private Status status;
	
	private boolean active = true;
	
	private String feedback;

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public int getLoanOfficerId() {
		return loanOfficerId;
	}

	public LoanOfficer getLoanOfficer() {
		return loanOfficer;
	}

	public int getLoanId() {
		return loanId;
	}

//	public List<Loan> getLoan() {
//		return loan;
//	}

	public int getStatusId() {
		return statusId;
	}

	public Status getStatus() {
		return status;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setLoanOfficerId(int loanOfficerId) {
		this.loanOfficerId = loanOfficerId;
	}

	public void setLoanOfficer(LoanOfficer loanOfficer) {
		this.loanOfficer = loanOfficer;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

//	public void setLoan(List<Loan> loan) {
//		this.loan = loan;
//	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public boolean isActive() {
		return active; 
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
