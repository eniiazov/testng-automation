package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.Config;

public class WebOrder {
	static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/cybertekchicago-1/Desktop/seleniumDependecy/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		
		String url = Config.getValue("url");
		System.out.println("This is the url coming from properties file: "+url);
		driver.get(Config.getValue("url"));
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(Config.getValue("username"));
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(Config.getValue("password"));
		//ctl00$MainContent$login_button
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
	}

}
