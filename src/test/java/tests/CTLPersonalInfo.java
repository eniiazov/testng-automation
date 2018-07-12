package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.CTLPersonalPage;
import utilities.Config;
import utilities.Driver;

public class CTLPersonalInfo {
	
	@Test
	public void personalInformationTab() throws InterruptedException {
		Driver.getDriver().get(Config.getValue("ctlUrl"));
		Thread.sleep(2000);
		WebElement iframe = Driver.getDriver().findElement(By.xpath("(//iframe)[2]"));
		Driver.getDriver().switchTo().frame(iframe);
		CTLPersonalPage ctl = new CTLPersonalPage();
		ctl.firstName.sendKeys(Config.getValue("name"));
		ctl.lastName.sendKeys(Config.getValue("lastName"));
	}

}
