package com.java.solutions;

import java.util.ArrayList;
import java.util.Collections;

public class Sort_Collection {

	public static void main(String[] args) {
		ArrayList<String> strValues = new ArrayList<String>();
		strValues.add("Denver");
		strValues.add("Boulder");
		strValues.add("Aspen");
		Collections.sort(strValues);
		System.out.print(strValues);

	}

}
