package com.jspiders.manytoone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.manytoone.dto.Employee;

public class EmployeeDAO3 {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	
	private static void openConnection() {
		entityManagerFactory = Persistence.createEntityManagerFactory("employee1");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
	}
	
	private static void closeConnection() {
		if (entityManagerFactory != null) {
			entityManagerFactory.close();
		}
		if (entityManager != null) {
			entityManager.close();
		}
		if (entityTransaction != null) {
			if (entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		}
	}
	
public static void main(String[] args) {
		
		openConnection();
		entityTransaction.begin();
		
		 Employee employee = entityManager.find(Employee.class, 2);
		 if (employee != null) {
			 
			 entityManager.remove(employee);
			 System.out.println("object is delete successfully..");
		}else {
			 System.out.println("object is not pesesnt.");
		}
		
		 
		 
		
		entityTransaction.commit();
		closeConnection();
	}
}
