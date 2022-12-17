package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (id= "input-email")public WebElement txtEmail; 
	@FindBy (id="input-password")public WebElement txtPassword; 
	@FindBy (xpath= "//button[text()= 'Login']")public WebElement btnLogin; 
	
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
		
	}
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	public void setLogin() {
		btnLogin.click();
	}
}
