package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import pageObjects.RegistrationConfirmationPage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass {

	
	@Test
	public void RegisterAccount() throws InterruptedException {
		HomePage hp= new HomePage(driver);
		hp.ClickMyAccount();
		hp.ClickRegister();
		AccountRegistrationPage regpage= new AccountRegistrationPage(driver);
		regpage.setFirstName(randomeString().toUpperCase());   // This will set random name using the randome String method I put in the base class
		//regpage.setFirstName("John");  (or use this hardcoding)
		regpage.setLastName(randomeString().toUpperCase());
		//regpage.setLastName("Philip");
		regpage.setEmail(randomeString()+"@gmail.com");
		regpage.setPassword(randomeString().toUpperCase());
		//regpage.setPassword("lala");
		regpage.setNewsletter();
		regpage.setPrivacypolicy();
		regpage.clickContinue();
		Thread.sleep(3000);
		RegistrationConfirmationPage regconf= new RegistrationConfirmationPage(driver);
		
		String confmsg=regconf.getConfirmationMsg(); // (obj.method)
		if(confmsg.equals("Your Account Has Been Created!"))
		{
			logger.info("Account Registration Success ");
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("Account Registration Failed ");
			Assert.assertTrue(false);
		
		}
	}

}
