package assertions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Statista {
	
WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/cybertekchicago-1/Desktop/seleniumDependecy/drivers/chromedriver");
		driver = new ChromeDriver();
	}

	@Test
	public void navigator() throws InterruptedException {
		driver.get("http://statista.com");
		List<WebElement> navigators = driver.findElements(By.xpath("//div[@id='navigation']/nav/ul/li"));
		
		Actions action = new Actions(driver);
		
		for(int i = 0; i < navigators.size()-2; i++) {
			action.moveToElement(navigators.get(i)).perform();
			Thread.sleep(2000);
		}
	}
}














