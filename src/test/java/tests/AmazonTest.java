package tests;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.Config;

public class AmazonTest {

WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/cybertekchicago-1/Desktop/seleniumDependecy/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
	}
	
	@BeforeMethod
	public void before() {
		driver.get("http://amazon.com");
	}
	
	@Test
	public void searchVerification() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Config.getValue("Search") + Keys.ENTER);
		List<WebElement> results = driver.findElements(By.xpath("//ul[@id='s-results-list-atf']/li//h2"));
		
		for(WebElement result: results) {
			System.out.println(result.getText());
			
			boolean check = result.getText().toLowerCase().contains(Config.getValue("amazonSearch"));
			Assert.assertTrue(check);
		}
	}
	
}












