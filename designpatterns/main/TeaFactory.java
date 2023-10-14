package com.jspiders.designpatterns.main;
import  com.jspiders.designpatterns.creational.BlackTea;
import  com.jspiders.designpatterns.creational.GreenTea;
import  com.jspiders.designpatterns.creational.ICETea;
import  com.jspiders.designpatterns.creational.NormalTea;
import com.jspiders.designpatterns.creational.Baverage;
import java.util.Scanner;

public class TeaFactory {

	private static Baverage baverage;
	
	public static void main(String[] args) {
		try {
			factory().order();
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
	}
	
	public static Baverage factory() {
		System.out.println("Select tea to order");
		System.out.println("1. Normal Tea \n"+"2. Black Tea \n"+"3. Green Tea \n"+"4. ICE Tea");
		
		Scanner scanner = new Scanner(System.in);
		int choice =scanner.nextInt();
		
		scanner.close();
		
		switch(choice) {
		
		case 1:
			   baverage = new NormalTea();
			   break;
		
		
	    case 2:
		        baverage = new BlackTea();
		         break;
	    
	
        case 3:
	           baverage = new GreenTea();
	           break;

        case 4:
	           baverage = new ICETea();
	           break;
	    
	    default : 
	    	    System.out.println("Invalid choice");
	    	    System.out.println("Tea is not Orderd");
	          
     }
		return baverage;
}
	
	
}
