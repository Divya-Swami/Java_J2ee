
       
package com.jspiders.cardekho_case_study.entity;

import java.util.List;

import java.util.ArrayList;
public class Car {
	
       private int car_id;
       private String name;
       private String model;
       private String fuil_Type;
       private double price;
       
	public int getCar_id() {
		return car_id;
	}
	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getFuil_Type() {
		return fuil_Type;
	}
	public void setFuil_Type(String fuil_Type) {
		this.fuil_Type = fuil_Type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}