package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationConfirmationPage extends BasePage {
		
		public RegistrationConfirmationPage(WebDriver driver) {
			
	
			super(driver);
		}
			
			@FindBy (xpath= "//h1[text()= 'Your Account Has Been Created!']")public WebElement msgConfirmation; 
			
			
			public String getConfirmationMsg()
			{
			try
			{
			return (msgConfirmation.getText());
			}
			catch(Exception e)
			{
			return(e.getMessage());
			}


			}
	}