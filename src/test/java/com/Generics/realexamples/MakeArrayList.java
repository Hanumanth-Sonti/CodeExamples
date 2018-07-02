package com.Generics.realexamples;

import java.util.ArrayList;
import java.util.List;

public class MakeArrayList {
	
	public <T> void makeArray(T t){
		List list = new ArrayList<T>();
		list.add(t);
	}

}
