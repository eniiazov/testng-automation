package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utilities.Config;
import utilities.DataStorage;

public class Google {
	
	String store;
	
	@BeforeClass
	public void setup() {
		System.out.println("Setup the environment");
	}
	
	@Test
	public void googleSearch() {
		System.out.println("Searching item and validating");
		store = "iphone 9";
		DataStorage.addData("myKey", "iphone 9");
		System.out.println(Config.getValue("amazonSearch"));
	}
	
	@Test
	public void googleAd() {
		System.out.println("Google advertisement test");
	}
	
	@Test
	public void wgoogleImage() {
		System.out.println("Verifying google images");
		String s = DataStorage.getData("myKey");
		System.out.println("My data: " + store);
	}

}
