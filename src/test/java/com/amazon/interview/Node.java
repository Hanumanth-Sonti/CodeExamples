package com.amazon.interview;

public class Node {
  Node left;
  Node right;
  int data;
  
	  public Node(int data)
	  {
		  this.data = data;
	  } //constructor
  
	  public void insert (int value){
		  if(value<=data){
			  if(left == null){
				  left = new Node(value);			  
			  }else{
				  left.insert(value);
				  System.out.println("left insert: "+value);
			  }
		   }else{
			   if(right == null){
				   right = new Node(value);
			   }else{
				   right.insert(value);
				   System.out.println("right insert: "+value);
			   }
		   }		  
		  
	 } //end of method insert
	  
	 public boolean contains(int value)
	 {
		 if( value == data){
			 return true;
		 }else if( value < data)
		 {
			 if(left == null){
				 return false;
			 }else{
				 return left.contains(value);
			}
		 }else
		 {
			 if(right == null)
			 {
			   return false;
			 } else
			 {
				 return right.contains(value);				 
		     }			 
		 }
		 
		 
	 } //end of method contains
	 
	 public void printInOrder(){
		 if(left!=null){
			 left.printInOrder();
		 }
		 System.out.println(data);
		 
		 if(right!=null){
			 right.printInOrder();
		 }
		 System.out.println(data);
	 }
	 
	 public static void main(String[] args) {
		 Node n = new Node(10);
		 n.insert (5);
		 n.insert (15);
		 boolean flag = false;
		 flag = n.contains(5);
		 System.out.println(flag);
		 flag = false;
		 flag = n.contains(15);
		 System.out.println(flag);
		//n.insert (8);		 
	}
}
