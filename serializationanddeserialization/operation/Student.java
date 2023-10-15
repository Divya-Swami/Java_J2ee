package com.jspiders.serializationanddeserialization.operation;

import java.io.Serializable;

public class Student implements Serializable{

	private int id;
	private String name;
	private String email;
	private int age;
	private double fees;
	
	public Student(int id,String name,String email,int age,double fees) {
		
		this.id=id;
		this.name=name;
		this.email=email;
		this.age=age;
		this.fees=fees;
		
	}
	
	public String toString() {
		return " Student :- \n  id : "+id  +"\t\n Name : "+name+"\t\n Email : "+email+"\t\n Age : "+age+"\t\n Fees : "+fees;
	}
}
