package com.toni.springrest.Controllers;

import java.util.concurrent.atomic.AtomicLong;

import com.toni.springrest.Models.Person;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    
    
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/person")
	public Person person(@RequestParam(value = "name", defaultValue = "Antonio") String name) {
		return new Person(counter.incrementAndGet(), name+" Olvera", 25);
	}

}
