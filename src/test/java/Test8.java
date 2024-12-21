import org.testng.annotations.Test;


@Test (groups= "UAT")
public class Test8   {

	@Test (groups ="regression")
	public void method11() {
		System.out.println("method10");
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
