package com.rsg.oops;

public class Child extends Parent {
	
	public void m2() {
		System.out.println("m2 from child");
	}
	
	@Override
	public void m1() {
		System.out.println("m1 from child");
	}

}
