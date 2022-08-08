package com.java;

public class Searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		  
	        // Using binarySearch to search for desired element
	        int index = Arrays.binarySearch(array, 2);
	  
	        // Printing result
	        if (index >= 0)
	            System.out.println("Element 2 found at index: "
	                               + index);
	        else
	            System.out.println("Element not found");
	    }
	}


