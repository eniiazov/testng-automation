package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Window;

public class JSAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/cybertekchicago-1/Desktop/seleniumDependecy/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();
		
		Window.getAlert(driver).accept();
//		driver.findElement(By.linkText("Elemental Selenium")).click();
		
//		Handling the cancel and accept alert type
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
		Window.getAlert(driver).dismiss();
		
//		Prompt alert handling
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
		Alert thirdAlert = driver.switchTo().alert();
		Thread.sleep(1000);
		
	}
}









