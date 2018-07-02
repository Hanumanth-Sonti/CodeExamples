package com.Generics.realexamples;

import java.util.List;

public class CarRental extends Rental_NonGeneric {
 
	//Non Generic
	public CarRental(int maxNum, List<Car> rentalPool) {
		super(maxNum, rentalPool);
	}
	
	public Car getRental(){
		return (Car) super.getRental();
	}
	
	public void returnRental(Car c){
		super.rentalRental(c);
	}
	
	public void returnRental(Object o){
		if(o instanceof Car){
			super.rentalRental(o);
		}else{
			System.out.println("Cannot add a non car");
		}
	}

}
