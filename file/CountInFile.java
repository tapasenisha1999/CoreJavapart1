package com.java1.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountInFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader = null;

		int charCount = 0;
		int wordCount = 0;
		int lineCount = 0;

		try {
			reader = new BufferedReader(new FileReader("d:\\abc.txt"));
			String currentLine = reader.readLine();

			while (currentLine != null) {
				lineCount++;

				String[] words = currentLine.split(" ");

				wordCount = wordCount + words.length;

				for (String word : words) {

					charCount = charCount + word.length();
				}

				currentLine = reader.readLine();
			}
			System.out.println("Number Of Chars In A File : " + charCount);
			System.out.println("Number Of Words In A File : " + wordCount);
			System.out.println("Number Of Lines In A File : " + lineCount);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
