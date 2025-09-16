package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver){
		super(driver);
	}
	
		@FindBy(xpath="//input[@name='email']")
		WebElement txt_email;
		@FindBy(xpath="//input[@name='password']")
		WebElement txt_pwd;
		@FindBy(xpath="//input[@value='Login']")
		WebElement btn_login;
		
		public void setEmail(String email) {
			txt_email.sendKeys(email);
		}
		
		public void setPassword(String pwd) {
			txt_pwd.sendKeys(pwd);
		}
		
		public void loginClick() {
			btn_login.click();
		}
		
		public String loginPageTitle() {
			
			String actualTitle=driver.getTitle();
			return actualTitle;
			
		}
	
}
