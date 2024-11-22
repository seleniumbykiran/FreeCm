package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import CommonClas.LaunchBrow;
import Pages.LoginPage;

public class LoginTest extends LaunchBrow{
WebDriver driver;
LoginPage log;



@BeforeClass
public void setUp() {
	driver= new ChromeDriver();
	 log = new LoginPage(driver);
	;
}

@DataProvider(name="create")	
public Object[][] data()
{
	return new Object[][]
			{
			{"standard_user", "secret_sauce"},
			{"locked_out_user", "secret_sauce"},		
			{"problem_user","secret_sauce"},
			{"performance_glitch_user","secret_sauce"},
            };
}


@Test(dataProvider = "create")
public void testLogin(String username, String password ) 
{
    log.Launch("https://www.saucedemo.com/v1/");
    log.enterUsername(username);
    log.enterPassword(password);
    log.clickLoginButton();
    
}

@AfterClass
public void closeClass() {
	driver.close();
}
}
