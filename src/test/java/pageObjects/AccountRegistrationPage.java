package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{
	
	public AccountRegistrationPage(WebDriver driver) {
	super(driver);
	
	}
	@FindBy (id= "input-firstname")public WebElement txtfirstname; 
	@FindBy (id= "input-lastname")public WebElement txtlastname;
	@FindBy (id= "input-email")public WebElement txtemail;
	@FindBy (id= "input-password")public WebElement txtpassword;
	@FindBy (id= "input-newsletter-no")public WebElement rdnewsletter;
	@FindBy (xpath= "//input[@name='agree']")public WebElement chckdpolicy;
	@FindBy (xpath= "//button[text()='Continue']")public WebElement btncontinue;
	
	
	public void setFirstName(String fname) {
		txtfirstname.sendKeys(fname);
	}
	public void setLastName(String lname) {
		txtlastname.sendKeys(lname);
	}
	
	public void setEmail(String email) {
		txtemail.sendKeys(email);
	}
	public void setPassword(String pwd) {
		txtpassword.sendKeys(pwd);
	}
	public void setNewsletter() {
		rdnewsletter.click();
	}
	public void setPrivacypolicy() {
		chckdpolicy.click();
	
	}
	public void clickContinue() {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", btncontinue);
	
		
		
		
	}
	
	
	
}
