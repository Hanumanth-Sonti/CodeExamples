package com.java.solutions;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_example {
	public static void main(String[] args) {
		List<String> linked_list = new LinkedList<String>();
		linked_list.add("apples");
		linked_list.add("grapes");
		linked_list.add("bananas");
		Iterator<String> iter = linked_list.iterator();
		while(iter.hasNext()){
			System.out.println("Element: "+iter.next());			
		}
		Collections.sort(linked_list);
		System.out.println(linked_list);
	}
}
