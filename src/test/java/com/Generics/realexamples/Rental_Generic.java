package com.Generics.realexamples;

import java.util.List;

public class Rental_Generic<T> {
	private List<T> rentalPool;
	private int maxNum;
	
	public Rental_Generic(int maxNum,List<T> rentalPool)
	{
		this.maxNum = maxNum;
		this.rentalPool = rentalPool;
	}
	
	public T getRental(){
		return rentalPool.get(0);
	}
	
	public void returnRental(T returnSomeThing){
		rentalPool.add(returnSomeThing);
	}
	

}
