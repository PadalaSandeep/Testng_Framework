package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGOrderExecution extends ParentClass{
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("Into @BeforeMethod");
	}
	
	@Test(enabled = true, priority =1)
	public void method1() {
		System.out.println("Into Test1");
		System.out.println(add(5,6));
	}
	
	@Test(enabled = true , priority=0)
	public void method2() {
		System.out.println("Into Test2");
		System.out.println(add(5,6));
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("Into @AfterMethod");
	}
	


}
