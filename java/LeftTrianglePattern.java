package com.java;

public class LeftTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j,k, row = 3;

		for (i = 0; i < row; i++) {

			for (j = 1; j<row-i; j++) {

				System.out.print(" ");
			}

			for (k = 0; j <= i; k++) {

				System.out.print("* ");
			}

			System.out.println();
		}

	}
}