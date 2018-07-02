package com.java.solutions;

public class Factorial {

	public static void main(String[] args) {
		int n = 5;
		int fact = 1;
		while( n>0){
			fact = fact * n;
			n--;
		}
	    System.out.println(fact);
	    
	    for(int i=1;i<=n;i++){
	    	fact = fact * i;
	    }
	    System.out.println(fact);

	}

}
