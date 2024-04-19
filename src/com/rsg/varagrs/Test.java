package com.rsg.varagrs;

public class Test {
	
	public void m1(String s) {
		System.out.println("String m1");
	}
	
	public void m1(StringBuffer sb) {
		System.out.println("StringBuffer sb");
	}
	

	public static void main(String[] args) {
		
		Test t1 = new Test();
	//	t1.m1(null);
		
	}

	
}
