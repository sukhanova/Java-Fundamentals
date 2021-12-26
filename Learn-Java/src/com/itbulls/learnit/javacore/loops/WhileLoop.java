package com.itbulls.learnit.javacore.loops;

public class WhileLoop {
	
	public int rollDice(){
        // random num between 0 and (almost) 1
        double randomNumber=Math.random();

        // change range to 0 to (almost) 6
        randomNumber=randomNumber*6;

        // shift range up one
        randomNumber=randomNumber+1;

        // cast to integer (ignore decimal part)
        // ex. 6.998 becomes 6
        int randomInt=(int)randomNumber;

        // return statement
        return randomInt;
        }	
	
	public int keepRolling(){
		int dice1 = rollDice();
		int dice2 = rollDice();
		int dice3 = rollDice();
		int dice4 = rollDice();
		int dice5= rollDice();
		int count = 1;
		while(!(dice1==dice2 && dice2 == dice3 && dice3 == dice4 && dice4 == dice5)) {
			dice1 = rollDice();
			dice2 = rollDice();
			dice3 = rollDice();
			dice4 = rollDice();
			dice5 = rollDice();
			count = count+1;
		}
		return count;
	}
	
	

}
