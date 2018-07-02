package com.java.GenericMethods;

public class Guest {
	
	//
	public static void main(String[] args) {
		Glass<Juice> g = new Glass<Juice>(); //mention the type in angular brackets
		Juice juice = new Juice();
		g.liquid = juice;
		
		//retrieve object
		//Juice j = (Juice) g.liquid; 		//explicit Casting needed if non generic		
	    Juice j = new Juice();
	    g.liquid = j;
	    
	    Glass<Water> waterGlass = new Glass(); //type inference.also can be declared without explicit declaration
	    Water water = new Water();
	    waterGlass.liquid = water;
	    water = waterGlass.liquid;	    
	    
	    Colour<Red,Green,Blue> colour = new Colour<Red,Green,Blue>();
	    Bartender bartender = new Bartender();
	    bartender.mix(juice, water);
	    
		
	}

}
