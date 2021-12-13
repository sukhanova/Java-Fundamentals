package com.itbulls.learnit.javacore.primitives;

public class PrimitiveTypes {
	
	public static void main(String[] args) {
		/*
		 * Java is a strongly typed language:
		 * - every variable has a type
		 * - every expression has a type 
		 * - each type is strictly defined 
		 * 
		 * Java Data Types are Primitive (store actual values) and Reference (store addresses of Objects they refer to)
		 * 
		 * Primitive: Integers, Floating-point numbers, Booleans, Characters
		 * Reference: Classes, Annotations, Interfaces, Enumerations, Arrays
		 * 
		 * */
		
		byte b = 1;
		short s;
		s = 2;
		int i = 3;
		long l = 4;
		
		char c = 'a';
		boolean bool = true;
		float f = 1.23f;
		
		long l2 = 2000000000;
		
		double d = 1.3;
		
		var v = 1;
		
		int i3 = s;
		char c2 = 100;
		System.out.println(c2);
		
		double d2 = i3;
		d2 = l;
		
		b = (byte)i3;
		
		long number = 499_999_999_000_000_001L;
		double converted = (double) number;
		System.out.println(number - (long) converted);
		
//		autoboxing
		Integer i4 = 1;
		
//		unboxing
		int i5 = i4;
		
	}

}
