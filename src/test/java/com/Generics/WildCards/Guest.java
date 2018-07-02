package com.Generics.WildCards;

public class Guest {
		
	public static void main(String[] args) {
		Tray t = new Tray();
		t.add1(new Glass<String>());
		t.add(new Glass<Juice>());		
		//invalid t.add(new Glass<Object>());		
		
		//Upper Bound Wild Card - sub type
		//Any sub type can be passed after declaring upper Bound wild Card	
		//Will keep code open for extension to support any new types added to type hierarchy
		NewTray t1 = new NewTray();
		t1.newadd(new Glass<Juice>());
		t1.newadd(new Glass<OrangeJuice>());
		t1.newadd(new Glass<AppleJuice>());
		
		//Invalid - Super type can't be passed after declaring upper bound wild card
		//t1.newadd(new Glass<Liquid>());
		
		//Lower Bound Wild Card - Super Type 
		//CLose the code to support any new types in hierarchy and 
		//restrict the types currently present
		NewTray1 t2 = new NewTray1();
		t2.remove(new Glass<CokeZero>());
		t2.remove(new Glass<CokeDiet>());
		t2.remove(new Glass<Coke>());
	}

}
