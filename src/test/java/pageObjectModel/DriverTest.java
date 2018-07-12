package pageObjectModel;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import pages.GoogleHomePage;
import utilities.Driver;

public class DriverTest {

	
	
	@Test
	public void test() {
		Driver.getDriver().get("http://google.com");
		GoogleHomePage ghp = new GoogleHomePage();
		ghp.searchBox.sendKeys("Hello" + Keys.ENTER);
		
	}
}
