package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class BeforeMethod_BeforeTest {
	
  public WebDriver driver;
  @Test(priority = 1)
  public void Secondtest() {
	  driver.get("https://www.phptravels.net/");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
		WebElement element1 = driver.findElement(By.xpath("//*[@class='select2-chosen']"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(element1);
		actions.click();
		actions.sendKeys("SOME DATA");
		actions.build().perform();
  }
  
  @Test(priority = 0)
  public void Firstest() {
	  driver.get("https://www.phptravels.net/");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
		WebElement element1 = driver.findElement(By.xpath("//*[@class='select2-chosen']"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(element1);
		actions.click();
		actions.sendKeys("SOME DATA");
		actions.build().perform();
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("Executing Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("Executing After Method");
  }

  @BeforeTest
  public void beforeTest() {
	  ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("chromedriver.exe").getFile());
		System.out.println(file.getAbsolutePath());
		System.setProperty("webdriver.chrome.driver", "E:\\Job Stuff\\TestngMAven\\target\\test-classes\\chromedriver.exe");
		driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
