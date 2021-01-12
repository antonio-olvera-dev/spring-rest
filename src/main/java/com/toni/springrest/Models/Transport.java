package com.toni.springrest.Models;

public class Transport {
    
    private final long id;
    private final String name;
    private final String wheel;
    private final String weight;

	public Transport(long id, String name, String wheel, String weight) {
		this.id = id;
        this.name = name;
        this.wheel =  wheel;
        this.weight = weight;
	}

	public long getId() {
		return id;
	}

	public String getname() {
		return name;
    }

    public String getwheel() {
		return wheel;
    }
    
    public String getweight() {
		return weight;
	}

}
