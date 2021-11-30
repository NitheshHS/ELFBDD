package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.messages.internal.com.google.common.io.Files;

/**
 * This class contains all webdriver and WebElement actions 
 * @author Nitheesha
 *
 */
public class WebDriverUtility {
	/**
	 * This method used to take screen shot
	 * @param driver
	 * @param screenshotName
	 * @throws Throwable
	 */
	public void takeScreenshot(WebDriver driver,String screenshotName) throws Throwable {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File(".\\screenshot\\"+screenshotName+".png");
		Files.copy(source, destination);
	}
	
	public byte[] takeScreenshot(WebDriver driver) throws Throwable {
		TakesScreenshot ts=(TakesScreenshot)driver;
		byte[] bytes=ts.getScreenshotAs(OutputType.BYTES);
		return bytes;
		
	}

}
