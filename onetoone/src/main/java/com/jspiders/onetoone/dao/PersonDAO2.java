package com.jspiders.onetoone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.onetoone.dto.AdharCard;
import com.jspiders.onetoone.dto.Person;

public class PersonDAO2 {

    private static	EntityManagerFactory entityManagerFactory;
    private static  EntityManager entityManager;
    private static  EntityTransaction entityTransaction;
    
    
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
    	
    	Person person = entityManager.find(Person.class, 2);
    	entityManager.remove(person);
    	
    	AdharCard adharCard = entityManager.find(AdharCard.class, 2);
    	entityManager.remove(adharCard);
        
    	
    	entityTransaction.commit();
    	closeConnection();
	}
}
