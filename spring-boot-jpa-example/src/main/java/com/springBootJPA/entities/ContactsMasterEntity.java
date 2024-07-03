package com.springBootJPA.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CONTACTS_MASTER")
public class ContactsMasterEntity {
    
	public ContactsMasterEntity(int contactid, String contactName, Long contactNumber) {
		super();
		this.contactid = contactid;
		this.contactName = contactName;
		this.contactNumber = contactNumber;
	}

	@Id
	@Column(name="CONTACT_ID")
	private int contactid;
	
	@Column(name="CONTACT_NAME")
	private String contactName;
	
	@Column(name="CONTACT_NUMBER")
	private Long contactNumber;

	public int getContactid() {
		return contactid;
	}

	public String getContactName() {
		return contactName;
	}

	public Long getContactNumber() {
		return contactNumber;
	}

	public void setContactid(int contactid) {
		this.contactid = contactid;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "ContactsMasterEntity [contactid=" + contactid + ", contactName=" + contactName + ", contactNumber="
				+ contactNumber + "]";
	}
	
	
}
