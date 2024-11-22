package Utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import CommonClas.LaunchBrow;
import Pages.BasePage;

public class Screensnap extends LaunchBrow {
	
public void getScreenShot() throws IOException {
		
		TakesScreenshot t1 = (TakesScreenshot)driver;
		File src= t1.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/ss.png");
		FileUtils.copyFile(src, dest);
}
}
