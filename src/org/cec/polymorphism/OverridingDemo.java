package org.cec.polymorphism;

public class OverridingDemo {
	static  int a;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int c=10;
		Bank rbi=new Bank();

		System.out.println(rbi.getRateOfInterest());
//		Dynamic binding assigning child class object to parent class reference variable.
		rbi = new SBI();
		System.out.println(rbi.getRateOfInterest());

		rbi = new ICICI();
		System.out.println(rbi.getRateOfInterest());
		
		System.out.println(c);

	}
	
	void m1() {
		int b=10;
		System.out.println(b);

	}

}
