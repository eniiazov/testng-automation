package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/cybertekchicago-1/Desktop/seleniumDependecy/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("http://4stay.com");
		Thread.sleep(3000);
		driver.switchTo().frame("intercom-launcher-frame");
		System.out.println(driver.getPageSource());
		driver.findElement(By.xpath("//div[@class = 'intercom-launcher-close-icon']")).click();
		
		
	}
}
