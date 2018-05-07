package com.adfs.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;


/**
 * @author Pkalashetty
 *
 */
@MappedSuperclass
public class BaseEntity {
	@Column(name = "changeby")
	private String changeBy;
	@Column(name = "changedate")
	private Date changeDate;

	public String getChangeBy() {
		return changeBy;
	}

	public void setChangeBy(String changeBy) {
		this.changeBy = changeBy;
	}

	public Date getChangeDate() {
		return changeDate;
	}

	public void setChangeDate(Date changeDate) {
		this.changeDate = changeDate;
	}

}
