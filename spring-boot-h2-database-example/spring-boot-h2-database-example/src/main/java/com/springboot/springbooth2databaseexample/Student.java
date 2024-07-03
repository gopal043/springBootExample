package com.springboot.springbooth2databaseexample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String email, int age) {
		super();
		this.id = id;
		this.name = name;
		Email = email;
		this.age = age;
	}

	@Id
	@Column
	private int id;
	
	@Column
	private String name;

	@Column
	private String Email;
	
	@Column
	private int age;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return Email;
	}

	public int getAge() {
		return age;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Email=" + Email + ", age=" + age + "]";
	}
}
