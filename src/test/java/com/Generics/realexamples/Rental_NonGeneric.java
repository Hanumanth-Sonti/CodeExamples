package com.Generics.realexamples;

import java.util.List;

public class Rental_NonGeneric {
   private List rentalPool;
   private int maxNum;
   
   public Rental_NonGeneric(int maxNum, List<Car> rentalPool){
	   this.maxNum = maxNum;
	   this.rentalPool = rentalPool;
   } //constructor
   
   public Object getRental(){
	   return rentalPool.get(0);
   }
   
   public void rentalRental(Object o){
	   rentalPool.add(o);
   }   
}
