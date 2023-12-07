package com.jspiders.manytomany.dao;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.manytomany.dto.Customer;
import com.jspiders.manytomany.dto.Product;

public class CustomerDAO {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	
	private static void openConnection() {
		entityManagerFactory = Persistence.createEntityManagerFactory("student");
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
		
		Product product1 = new Product();
		product1.setName("shampoo");
		product1.setPrice(2);
		
		
		Product product2 = new Product();
		product2.setName("tel");
		product2.setPrice(10);
		
		
		Customer customer1 = new Customer();
		customer1.setName("jay");
		customer1.setAdress("nigadi");
		customer1.setProducts(Arrays.asList(product1,product2));
		entityManager.persist(customer1);
		
		
		Customer customer2= new Customer();
		customer2.setName("riva");
		customer2.setAdress("Talawade");
		customer2.setProducts(Arrays.asList(product1,product2));
		entityManager.persist(customer2);
		
		
		
		
		
		entityTransaction.commit();
		closeConnection();
	}
}
