package com.java.solutions;

public class BubbleSort {
	
	public static int[] bubbleSort(int[] arr,int n){
		int temp = 0;
		for(int i=1;i<n;i++){  //number of passes
			for(int j=1;j<n;j++){ //number of iterations
				if(arr[j-1]>arr[j]){ //either j > j+1 or j-1 and j
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;								
				}				
			}
			
		}		
		return arr;
	}

	public static void main(String[] args) {
	/*	int[] arr = new int[7];
		arr[0] = 1;
		arr[1] = 5;
		arr[2] = 2;
		arr[3] = 10;
		arr[4] = 6;
		arr[5] = 20;	*/
		int[] nums = {1,5,4,2,17,11,3};
		int[] arr = bubbleSort(nums,7);
		for(int i=0;i<arr.length;i++){
			int element = arr[i];
			System.out.println(element);
		}
		
	}

}
