package com.rsg.oops;

public class Test {
	
	public static void main(String[] args) {
		
		
		Student s1 = new Student(101, "Ashish");
		
		s1.setId(111);
		
		System.out.println(s1.getId()+" "+s1.getName());
		
		Student s2 = new Student();
		
		s2.setId(102);
		s2.setName("Bhavya");
		
		System.out.println(s2.getId()+" "+s2.getName());
		
		
		Object obj = new Object();
		
		
		System.out.println(10);
		
		
		
	}

}
