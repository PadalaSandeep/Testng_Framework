package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ParentClass {
	
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("Into @BeforeSuite");
	}
	
	@BeforeTest
	public void BeforeTest() {
		System.out.println("Into @BeforeTest");
	}
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("Into @BeforeClass");
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("Into @AfterTest");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("Into @AfterClass");
	}
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("Into @AfterSuite");
	}
	
	public int add(int a, int b) {
		return a+b;
	}

}
