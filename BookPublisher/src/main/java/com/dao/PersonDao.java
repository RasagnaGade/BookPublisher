package com.dao;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Person;



public interface PersonDao extends JpaRepository<Person, Integer> {

	List<Person> findPersonInfoByFirstNameOrEmail(String fristName, String email);
	List<Person> findByLastName(String lastName);
	List<Person> findByFirstName(String firstName);
	
	@Query(value =  "select p from Person p where p.lastName = ?1")
	List<Person> findPersonByLastName(String lastName);
	
	List<Person> findByFirstNameOrLastName(String fristName, String lastName);
	List<Person> fetchByLastNameLength(long length);
}
