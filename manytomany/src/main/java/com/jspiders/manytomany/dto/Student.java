package com.jspiders.manytomany.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable=false)
	private String name;
	
	@Column(nullable=false,unique=true)
	private String email;
	
	
	private  int age;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	private List<Course>courses;


	public List<Course> getCourses() {
		return courses;
	}


	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}


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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + ", courses=" + courses
				+ "]";
	}
	
	

}
