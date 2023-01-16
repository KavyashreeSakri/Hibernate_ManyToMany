package many_to_many_uni_personlanguage.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import many_to_many_uni_personlanguage.dto.Language;
import many_to_many_uni_personlanguage.dto.Person;
import net.bytebuddy.implementation.bytecode.Addition;

public class PersonLanguageMain {

	public static void main(String[] args) {
		Language language1= new Language();
		language1.setId(104);
		language1.setName("kannada");
		language1.setOrigin("Karnataka");
		language1.setCountry("India");
		
		Language language2= new Language();
		language2.setId(105);
		language2.setName("English");
		language2.setOrigin("Abc");
		language2.setCountry("America");
		
		Language language3= new Language();
		language3.setId(106);
		language3.setName("Hindi");
		language3.setOrigin("XYZ");
		language3.setCountry("Pakistan");
		
		
		List<Language> list1= new ArrayList<Language>();
		list1.add(language1);
		list1.add(language2);
		
		List<Language> list2= new ArrayList<Language>();
		list2.add(language1);
		list2.add(language3);
		
		List<Language> list3= new ArrayList<Language>();
		list3.add(language2);
		list3.add(language3);
		
		Person person1= new Person();
		person1.setId(4);
		person1.setName("Kavya");
		person1.setAddress("Dvg");
		person1.setPhone(7019804801l);
		
		Person person2= new Person();
		person2.setId(5);
		person2.setName("Kanasu");
		person2.setAddress("Hospete");
		person2.setPhone(74801);
		
		Person person3= new Person();
		person3.setId(6);
		person3.setName("Shraavan");
		person3.setAddress("Bangalore");
		person3.setPhone(701980);
		
		person1.setList(list1);
		person2.setList(list2);
		person3.setList(list3);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(language1);
		entityManager.persist(language2);
		entityManager.persist(language3);
		entityManager.persist(person1);
		entityManager.persist(person2);
		entityManager.persist(person3);
		entityTransaction.commit();
		System.out.println("Saved successfully");

	}

}
