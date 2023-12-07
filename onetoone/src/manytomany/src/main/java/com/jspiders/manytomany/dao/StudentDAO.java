package com.jspiders.manytomany.dao;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.manytomany.dto.Student;
import com.jspiders.manytomany.dto.Course;

public class StudentDAO {

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
		
		Course course1 = new Course();
		course1.setName("sql");
		course1.setFees(10000);
		
		Course course2 = new Course();
		course2.setName("java");
		course2.setFees(12000);
		
		Course course3 = new Course();
		course3.setName("WebTech");
		course3.setFees(14000);
		
		Course course4 = new Course();
		course4.setName("J2ee");
		course4.setFees(20000);
		
		Student std1 = new Student();
		std1.setName("Divya");
		std1.setEmail("Div@gmail.com");
		std1.setAge(24);
		std1.setCourses(Arrays.asList(course2,course1));
		entityManager.persist(std1);
		
		Student std2 = new Student();
		std2.setName("Shiv");
		std2.setEmail("shiv@gmail.com");
		std2.setAge(22);
		std2.setCourses(Arrays.asList(course3,course4));
		entityManager.persist(std2);
		
		
		entityTransaction.commit();
		closeConnection();
	}
}
