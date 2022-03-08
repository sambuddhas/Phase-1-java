package com.pack1;

public class TypeCasting {
// implict programming............................................................
	public static void main(String[] args) {
		System.out.println("\n");
		System.out.println("Implicit Type Casting");
		byte p = 12;
		System.out.println("byte value "+p);
		short q= p;
		System.out.println("Short value "+q);
		int r = p;
		System.out.println("Int value "+r);
		long s= r;
		System.out.println("Long value "+s);
		float t= s;
		System.out.println("float value "+t);
		double u= t;
		System.out.println("double value "+u);
	//Explicit program....................................................................
		System.out.println("\n");
		System.out.println("Explicit Type Casting");
		byte b=10;
		char ch= 'C';
		short num =500;
		int i = 500000;
		b = (byte)i;
		System.out.println("Byte value "+b);
		ch  = (char)i;
		System.out.println("char value "+ch);
		b = (byte) num;
		System.out.println("byte value "+b);
		num=(short)i;
		System.out.println("num value "+num);
	}

}