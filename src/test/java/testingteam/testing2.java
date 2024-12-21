package testingteam;

import org.testng.annotations.Test;

public class testing2 {

	
	
	@Test (priority=1,description ="login    test   pass")
	public void blogin() {
		System.out.println("login");
	}
	
	
	
	@Test(priority=2,description="logout    test     pass")
	public void alogout() {
		System.out.println("logout");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
