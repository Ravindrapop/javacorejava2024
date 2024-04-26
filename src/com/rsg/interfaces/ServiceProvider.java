package com.rsg.interfaces;

public class ServiceProvider implements Interf{
	
	
	@Override
	public void m1() {
		System.out.println("m1 form service provider");
	}
	
	@Override
	public void m2() {
		System.out.println("m2 from service provider");
	}
	
	
	public static void main(String[] args) {
		ServiceProvider sp = new ServiceProvider();
		
		sp.m1();
		sp.m2();
		
		int x = 888;
		
		System.out.println(x);
		
		System.out.println(Interf.x);
	}

}
