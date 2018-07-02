package com.Generics.WildCards;

import java.util.ArrayList;
import java.util.List;

public class Animal {
	
	public static void main(String[] args) {
		List<Animal> animal = new ArrayList<Animal>();
		animal.add(new Dog());
		animal.add(new Cat());
		
	}
	
	

}
