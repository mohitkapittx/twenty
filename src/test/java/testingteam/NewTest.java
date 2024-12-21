package testingteam;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	
	
	@BeforeSuite
	public void beforeSuite() {
	    System.out.println(" before the test suite.");
	}
	@AfterSuite
	public void afterSuite() {
	    System.out.println(" after the test suite.");
	}
	@BeforeTest
	public void beforeTest() {
	    System.out.println(" before a test.");
	}
	@AfterTest
	public void afterTest() {
	    System.out.println(" after all test methods ");
	}

	@Test
	public void testMethod() {
	    System.out.println("This is a test method.");
	}
	@BeforeClass
	public void beforeClass() {
	    System.out.println("before the first method of the class.");
	}
	@AfterClass
	public void afterClass() {
	    System.out.println("after all methods in the class.");
	}
	@BeforeMethod
	public void beforeMethod() {
	    System.out.println(" before each test method.");
	}
	@AfterMethod
	public void afterMethod() {
	    System.out.println(" after each test method.");
	}



  
}
