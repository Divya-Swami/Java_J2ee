package com.jspiders.designpatterns.creational;

public class Contact {
 
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
	private long mobileNumber;
	private long landlineNumber;
	private String address;
	private String gender;
	private int age;
	private String dateOfBirth;
	
	
	public Contact(String firstName,String middleName,String lastName,
			String email,long mobileNumber,long landlineNumber,
			String address,String gender,int age,String dateOfBirth) {
		
		super();
		this.firstName=firstName;
		this.middleName=middleName;
		this.lastName=lastName;
		this.email=email;
		this.mobileNumber=mobileNumber;
		this.landlineNumber=landlineNumber;
		this.address=address;
		this.gender=gender;
		this.age=age;
		this.dateOfBirth=dateOfBirth;
		
	}
	
	@Override
	
	public String toString() {
		return "ContactInfo [FirstName : "+firstName+" ,MiddleName : "+middleName+
				" ,LastName : "+lastName+" ,Email : "+email+" ,MobileNumber : "+mobileNumber+
				" ,LandlineNumber : "+landlineNumber+" ,Address : "+address+" ,Gender : "+gender+" ,Age : "+age+" ,DateOfBirth : "+dateOfBirth;
				
	}
	
}
