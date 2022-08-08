package com.java;

import java.util.Scanner;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = "Hello this is Nisha here";
		String[] arrOfStr = str.split(" ", 5);

		for (String a : arrOfStr)
			System.out.println(a);

	}

}
