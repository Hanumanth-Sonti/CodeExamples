package com.java.solutions;

import java.util.HashSet;
import java.util.Set;

public class Set_Collection {

	public static void main(String[] args) {
		Set setA = new HashSet();
		String element = "element1";
		setA.add(element);
		boolean flag = setA.contains(element);
		System.out.println("flag: "+flag);

	}

}
