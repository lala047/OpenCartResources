package testCases;

import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass {

	
	@Test
	public void RegisterAccount() throws InterruptedException {
		HomePage hp= new HomePage(driver);
		hp.ClickMyAccount();
		hp.ClickRegister();
		AccountRegistrationPage regpage= new AccountRegistrationPage(driver);
		regpage.setFirstName("John");
		regpage.setLastName("Philip");
		regpage.setEmail(randomeString()+"@gmail.com");
		regpage.setPassword("lala");
		regpage.setNewsletter();
		
		regpage.setPrivacypolicy();
		
		regpage.clickContinue();
		
	Thread.sleep(3000);
	
		
		
		
	}

}
