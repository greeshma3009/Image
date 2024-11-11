package com.ty;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePerson {
	public static void main(String[] args) throws IOException {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	Person person=new Person();
	person.setName("Rohith");
	person.setAge(45);
	person.setGender("male");
	person.setPhno(9876543210l);
	person.setAddDate(new Date());
	FileInputStream fis=new FileInputStream("src/main/java/rohith.jpg");
			byte[] data =new byte[fis.available()];
			fis.read(data);
			person.setImage(data);
  entityTransaction.begin();
  entityManager.persist(person);
  entityTransaction.commit();
			
			
	}
}
