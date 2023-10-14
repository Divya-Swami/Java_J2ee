package com.jspiders.designpatterns.structural;

public  class Adapter extends Employee implements Event{
	
	@Override
	public void womensDay(Adapter adapter) {
		adapter.setId(2);
		adapter.setName("DIvya");
		adapter.setEmail("dib12@gamil.com");
		System.out.println("Chife guest for womens day is "+adapter.getName()+" "+adapter.getId()+" "+adapter.getEmail());
	}
	
	@Override
	public void mensDay(Adapter adapter) {
		adapter.setId(25);
		adapter.setName("Dube");
		adapter.setEmail("dube12@gamil.com");
		System.out.println("Chife guest for mens day is "+adapter.getName()+adapter.getId());
	}
	
	

}
