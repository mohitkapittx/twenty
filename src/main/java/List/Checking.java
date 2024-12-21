package List;


import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class Checking extends Listen {
	
	
	@Test
	
	public void method1() {
		
		 Assert.assertTrue(false, "The condition is false, test failed.");
	}

}
