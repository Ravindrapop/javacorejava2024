package com.rsg.interfaces;

public class InterfaceDemoImpl1 implements InterfDemo1{

	@Override
	public void m1() {
		System.out.println("m1 method from InterfaceDemoImpl1");
	}
	
	public static void main(String[] args) {
		InterfaceDemoImpl1 idi = new InterfaceDemoImpl1();
		
		idi.m1();
	}
}
