package com.java;

import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 100;
		System.out.print("Odd Numbers from 1 to " + n + " are: ");
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");

				// TODO Auto-generated method stub

			}

		}
	}

}