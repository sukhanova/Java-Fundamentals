package com.itbulls.learnit.javacore;

public class NumberSystems {
	
	public static void main(String[] args) {
		/*
		 *Data Types: 
		 ** Decimal (base value 10: 0-9)
		 ** Haxadecimal (base value 16: 0-9, A-F)
		 ** Binary (base value 2: 0,1)
		 ** Octal (base value 8: 0-7)	
		 * */
		
		
			int dec = 152;  		//  no prefix   --> decimal literal
			int bin = 0b10011000;   // '0b' prefix --> binary literal
			int oct = 0230;			// '0' prefix  --> octal literal
			int hex = 0x98;			// '0x' prefix --> hexadecimal literal
			
			System.out.println(dec);
			System.out.println(bin);
			System.out.println(oct);
			System.out.println(hex);
			
		
			//What decimal number is encoded in hexadecimal name of the rock band - ACDC? 
			
			/*
			 * dec A = 10 * 16^3 --> 40960
			 * dec C = 12 * 16^2 --> 3072
			 * dec D = 13 * 16^1 --> 208
			 * dec C = 12 * 16^0 --> 12
			 * 
			 * ACDC = 40960 + 3072 + 208 +12 --> 44252
			 * */
		
	}

}
