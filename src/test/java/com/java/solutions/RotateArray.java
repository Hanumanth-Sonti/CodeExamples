package com.java.solutions;

public class RotateArray {

	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		int[][] newArr = new int[2][3];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		
		//Rotate by 90 degress
		for(int i=0;i<arr[0].length;i++){
			for(int j=arr.length-1;j>=0;j--){
				//newArr[i][j] = arr[j][i];
				System.out.println(arr[j][i]);
			}
		}
		
		/*//Reverse Order
		for(int i=0;i<=arr.length;i++){
			for(int j=arr.length-1;j>=0;j--){				
				// newArr[i][j] = arr[j][i];
				 System.out.println(arr[j][i]);			
				
			}
		}
		*/
		
		

	}

}
