package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver) {
		super(driver);
    }
	@FindBy(id = "user-name")
    WebElement usernameField;

   @FindBy(id = "password")
    WebElement passwordField;
   
   @FindBy(id = "login-button")
   WebElement loginButt;
   
   
   
   public void enterUsername(String username) {
       usernameField.sendKeys(username);
   }

   public void enterPassword(String password) {
       passwordField.sendKeys(password);
   }

   public void clickLoginButton() {
       loginButt.click();
   }

   
   

}
