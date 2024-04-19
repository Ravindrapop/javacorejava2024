package com.rsg.operators;

public class EqualityOpeDemo2 {
	
	
	
	
	

	public static void main(String[] args) {
		
		Thread t1 = new Thread();
		
		Thread t2 = new Thread();
		
		System.out.println(t1==t2);
		
		System.out.println(t1!=t2);
		
		Thread t3 = null;
		
		
		System.out.println(t3==null);
		
		System.out.println(null==null);
		
		System.out.println(t1.equals(t2));
		
		
		String s1 = new String("Abhishek");
		
		String s2 = new String("Abhishek");
		
		System.out.println(s1==s2);
		
		
		
		
	}

}
