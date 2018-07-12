package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class CTLPersonalPage {

WebDriver driver;
	
	public CTLPersonalPage() {
		driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "SingleLine")
	public WebElement firstName;
	
	@FindBy(name = "SingleLine2")
	public WebElement lastName;
}
