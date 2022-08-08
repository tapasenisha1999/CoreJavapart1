package com.java;

import java.util.Arrays;

public class CopyOfRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 8, 3, 5, 9, 10 };

	
		int b[] = Arrays.toString(a, 2, 6);

		
		System.out.println("Contents of a[] ");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");

		System.out.println("\nContents of b[] ");
		for (int i = 0; i < b.length; i++)
			System.out.print(b[i] + " ");

	}

}
