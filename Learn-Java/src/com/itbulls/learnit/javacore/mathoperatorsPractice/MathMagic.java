package com.itbulls.learnit.javacore.mathoperatorsPractice;

public class MathMagic {
	public static void main(String[] args) {

	    int myNumber = 5;
	    // myNumber is the original number

	    int stepOne = myNumber * myNumber;

	    int stepTwo = stepOne + myNumber;

	    int stepThree = stepTwo / myNumber;

	    int stepFour = stepThree + 17;

	    int stepFive = stepFour - myNumber;

	    int stepSix = stepFive / 6;

	    System.out.println(stepSix);

	//Another solution - by using only two variables: someNumber and magicNumber:
	    int someNumber = 11;
	    int magicNumber = someNumber * someNumber;

	    magicNumber += someNumber;
	    magicNumber /= someNumber;
	    magicNumber += 17;
	    magicNumber -= someNumber;
	    magicNumber /= 6;

	    System.out.println(magicNumber);
		}


}
