package com.java;

import java.util.Scanner;

public class FibonacciExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f1 = 0, f2 = 1, f3, i, count = 20;
		System.out.print("Fibonacci series"+f1 + " " + f2);

		for (i = 2; i < count; ++i)
		{
			f3 = f1 + f2;
			System.out.print(" " + f3);
			f1 = f2;
			f2 = f3;
		}

	}

}
