package com.jspiders.manytoone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.jspiders.manytoone.dto.Company;
import com.jspiders.manytoone.dto.Employee;

public class EmployeeDAO {

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
		
		Company company = new Company();
		
		company.setName("Sahil");
		company.setAddress("DangeChowk");
		
		entityManager.persist(company);
		
		
		Employee emp1 = new Employee();
		
		emp1.setName("Divya");
		emp1.setEmail("Div@email.com");
		emp1.setSalary(654322);
		
		emp1.setCompany(company);
		
		entityManager.persist(emp1);
		
		Employee emp2 = new Employee();
		
		emp2.setName("Son");
		emp2.setEmail("Son@gmail.com");
		emp2.setSalary(230000);
		
		emp2.setCompany(company);
		
		entityManager.persist(emp2);
		
		
		entityTransaction.commit();
		closeConnection();
	}
}
