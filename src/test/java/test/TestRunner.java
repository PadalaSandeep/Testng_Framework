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
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("chromedriver.exe").getFile());
		System.out.println(file.getAbsolutePath());
		System.setProperty("webdriver.chrome.driver", "E:\\Job Stuff\\TestngMAven\\target\\test-classes\\chromedriver.exe");
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

	@AfterTest
	public void after() {
		driver.close();
	}
}
