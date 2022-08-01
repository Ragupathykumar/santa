package org.over;

public class OverrideB extends OverrideA {
	public void UG() {
		System.out.println("ug");
		
	}
	public void PG() {
		System.out.println("pg");
	}
	public static void main(String[] args) {
		OverrideB R =new OverrideB();
		OverrideA RR= new OverrideA();
		R.UG();
		R.UG();
		RR.PG();
	
		
	}
	







}
