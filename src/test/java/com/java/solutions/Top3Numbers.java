package com.java.solutions;

import java.util.Scanner;

public class Top3Numbers {

	public static void firstThreeNumbers(int[] arr){
		int first=0;
		int second=0;
		int third=0;		
		for(int i=0;i<arr.length;i++){
			if(arr[i] > first){
				third = second;
				second = first;				
				first = arr[i];
			}else if(arr[i]>second){
				third = second;
				second = arr[i];
			}else if(arr[i]>third){
				third = arr[i];
			}			
		}		
		System.out.println("First:" +first);
		System.out.println("Second:" +second);
		System.out.println("Third:" +third);
	}
		
	public static void main(String[] args) {
		int total = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many number you want? ");
		total = sc.nextInt();
		int[] arr = new int[total];
		for(int i=0;i<total;i++){
			System.out.println("Enter no:" +(i + 1));
			arr[i] = sc.nextInt();
		}
		
		firstThreeNumbers(arr);

	}

}
