package com.jspiders.cardekho_case_study.main;

import java.util.Scanner;

import com.jspiders.cardekho_case_study.operation.CarOperation;
public class CarDekhoMenu{

    public static void main(String [] args) {
    
    	CarOperation carOperation = new CarOperation();
        Scanner scanner = new Scanner(System.in);
       
       boolean manu=true;

        
             
        while(manu)
           {
        	mainManu();
           
            
            
            System.out.print("Enter your choice: ");
           int  choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    carOperation.viewCarDetails();
                    break;
                case 2:
                    carOperation.addCar(scanner);
                    break;
                case 3:
                    carOperation.searchCar(scanner);
                    break;
               
                case 4:
                    System.out.println("Exiting the program...");
                    System.out.println(".........Thank You............");
                    manu=false;
                    
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }}
            
    }
    
    public static void mainManu() {
		System.out.println("");
		System.out.println("----------------------Menu-------------------------");
		System.out.println("\t1.viewCarDetails");
		System.out.println("\t2.Add Car Details");
		System.out.println("\t3.Search  Car Details");
		System.out.println("\t4.Exit");
		
		
	
    
}
}
