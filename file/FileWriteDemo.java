package com.java1.file;

import java.io.*;

public class FileWriteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileWriter fw=new FileWriter("D:\\abc.txt");
	fw.write("Welcome everyone");
	fw.close();
	
}
catch(Exception e) {
System.out.println(e);
	}
	System.out.println("success");
}
}
