package com.rsg.accessmodifiers;

public class Student {
	
	private int id;
	private String name;
	
	public Student(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	
	
	public static void main(String[] args) {
		Student s1 = new Student(101, "Gaurav");
	}
}
