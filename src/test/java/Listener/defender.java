package Listener;

import org.testng.Assert;
import org.testng.annotations.Test;

public class defender {

	
	
	@Test
	public void method1() {
		//System.out.println("1");
		Assert.assertTrue(false);
	
	}
	@Test (dependsOnMethods="method1")
	public void method2() {
		System.out.println("2");
		
	}
	@Test
	public void method3() {
		System.out.println("3");
	
	}
}
