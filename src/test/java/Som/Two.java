package Som;

import org.testng.annotations.Test;

public class Two {

	@Test (groups ="regression")
	public void method20() {
		System.out.println("method20");
	}
	@Test (groups ="regression")
	public void method21() {
		System.out.println("method21");
	}
	@Test (groups ="sanity")
	public void method22() {
		System.out.println("method22");
	}
	@Test
	public void method23() {
		System.out.println("method23");
	}

}
