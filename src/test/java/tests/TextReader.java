package tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextReader {

	public static void main(String[] args) {
		
		String path="/Users/cybertekchicago-1/eclipse-workspace/testng-automation/testData.txt";
		
		File file = new File(path);
		
		try {
			FileReader  fileReader = new FileReader(file);
			BufferedReader  read = new BufferedReader(fileReader);
			// inside the txt
			//This is the testing purpose...<=readline
			//And this is the second line
			
			String line1 = read.readLine();
			String line2 = read.readLine();
			
			while(line1!=null) {
				System.out.println("print: "+line1);
				line1=read.readLine();
			}
			
			String rd =read.readLine();
			
		} catch (IOException e) {
			System.out.println(path +" not found!");
			e.printStackTrace();
		}
		
		
		
	}
}
