package com.graymatter.services;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.graymatter.entities.Person;

public interface PersonServiceInterface {

	public ResponseEntity<?> getAllPersons();
	
	public ResponseEntity<?> addPerson(Person person);
	
	public void deletePerson(long id);
	
	public Person updatePerson(Person person);

	Optional<Person> getPersonById(long id);
}
