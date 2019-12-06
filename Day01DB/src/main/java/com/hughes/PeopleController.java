package com.hughes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PeopleController {

	@Autowired
	private PersonDao personDao;
	
	@GetMapping("/")
	public List<Person> getAllPersons() {
		return (List<Person>)personDao.findAll();
	}
	
	@DeleteMapping("/{id}")
	public String deletePerson(@PathVariable int id) {
		Optional<Person> opt = personDao.findById(id);
		if(opt.isPresent()) {
			Person person = opt.get();
			personDao.delete(person);
			return "Person with id " + id + " deleted";
		}
		return "Person with id " + id + " is not present"; 
	}
	
	@PutMapping("/{id}/{age}")
	public String updateAge(@PathVariable int id, @PathVariable int age) {
		Optional<Person> opt = personDao.findById(id);
		if(opt.isPresent()) {
			Person person = opt.get();
			person.setAge(age);
			personDao.save(person);
			return "Person's age updated";
		}
		return "Person with id " + id + " is not present"; 
	}
	
	
	@PostMapping("/{name}/{age}")
	public String savePerson(@PathVariable String name, @PathVariable int age) {
		Person person = new Person();
		person.setName(name);
		person.setAge(age);
		personDao.save(person);
		return "Person created with id: " + person.getId();
	}
	
}




;