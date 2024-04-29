package com.rsg.interfaces;

public class Case2Impl implements Case2Right, Case2Left {
	
	@Override 
	public void m1() {
		System.out.println("m1 from case2 right");
	}
	
	@Override
	public void m1(int i) {
		System.out.println("m1 form case2 left with value "+i);
	}

	
	public static void main(String[] args) {
		Case2Impl case2Impl = new Case2Impl();
		
		case2Impl.m1();
		
		case2Impl.m1(100);
		
		Case2Right right = new Case2Impl();
		
		right.m1();
		
		Case2Left left = new Case2Impl();
		
		left.m1(100);
	}
}
