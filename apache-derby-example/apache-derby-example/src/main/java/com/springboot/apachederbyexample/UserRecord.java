package com.springboot.apachederbyexample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER_RECORD")
public class UserRecord {

	@Id
	@Column(name="ID")
	private int id;   
	@Column(name="NAME")
	private String name;
	@Column(name="EMAIL")
	private String email;
	
	public UserRecord() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserRecord(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserRecord [id=" + id + ", name=" + name + ", email=" + email + "]";
	}  
	
}
