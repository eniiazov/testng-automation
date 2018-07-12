package tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

	public static void main(String[] args) {
		
		// 1. path
		String path = "/Users/cybertekchicago-1/eclipse-workspace/testng-automation/Configuration.properties";
		//  file
		try {
			
			FileInputStream file = new FileInputStream(path);
			Properties pr = new Properties();
			pr.load(file);  
			String url = pr.getProperty("CEO");
			System.out.println("Who is CEO "+url);
			

		} catch (IOException e) {
			System.out.println("File is not found!");
			e.printStackTrace();
		}
		// file reader
		
		
	}

}
