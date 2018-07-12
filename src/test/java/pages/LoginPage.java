package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage() {
		this.driver = Driver.getDriver();
		// help LoginPage to initialize all the elements
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "user_name")
	public WebElement username;
	
	@FindBy(id = "username_password")
	public WebElement password;
	
	@FindBy(id = "bigbutton")
	public WebElement loginBtn;
	
	public void login(String userName, String pass) {
		username.sendKeys(userName);
		password.sendKeys(pass);
		loginBtn.click();
	}
	
}










