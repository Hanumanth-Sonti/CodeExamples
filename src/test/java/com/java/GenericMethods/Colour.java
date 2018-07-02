package com.java.GenericMethods;

public class Colour<R,G,B> {
	public Colour(){
		
	}
	
	public Colour(R red,G green,B blue){
		
	}
	
	public static void main(String[] args) {
		//Colour<Red,Green,Blue> colour = new Colour<Red,Green,Blue>();
		Red red = new Red();
		Green green = new Green();
		Blue blue = new Blue();
		Colour<Red,Green,Blue> colour = new Colour<>(red,green,blue); //Type inference using constructor
	}

}
