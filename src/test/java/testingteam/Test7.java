package testingteam;

import org.testng.annotations.Test;
@Test (groups="UAT")
public class Test7 {
	
	@Test (groups ="regression")
	public void method1() {
		System.out.println("method1");
	}
	@Test (groups ="regression")
	public void method2() {
		System.out.println("method2");
	}
	@Test (groups ="sanity")
	public void method3() {
		System.out.println("method3");
	}
	@Test
	public void method4() {
		System.out.println("method4");
	}

}
