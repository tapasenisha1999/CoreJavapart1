package com.java1.file;

import java.io.FileInputStream;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin = new FileInputStream("D:\\abc.txt");
			int  i =0;
			while ((i =fin.read()) != -1) {			
				System.out.println((char) i);
				
			}
			fin.close();
		}catch (Exception e) {
			System.out.println(e);
			
		}
		System.out.print("\nReading of file is successful");

	}

}
