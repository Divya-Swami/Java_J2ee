package com.jspiders.cardekho_case_study.operation;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarOperation {
    private List<String> cars = new ArrayList<>();
   
    
     public void addCar(Scanner scanner) {
        System.out.print("How many cars do you want to add? ");
        int count = scanner.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter Car ID:");
            int carId = scanner.nextInt();
            System.out.print("Enter Car Name:");
            String carName = scanner.next();
            System.out.print("Enter Car Model:");
            String carModel = scanner.next();
            System.out.print("Enter Car Brand:");
            String carBrand = scanner.next();
            System.out.print("Enter Fuel Type:");
            String carFuel_Type = scanner.next();
            System.out.print("Enter Car price:");
            double carPrice = scanner.nextDouble();

            
            String carDetails = carId + "\t" + carName + "\t" + carModel + "\t" + carBrand + "\t" + carFuel_Type + "\t" + carPrice;
            cars.add(carDetails);

            System.out.println("Car added successfully.");
        }

        System.out.println("=============CAR MENU================");
        for (String car : cars) {
            System.out.println(car);
        }
     }
    


    public void searchCar(Scanner scanner) {
        if (cars.isEmpty()) {
            System.out.println("No cars available.");
        } else {
            System.out.println("Search by:");
            System.out.println("1. Name");
            System.out.println("2. ID");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) {
                case 1:
                    searchCarByName(scanner);
                    break;
                case 2:
                    searchCarByID(scanner);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private void searchCarByName(Scanner scanner) {
        System.out.print("Enter the car name to search: ");
        String carNameToSearch = scanner.nextLine();
        boolean carFound = false;
        for (String car : cars) {
            if (car.contains(carNameToSearch)) {
                System.out.println("Car found: " + car);
                carFound = true;
            }
        }
        if (!carFound) {
            System.out.println("Car not found.");
        }
    }

    private void searchCarByID(Scanner scanner) {
        System.out.print("Enter the car ID to search: ");
        String carIDToSearch = scanner.nextLine();
        boolean carFound = false;
        for (String car : cars) {
            
            String carID = car.split("-")[1];
            if (carID.equals(carIDToSearch)) {
                System.out.println("Car found: " + car);
                carFound = true;
            }
        }
        if (!carFound) {
            System.out.println("Car not found.");
        }
    }
    
    public void viewCarDetails() {
        if (cars.isEmpty()) {
            System.out.println("No cars available.");
        } else {
            System.out.println("Car Details:");
            for (String car : cars) {
                System.out.println(car);
            }
        }
    }
    
}



    
 


