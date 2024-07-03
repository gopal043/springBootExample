package com.springboot.springbootthymeleafviewexample;

public class User {

	String name;    
	String email;
	
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + "]";
	}    
}
