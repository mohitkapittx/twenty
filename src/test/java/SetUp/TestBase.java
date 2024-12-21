package SetUp;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

	
	
	@BeforeSuite
	
	public void startservr() {
		System.out.println("server is on");
	}
	
  @AfterSuite
	
	public void Stopservr() {
		System.out.println("server is off");
	}
}
