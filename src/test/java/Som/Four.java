package Som;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import SetUp.TestBase;

public class Four extends TestBase {

	@Test (groups="simple")
	public void prod1() {
		System.out.println("prod1");
	}
	@Test(groups="simple")
	public void prod2() {
		System.out.println("prod2");
	}
	@Test
	public void prod3() {
		System.out.println("prod3");
	}
	@Test
	public void prod4() {
		System.out.println("prod4");
	}
	
	
	
	@BeforeTest
	public void BT() {
		System.out.println("before test");
	}
	
	@AfterTest
	public void AT() {
		System.out.println("after test");
	}
	@BeforeGroups (groups="simple")
	public void BG() {
		System.out.println("before GROUP");
	}
	
	@AfterGroups (groups="simple")
	public void AG() {
		System.out.println("after GROUP");
	}
}
