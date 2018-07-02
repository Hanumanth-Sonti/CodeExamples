package com.java.solutions;

import java.util.Scanner;

public class ScanIt {

	public static void main(String[] args) {
		System.out.flush();
		try{
			@SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);
			String token;
			do{
				token = s.findInLine(args[0]);
				System.out.println("found:"+token);
			}while(token!=null);
		}catch(Exception e){
			
		}

	}

}
