package com.java;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name1 = sc.nextLine();
		// This line you have to add (It consumes the \n character)
		System.out.println("Your name is : " + name1);

		System.out.print("Enter your full name: ");
		String name = sc.next();
		System.out.print("Your full name is : " + name);

		System.out.print("Enter your roll no: ");
		int rollno = sc.nextInt();
		System.out.print("Roll no is : " + rollno);

		// TODO Auto-generated method stub

	}

}
