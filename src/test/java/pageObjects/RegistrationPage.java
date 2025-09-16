package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class RegistrationPage extends BasePage{	

	public RegistrationPage(WebDriver driver) {
		super(driver);
	}

	//Locators
	@FindBy(xpath="//input[@name='firstname']")
	WebElement txt_fname;
	@FindBy(xpath="//input[@name='lastname']")
	WebElement txt_lname;
	@FindBy(xpath="//input[@name='email']")
	WebElement txt_email;
	@FindBy(xpath="//input[@name='telephone']")
	WebElement txt_tphone;
	@FindBy(xpath="//input[@name='password']")
	WebElement txt_pwd;
	@FindBy(xpath="//input[@name='confirm']")
	WebElement txt_cpwd;
	@FindBy(xpath="//input[@name='agree']")
	WebElement ckb_agree;
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btn_continue;
	
	
	
	//Action Methods
	public void setFName(String fname) 
	{
		txt_fname.sendKeys(fname);
	}
	
	public void setLName(String lname) 
	{
		txt_lname.sendKeys(lname);
	}
	
	public void setEmail(String email) 
	{
		txt_email.sendKeys(email);
	}
	
	public void setPhone(String tnumber) 
	{
		txt_tphone.sendKeys(tnumber);
	}
	
	public void setPassword(String pwd) 
	{
		txt_pwd.sendKeys(pwd);
	}
	
	public void setCPassw(String cpwd) 
	{
		txt_cpwd.sendKeys(cpwd);
	}
	
	public void clickCheck() 
	{
		ckb_agree.click();
	}
	
	public void clickContinue() 
	{
		btn_continue.click();
	}
	
	public String titleValidate()
	{
		Object confmmsg;
		String actualTitle = driver.getTitle();
		return actualTitle;
	}
}

