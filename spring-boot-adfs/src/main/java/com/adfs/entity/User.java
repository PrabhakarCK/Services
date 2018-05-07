package com.adfs.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Pkalashetty
 *
 */
@Entity
@Table(name = "tbl_User")
public class User extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8800645875427836831L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userid")
	private int userId;
	@Column(name = "CDSID")
	private String cdsid;

	@Column(name = "startdate")
	private Date startDate;
	@Column(name = "enddate")
	private Date endDate;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getCdsid() {
		return cdsid;
	}

	public void setCdsid(String cdsid) {
		this.cdsid = cdsid;
	}

}
