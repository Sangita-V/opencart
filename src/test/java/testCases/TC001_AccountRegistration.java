package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC001_AccountRegistration extends BaseClass{
	
	@Test(groups={"Regression", "Master"})
	public void testcase_AccountRegistration()
	{
		logger.info("**** Excution started for TC001_AccountRegistration ****");
		
		try {
		HomePage hp = new HomePage(driver);
		hp.myAccountClick();
		logger.info("Clicked on Account link");
		
		hp.registerClick();
		logger.info("Clicked on Registration link");

		RegistrationPage regpage = new RegistrationPage(driver);
		logger.info("Registration page opened");

		logger.info("Entering user data");
		regpage.setFName(randomString().toUpperCase());
		regpage.setLName(randomString().toUpperCase());
		regpage.setEmail(randomString()+"@gmail.com");
		regpage.setPhone(randomNumbers());
		
		String password = randomAlphaNumeric();
		regpage.setPassword(password);
		regpage.setCPassw(password);
		
		regpage.clickCheck();
		regpage.clickContinue();
		
		logger.info("Validating expected message");
		String confmmsg = regpage.titleValidate();
		Assert.assertEquals(confmmsg, "Your Account Has Been Created!");
		}
		catch(Exception e)
		{
			logger.error("Test Failed.."+e.toString()+"  "+e.getMessage());
			logger.debug("Debug logs..");
			Assert.fail();
		}
		logger.info("**** Finished TC001_AccountRegistration ****");

	}
	
}
