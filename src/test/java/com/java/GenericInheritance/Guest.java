package com.java.GenericInheritance;

public class Guest {	
	 public static void main(String[] args) {
		
		Juice juice = new Juice();
		Water water = new Water();
		Bartender bartender = new Bartender();
			
		bartender.mix1(juice,water); //Type inference		
		bartender.<Juice,Water>mix2(juice,water);  
		
		Glass3<Juice> newGlass = new WineGlass<Juice>();		
		
		Glass<OrangeJuice> g = new Glass<OrangeJuice>();	
		
		Glass2<OrangeJuice> gl = new Glass2<OrangeJuice>();
		
		Tray t = new Tray();
		t.add(new Coke<String>());
		
		
	 }
}
