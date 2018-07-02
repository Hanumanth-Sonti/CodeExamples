package com.java.solutions;

public class IntersectStrings {
	public static String IntersectStrings(String s1,String s2){
		String s ="";
		//s= s2;
		for(char c:s1.toCharArray()){
			if(s1.indexOf(c)!=-1 && s.indexOf(c)==-1){
				s+=c;				
			}
		}
		return s;
	}

	public static void main(String[] args) {
		System.out.println(IntersectStrings("Union","Union"));
	}

}
