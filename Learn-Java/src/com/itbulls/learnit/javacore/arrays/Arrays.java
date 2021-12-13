package com.itbulls.learnit.javacore.arrays;


public class Arrays {

	public static void main(String[] args) {
		/*
		 * Array is an object which contains elements of similar data types and support access to them by index
		 * 
		 * Index of the first element in array is 0
		 * 
		 * No dynamic size - in Java array size is fixed!!!
		 * */
		
		
		// Array declaration:
		int[] arr;  // common array declaration, int - type of element in array, arr - variable name
		int arr2[]; // int - type of element in array, arr2 - variable name
		
		arr = new int[10]; //10 is size of an array
//		System.out.println(arr.length);
//		System.out.println(arr[0]);               // first element in array
//		System.out.println(arr[arr.length-1]);    // last element in array
		
		
		double[] arr3 = new double[10];
//		System.out.println(arr3[0]);
		
		boolean[] arr4 = new boolean[10];
//		System.out.println(arr4[0]); --> false. For boolean default value is false
		
		
		// Array literals - use if you know array size and variables in array
		int[] arr5 = {3, 2, 1};
//		System.out.println(arr5[arr5.length-1]); // last element in array
//		System.out.println(arr5[0]);
//		System.out.println(arr5.length);
		
		
		// Multidimensional array
		int[][] matrix = {
				{1,2,3},
				{4,5,6}
		};
//		System.out.println(matrix[0][2]);  // [0] is index of row, [2] is index of column
		
		
		int[][] matrix2 = new int[10][];
//		System.out.println(matrix2[0]); // --> null because arrays are not instantiated yet
		
		System.out.println(java.util.Arrays.toString(arr5));
//		Arrays.sort(arr5);
//		System.out.println(Arrays.toString(arr5));

	}

}
