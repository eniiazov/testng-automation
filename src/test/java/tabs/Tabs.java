package tabs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/cybertekchicago-1/Desktop/seleniumDependecy/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("http://the-internet.herokuapp.com/windows");
		String win = driver.getWindowHandle();
		System.out.println(win);
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> allWins = driver.getWindowHandles();
//		for(String w: allWins) {
//			if(!w.equals(win)) {
//				driver.switchTo().window(w);
//				break;
//			}
//			System.out.println(w);
//		}
		for(String w: allWins) {
			driver.switchTo().window(w);
			String tempTitle = driver.getTitle();
			if(tempTitle.equals("New Window")) {
				System.out.println("Window ID: " + w);
				System.out.println("Title: " + tempTitle);
				break;
			}
		}
		
		
	}
}











