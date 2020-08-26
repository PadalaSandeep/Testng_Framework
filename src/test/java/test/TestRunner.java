package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRunner {

	WebDriver driver;

	@BeforeMethod
	public void before() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
	}
	@Test
	public void Scenario1() {
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

	@AfterMethod
	public void after() {
		driver.close();
	}
}
