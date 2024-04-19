package com.rsg.accessmodifiers;

public class StaticOverloadingDemo {

	public static void main(String[] args) {
		System.out.println("main with String args");
		
		int[] a = {10,20,30};
		StaticOverloadingDemo.main(a);
	}
	
	
	public static void main(int[] i) {
		System.out.println("main withh int args");
	}

}
