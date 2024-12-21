package Som;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Three {

	
	@Test (enabled=false)
	void methods1() {
		System.out.println("methods1");
	}
	@Test
	void methods2() {
		System.out.println("methods12");
	}
	@Test
	void methods3() {
		System.out.println("methods123");
		throw new SkipException("exception");
	}
}
