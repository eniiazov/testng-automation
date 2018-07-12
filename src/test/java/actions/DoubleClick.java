package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DoubleClick {
	
WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/cybertekchicago-1/Desktop/seleniumDependecy/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
	}

	@Test
	public void doubleClick() throws InterruptedException {
		driver.get("http://primefaces.org/showcase/ui/misc/effect.xhtml");
		WebElement fold = driver.findElement(By.id("fold"));
		Actions action = new Actions(driver);
		action.doubleClick(fold).perform();
		Thread.sleep(3000);
		Assert.assertFalse(fold.isDisplayed());
	}
	
	@Test
	public void dragAndDrop() throws InterruptedException {
		driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
		Actions action = new Actions(driver);
		WebElement object = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement targetCircle  = driver.findElement(By.xpath("//div[@id='droptarget']"));
//		action.dragAndDrop(object, targetCircle).perform();
		
//		String message = targetCircle.getText();
//		Assert.assertEquals(message, "You did great!");
		action.moveToElement(object).perform();
		action.clickAndHold().perform();
		action.moveToElement(targetCircle).perform();
		Thread.sleep(4000);
	}
	
	@Test
	public void rightClick() throws InterruptedException {
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rc = driver.findElement(By.xpath("//span[.='right click me']"));
		Actions action = new Actions(driver);
		action.contextClick(rc).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(3000);
		
	}
	
	@Test
	public void uploading() throws InterruptedException {
		String path = "/Users/cybertekchicago-1/Desktop/webtable.html";
		driver.get("http://the-internet.herokuapp.com/upload");
		WebElement chooseFileBtn = driver.findElement(By.id("file-upload"));
		chooseFileBtn.sendKeys(path);
		driver.findElement(By.id("file-submit")).click();
		Thread.sleep(4000);
	}
	
}












