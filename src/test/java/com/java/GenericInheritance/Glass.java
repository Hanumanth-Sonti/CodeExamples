package com.java.GenericInheritance;

/*	//Bounded Types with interface
	public class Glass<T extends Liquid>
		{
		    public T liquid;
		
		public String getTaste(){
			return liquid.getTaste();
		}
	}*/

   //Bounded Types at method level
   /* class Glass<T>{
		private T liquid;
		
		public <U extends Juice> String mix(U juice){
			return juice.getTaste();		
		}		
   }*/

   class OrangeJuice extends Juice implements Fluid {
	   
   }
   class AppleJuice extends Juice {}
   
//Multiple Bounded Types 
  class Glass<T extends Juice & Fluid>   //Class & Interface..Class must be Concrete Subtype
  {
	  private T liquid;
	  
	  Glass<OrangeJuice> orangeJuice = new Glass<OrangeJuice>();
	  
	 //Invalid because Apple Juice does not implement Fluid interface
	  //Glass<AppleJuice> appleJuice = new Glass<AppleJuice>();
  }  
  
/*  //Bounded Types
  class Glass<T>{
	  private T liquid;
  }*/
 
  
 
	
  