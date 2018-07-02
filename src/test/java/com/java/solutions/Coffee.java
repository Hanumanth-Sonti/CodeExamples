package com.java.solutions;

public class Coffee {
		
    enum CoffeeSize{ BIG(8),HUGE(16),OVERWHELMING(24);
    	private int ounces;

		CoffeeSize(int ounces){
    	   this.ounces = ounces;    	
    	}    
		
		public int getOunces(){
	    	return ounces;
	    }		
    }; 
    
    CoffeeSize size;
    public static void main(String[] args) {
	 /*Coffee drink1 = new Coffee();
	 drink1.size = CoffeeSize.BIG;
	 System.out.print(drink1.size+"\n");	 
	 
	 Coffee drink2 = new Coffee();
	 drink2.size = CoffeeSize.HUGE;
	 System.out.print(drink2.size+"\n");	
	 
	 Coffee drink3 = new Coffee();
	 drink3.size = CoffeeSize.OVERWHELMING;
	 System.out.print(drink3.size+"\n");	*/
	 
	 for(CoffeeSize size:CoffeeSize.values()){
		 System.out.print(size+"\n");	
	 }
	 
	 

	}

}
