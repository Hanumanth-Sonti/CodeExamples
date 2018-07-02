package com.java.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Union_Intersect_Strings {
	public static void unionSet(String[]...strArray){
		HashSet<String> list = new HashSet<String>();
		for(String str:list){
			list.add(str);
			System.out.println(list);
		}
	}

	public static void main(String[] args) {
		/*List list1 = new ArrayList<String>(Arrays.asList("Ruby","John","Mike"));
		List list2 = new ArrayList<String>(Arrays.asList("Rick","Hen"));
		list1.addAll(list2);
		System.out.println(list1);
		System.out.println(list2);	
*/
		
		Set list1 = new HashSet<String>(Arrays.asList("Ruby","John","Mike"));
		Set list2 = new HashSet<String>(Arrays.asList("Rick","Hen"));
		list1.addAll(list2);
		System.out.println(list1);
		System.out.println(list2);
				
		
		
	}

}
