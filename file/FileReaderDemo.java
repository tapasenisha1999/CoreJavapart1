package com.java1.file;

import java.io.*;

public class FileReaderDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("D:\\abc.txt");
		int i;
		while((i=fr.read())!=-1)
			System.out.print((char)i);
		fr.close();

	}

}
