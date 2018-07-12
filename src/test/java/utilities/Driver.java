package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	static WebDriver driver;
	
	public static WebDriver getDriver() {
		if(driver != null) {
			return driver;
		}
		String browser = Config.getValue("browserType").toLowerCase();
		
		switch(browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			default:
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
		}
		
		driver.manage().window().fullscreen();
		return driver;
	}
}
