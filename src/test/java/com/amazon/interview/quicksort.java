package com.amazon.interview;

import java.util.Arrays;
import java.util.List;

public class quicksort {
	
	/*public static List<T> twoDArrayToList(List<T> list) {
	   // List<T> list = new ArrayList<T>();
	    for (T[] array : appointments) {
	        list.addAll(Arrays.asList(array));
	    }		
	    return list;
	}*/
	
	 public static void quicksort(int[] array){
		 quicksort(array,0,array.length-1);
	 }
	 
	 public static void quicksort(int[]array,int left,int right){
		 int pivot = array[(left+right)/2];
		 int index = partition(array,left,right,pivot);
		 quicksort(array,left,index-1);
		 quicksort(array,index,right);
	 }
	 
	 public static int partition(int[]array,int left,int right,int pivot){
		 while(left<=right){
				 while(array[left] < pivot){
					 left++;
				 }
				 while(array[left] > pivot){
					 right--;
				 }
			 
				 while(left <= right){
					// swap(array,left,right);
					 left++;
					 right--;
				 }			 
			   }
		       return left;
	 }
	 
	
	
	public static void main(String[] args) {
		 int[][] appts = { {1,5},{3,7},{2,6},{10,15},{5,6},{4,100}};
		 List list = Arrays.asList(appts);
		
		 
		 
		
		 
		/* List<Integer> list = new ArrayList<Integer>();
		 for(int y=0;y<appts.length;y++){
			 for(int x=0;x<appts[y].length;x++){
				 list.add(x, y);
			 }
		 }
		 
	    for(int i=0;i<list.size();i++){
	    	System.out.println(list.get(i));
	    }
	*/
		 
		// twoDArrayToList(appointments);
		//findConflicts(appts);
	}

}
