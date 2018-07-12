package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.Driver;

public class SuiteCRM {
	

	@Test
	public void test1() throws InterruptedException {
		WebDriver driver  = Driver.getDriver();
		driver.get("http://softaculous.com/demos/SuiteCRM");
		driver.switchTo().frame("demobody");
		new LoginPage().login("admin", "pass");
		Thread.sleep(3000);
		WebElement textBox = driver.findElement(By.xpath("(//input[@id = 'text'])[1]"));
		textBox.sendKeys("Chicago Test" + Keys.ENTER);
		
	}

}










