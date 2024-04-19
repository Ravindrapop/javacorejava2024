package com.rsg.operators;

public class InstanceOfOperatorDemo1 {

	public static void main(String[] args) {
		
		
		Thread t1 = new Thread();
		
		System.out.println(t1 instanceof Thread);
		
		System.out.println(t1 instanceof Object);
		
		System.out.println(t1 instanceof Runnable);
		

	}

}
