package com.java.GenericMethods;
import com.java.GenericClasses.*;

public class Bartender {
	
	//No need to declare Generics at class and use at method level
	//For variables - declare at class level
	//Method with return type
	public <J,W> Cocktail mix1(J j,W w){
		return new Cocktail();
	}
	
	public <J,W> void mix2(Juice J,Water W){
		
	}
	
	public static <J,W> void mix3(Juice J,Water W){
		
	}
	
	public<J,W> void mix(Juice J,Water W){
		
	}
	
	public static void main(String[] args) {
		Juice juice = new Juice();
		Water water = new Water();
		Bartender bartender = new Bartender();
		//Glass<Cocktail> cocktail = bartender.<Juice,Water>mix1(juice,water);
		bartender.mix2(juice, water); //method without type arguments
		Bartender.<Juice,Water>mix3(juice,water);// static method
		//bartender.<Juice,Water>mix(juice,water);
	}

}
