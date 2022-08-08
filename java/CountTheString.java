package com.java;

import java.util.Scanner;

public class CountTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
		 String str;
		 int words=1,characters=1;
		 
		 
		     
		     
		 System.out.println("Enter the String  ");
		 str=scan.nextLine();
		 for(int i=0; i<str.length()-1; i++){
		 char ch=str.charAt(i);
		 if(str.charAt(i)==' ' && str.charAt(i+1)!=' '){
		     words++;
		 }
		 else if(str.charAt(i)!=' '){
		     characters++;
		 }
		 }
		 System.out.println("\nTotal words: "+words);
		 System.out.println("Total characters: "+characters);
		 System.out.println("Space: "+(words-1));

	}

}
