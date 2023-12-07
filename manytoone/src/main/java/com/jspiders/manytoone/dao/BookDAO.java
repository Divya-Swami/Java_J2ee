package com.jspiders.manytoone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.manytoone.dto.Author;
import com.jspiders.manytoone.dto.Book;

public class BookDAO {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction  entityTransaction;
	
	
	private static void openConnection() {
		entityManagerFactory=Persistence.createEntityManagerFactory("employee1");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
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
		
		Author author = new Author();
		author.setName("sane guruji");
		author.setAge(89);
		entityManager.persist(author);
		
		Book book1 = new Book();
		book1.setName("shamChi aai");
		book1.setPrice(12000);
		book1.setAuthor(author);
		entityManager.persist(book1);
		
		
		Book book2 = new Book();
		book2.setName("Shamachi shala");
		book2.setPrice(2300);
		book2.setAuthor(author);
		entityManager.persist(book2);
		
		
		
		
		entityTransaction.commit();
		closeConnection();
	}
}
