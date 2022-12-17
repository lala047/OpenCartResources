package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_Login extends BaseClass{
	
	
	
	@Test
	public void test_Login() throws InterruptedException {
		HomePage hp= new HomePage(driver);
		hp.ClickMyAccount();
		hp.ClickLogin();
		LoginPage lp= new LoginPage(driver);
		
lp.setEmail(rb.getString("email"));     //valid email , get it from config.properties   // rb=ResourceBundle.getBundle("config");(This is in the BaseClass and it helps to read the config.properties
lp.setPassword(rb.getString("password")); // valid password, get it from config.properties
lp.setLogin();
	
MyAccountPage macc= new MyAccountPage(driver);
boolean targetpage= macc.isMyAccountPageExists();  //obj. method();

try {
Assert.assertEquals(targetpage, true);  //Assert.assertEquals(boolean actual, boolean expected) 
	}
	
	catch(Exception e)
	{
		Assert.fail();
	}


}
}
