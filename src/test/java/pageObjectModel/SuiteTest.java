package pageObjectModel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class SuiteTest {
	
	WebDriver driver;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/cybertekchicago-1/Desktop/seleniumDependecy/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
	} 

	@Test
	public void test1() throws InterruptedException {
		driver.get("http://softaculous.com/demos/SuiteCRM");
		driver.switchTo().frame("demobody");
		LoginPage lp = new LoginPage();
		lp.login("admin", "pass");
		Thread.sleep(3000);
		HomePage hp = new HomePage(driver);
		hp.textBox.sendKeys("Using POM" + Keys.ENTER);
	}
}












