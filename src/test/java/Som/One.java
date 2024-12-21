package Som;

import org.testng.annotations.Test;

public class One {
	

	@Test (groups ="regression")
	public void method11() {
		System.out.println("method11");
	}
	@Test (groups ="regression")
	public void method12() {
		System.out.println("method12");
	}
	@Test (groups ="sanity")
	public void method13() {
		System.out.println("method13");
	}
	@Test
	public void method14() {
		System.out.println("method14");
	}

}
