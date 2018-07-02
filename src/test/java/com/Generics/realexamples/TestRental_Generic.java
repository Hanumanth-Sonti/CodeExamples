package com.Generics.realexamples;

import java.util.ArrayList;
import java.util.List;

public class TestRental_Generic {
	
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		List<Car> carList = new ArrayList<Car>();
		carList.add(c1);
		carList.add(c2);
		
		Rental_Generic<Car> carRental = new Rental_Generic<Car>(2, carList);
		Car carToRent = carRental.getRental();
		carRental.returnRental(carToRent);
		carList.add(new Car());
		
	}

}
