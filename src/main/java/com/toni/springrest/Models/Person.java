package com.toni.springrest.Models;

public class Person {
    private final long id;
    private final String name;
    private final int age;

	public Person(long id, String name, int age) {
		this.id = id;
        this.name = name;
        this.age =  age;
	}

	public long getId() {
		return id;
	}

	public String getname() {
		return name;
    }
    public int getage() {
		return age;
	}
}
