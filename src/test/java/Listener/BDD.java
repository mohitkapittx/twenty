package Listener;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BDD extends List {

	
	@Test
	
	void test() {
		System.out.println("test");
		  Assert.assertTrue(false, "The condition is false, test failed.");
	}
}
