package DataPro;

import org.testng.annotations.Test;

public class Data3 {

	@Test (dataProvider="dataset",dataProviderClass=DataPr.class)
	public void method(int no , String Pass) {
		System.out.println(no+"   "+Pass);
	}

}
