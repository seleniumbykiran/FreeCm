package CommonClas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrow {
public static WebDriver driver=null;
	
	@BeforeSuite
public void LaunchBrowser() {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	
}
	@AfterSuite
public void CloseBrowser() {
		if (driver != null)  // Ensure driver is initialized before quitting
	     driver.quit();
	}
}
