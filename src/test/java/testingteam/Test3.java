package testingteam;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3 {

	@BeforeTest
	public void beforetest() {
		System.out.println("before test");
	}
	
	
	@BeforeMethod
	public void beformethod() {
		System.out.println("before method");
	}

	
	
	@Test
	public void method1() {
		System.out.println("method1");
	}
	
	
	@Test
	public void method2() {
		System.out.println("method2");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("After method");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After test");
	}
	
}
