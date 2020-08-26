package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshot {
	private static WebDriver driver = null;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.zlti.com");
		
		/*
		 * TakesScreenshot scrshot = ((TakesScreenshot) driver); File scrFile =
		 * scrshot.getScreenshotAs(OutputType.FILE); File DestFile = new
		 * File("Sample.png");
		 */
		
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		File DestFile=new File("C:\\Users\\Lenovo\\OneDrive\\Documents\\Sample.png");
		//Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
		
		driver.quit();
	}

}
