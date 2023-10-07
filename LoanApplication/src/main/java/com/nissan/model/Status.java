package com.nissan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Status {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int statusId;

	private String statusName;

	public int getStatusId() {
		return statusId;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

}
