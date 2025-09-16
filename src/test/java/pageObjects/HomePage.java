package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

	//Locators
	@FindBy(xpath="//span[text()='My Account']")
	WebElement lnk_myaccount;
	
	@FindBy(xpath="//a[text()='Register']")
	WebElement lnk_register;
	
	@FindBy(xpath="//a[text()='Login']")
	WebElement lnk_login;
	
	//Action methods
	public void myAccountClick() {
		lnk_myaccount.click();
	}
	
	public void registerClick() {
		lnk_register.click();
	}
	
	public void loginClick() {
		lnk_login.click();
		
	}
}

