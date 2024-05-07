package com.rsg.oops;

public class ParentChildClient {

	public static void main(String[] args) {
		
		//case 1
		Parent parent1 = new Parent();
		
		parent1.m1();
		
	//	parent1.m2();  // We can't access child property with parent object.
		
		//case 2
		
		Child child1 = new Child();
		
		child1.m2();
		child1.m1();
		
		//case 3
		
		Parent parent2 = new Child();
		
		parent2.m1();
		
	//	parent2.m2(); //not applicable 
		
		
		//case 4
		
	//	Child child2 = new Parent(); // not applicable
		

	}

}
