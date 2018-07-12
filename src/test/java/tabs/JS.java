package tabs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.Window;

public class JS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/cybertekchicago-1/Desktop/seleniumDependecy/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("http://the-internet.herokuapp.com/windows");
		
		driver.findElement(By.linkText("Click Here")).click();
		
		JavascriptExecutor jsx = (JavascriptExecutor)driver;
		jsx.executeScript("window.open('http://facebook.com');");
		jsx.executeScript("window.open('http://youtube.com');");
		
		Window.switchToWindow("Facebook - Log In or Sign Up", driver);
		
		Window.switchToWindow("YouTube", driver);
		Window.switchToSecondWindow(driver);
		
		
	}
}













