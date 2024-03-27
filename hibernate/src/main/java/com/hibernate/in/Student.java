package com.hibernate.in;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
// used to automatical mapping btn bean class and database table
@Table
//used to create table -> by default its name is same as bean class name 
// if u want to change the name by using @Table(name=" mention name here")
public class Student {

	@Id
	//used to define primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//used to set auto-increment
	@Column //optional
	private int id;
	@Column //optional
	private String name;
	@Column //optional
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
//default constructor
	public Student() {
	}
}
