package com.rsg.interfaces;

public class MyClass implements MyInterface{
	
	
	@Override
	public void wish() {
		System.out.println("Hi good morning all!!!");
	}
	
	
	
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		
		myClass.wish();
	}

}
