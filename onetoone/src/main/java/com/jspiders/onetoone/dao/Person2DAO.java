package com.jspiders.onetoone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.onetoone.dto.PanCard;
import com.jspiders.onetoone.dto.Person2;

public class Person2DAO {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	
	
	private static void openConnection() {
		entityManagerFactory = Persistence.createEntityManagerFactory("person");
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
		
		PanCard panCard = new PanCard();
	    panCard.setPanNumber(1234543221);
	    entityManager.persist(panCard);
	    
	    Person2 person = new Person2();
	    person.setName("DIVYA");
	    person.setEmail("dm@gmail.com");
	    person.setPanCard(panCard);
	    entityManager.persist(person);
		
		entityTransaction.commit();
		closeConnection();
	}
}
