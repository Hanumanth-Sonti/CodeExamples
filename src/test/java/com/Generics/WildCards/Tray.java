package com.Generics.WildCards;

//Bounded Wild Cards
public class Tray {
	public Glass<?> a; //declaration allowed
	
	//Non Generic - Access only only Type argument type
	public void add(Glass<Juice> juiceGlass){
		
	}
	
	public void add1(Glass<?> newGlass){
		Glass<?> x; //declaration allowed
	}
	
	/*//Bounded Type Parameter	
	public class Glass<T>{
		
	}
   */
	
	
	
	
	
}
