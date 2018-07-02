package com.java.solutions;

public class UnionStrings {
	
	public static String union(String s1,String s2)
	{
		String s = (s1 +" "+ s2);
		int i = 0;
		while(i<s.length()){
			char c = s.charAt(i);
			if(i!=s.lastIndexOf(c)) 
				s = s.substring(0,i) + s.substring(i+1,s.length());
		    else 
		    	i++;			
		}
		return s;		
	}

	public static void main(String[] args) {
		System.out.println(union("Ruby","Wilson"));
	}

}
