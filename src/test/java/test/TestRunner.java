package test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestRunner {

	WebDriver driver;

	@BeforeTest
	public void before() {

		System.setProperty("webdriver.chrome.driver", "E:\\Job Stuff\\TestngMAven\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void Scenario1() {
		driver.get("https://www.phptravels.net/");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement element = driver.findElement(By.xpath("//*[@id=\"s2id_autogen8\"]/a/span[1]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.click();
		actions.sendKeys("SOME DATA");
		actions.build().perform();
	}

	@AfterTest
	public void after() {
		driver.close();
	}
}
