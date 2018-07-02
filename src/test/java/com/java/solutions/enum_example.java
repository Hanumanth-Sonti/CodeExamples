package com.java.solutions;

enum CoffeeSize{ BIG,HUGE,OVERWHELMING} //can be declared inside or outside of class but not in a method

public class enum_example {
	
	CoffeeSize size;
	
	public static void main(String[] args) {
	 enum_example drink1 = new enum_example();
	 drink1.size = CoffeeSize.BIG;
	 System.out.print("Drink1:"+drink1.size+"\n");
	 enum_example drink2 = new enum_example();
	 drink2.size = CoffeeSize.HUGE;
	 System.out.print("Drink2:"+drink2.size+"\n");
	 enum_example drink3 = new enum_example();
	 drink3.size = CoffeeSize.OVERWHELMING;
	 System.out.print("Drink3:"+drink3.size+"\n");
	}

}
