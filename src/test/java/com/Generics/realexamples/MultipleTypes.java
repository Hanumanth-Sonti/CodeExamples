package com.Generics.realexamples;

public class MultipleTypes<T,X> {
	public T one;
	public X two;
	
	public MultipleTypes(T one,X two){
		this.one = one;
		this.two = two;
	} //constructor
	
	public T getT(){
		return one;
	}
	
	public X getX(){
		return two;
	}
	
	public static void main(String[] args) {		
		MultipleTypes<String,Integer> useTwo = new MultipleTypes<String,Integer>("foo",42);
		String t = useTwo.getT();
		int i = useTwo.getX();
		System.out.println(t);
		System.out.println(i);		
	}

}
