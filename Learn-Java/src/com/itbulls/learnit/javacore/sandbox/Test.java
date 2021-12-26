package com.itbulls.learnit.javacore.sandbox;

public class Test {
	

	int roll1 = rollDice(6);
	int roll2 = rollDice(8);
	
	
	public int rollDice(int sides){
        // random num between 0 and (almost) 1
        double randomNumber=Math.random();

        // change range to 0 to (almost) 6
        randomNumber=randomNumber*sides;

        // shift range up one
        randomNumber=randomNumber+1;

        // cast to integer (ignore decimal part)
        // ex. 6.998 becomes 6
        int randomInt=(int)randomNumber;

        // return statement
        return randomInt;
        }	
	

}
