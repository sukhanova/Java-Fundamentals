package com.itbulls.learnit.javacore.madlibs;

public class Madlibs {

	public static void main(String[] args) {
		// String story = "";
	    String name1 = "Ollie";
	    String name2 = "Amber";
	    String adjective1 = "green";
	    String adjective2 = "grumpy";
	    String adjective3 = "small";

	    String verb1 = "notice";

	    String noun1 = "apple";
	    String noun2 = "lamp";
	    String noun3 = "cellar";
	    String noun4 = "umbrella";
	    String noun5 = "scale";
	    String noun6 = "toothbrush";

	    int number = 3;

	    String place1 = "Wonderland";

	      
	      //The template for the story
	      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!'\n Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+",\n which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+"\n and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

	      System.out.println(story);
	}

}
