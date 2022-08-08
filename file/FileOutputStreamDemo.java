package com.java1.file;

import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fout = new FileOutputStream("D:\\abc.txt");
			fout.write(67);
			fout.write(98);
			fout.write(99);
			fout.write(100);
			fout.write(101);
			fout.write(102);
			fout.close();
			System.out.println("Writing into file is successful");
			
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
