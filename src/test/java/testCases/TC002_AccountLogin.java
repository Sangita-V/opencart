package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_AccountLogin extends BaseClass{

	@Test(groups={"Sanity", "Master"})
	public void testcase_AccountLogin() {
		
		logger.info("**** Started TC002_AccountLogin ****");
		try {
		HomePage hp = new HomePage(driver);
		hp.myAccountClick();
		logger.info("Clicked on My Account link");
		
		hp.loginClick();
		logger.info("Clicked on Login link");

		logger.info("Entering login data");
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("pwd"));
		lp.loginClick();
		logger.info("Logged in Successfully with email id : {} ",p.getProperty("email"));
		
		logger.info("Validating Page Title");
			String actualTitle1 = lp.loginPageTitle();;
			Assert.assertEquals(actualTitle1, "My Account");
		} catch (Error e) {
			logger.error("Assertion fail : {}",e.toString());
			throw new AssertionError();
		}
		
		logger.info("Validating My Account Page text");
		MyAccountPage macc = new MyAccountPage(driver);
		macc.isMyAccountPageExists();
		
		logger.info("**** Finished TC002_AccountLogin ****");
	}
	
}
