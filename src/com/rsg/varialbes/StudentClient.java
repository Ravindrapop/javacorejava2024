package com.rsg.varialbes;

public class StudentClient {
	
	
	public static void main(String[] args) {
		
	Student s1 = new Student(101, "Chand");
	
	Student s2 = new Student(102,"Prem");
	
	
	System.out.println(s1.name);
	
	System.out.println(s1.rollNumber);
	
	System.out.println(s2.name);
	System.out.println(s2.rollNumber);
	
	
	System.out.println(Student.collegeName);
		
	}

}
