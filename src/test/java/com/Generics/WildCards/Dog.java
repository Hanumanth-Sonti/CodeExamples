package com.Generics.WildCards;

import java.util.ArrayList;
import java.util.List;

public class Dog extends Animal {
	public static void main(String[] args) {
		//Valid Declarations
		List<? extends Animal> aList = new ArrayList<Dog>();
		List<? super Dog> bList = new ArrayList<Animal>();
		List<? super Cat> dList = new ArrayList<Dog>();
		
		/*Invalid declarations
		List<?> foo = new ArrayList(? extends Animal>());
		//Can't compile because wild card notation can't be used in object creation
		
		List<? extends Dog> cList = new ArrayList<Integer>();//Invalid 
		//can' assign Integer list to a reference that takes only Dog
		
		List<? super Animal> eList = new ArrayList<Dog>();
		//Dog is lower in hierarchy to Animal. Only <Animal> or <Object> are legal
		*/	
		
	}
	
}
