package com.itbulls.learnit.javacore.classesReview;

public class Store {
	// instance fields
	  String productType;
	  int inventoryCount;
	  double inventoryPrice;
	  
	  // constructor method
	  public Store(String product, int count, double price) {
	    productType = product;
	    inventoryCount = count;
	    inventoryPrice = price;
	  }
	  
	  // main method
	  public static void main(String[] args) {
	    Store cookieShop = new Store("cookies", 12, 3.75);
	    System.out.println(cookieShop);
//	    System.out.println(cookieShop.productType);
//	    System.out.println(cookieShop.inventoryCount);
//	    System.out.println(cookieShop.inventoryPrice);
	    System.out.println("Our store specials are " +cookieShop.productType +". So far we can offer " +cookieShop.inventoryCount + " "+
	    		cookieShop.productType + " and price is " + cookieShop.inventoryPrice +" for each.");
	  }

}
