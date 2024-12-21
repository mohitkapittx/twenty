package DataPro;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPr {

	@Test (dataProvider="dataset")
	public void method(int no , String Pass) {
		System.out.println(no+"   "+Pass);
	}
	
	
	@DataProvider
	public Object [][]dataset(){ 
		
	Object [][] dataset = new Object[2][2];
	
	dataset[0][0]= 1;
	dataset[0][1]="first";
	
	dataset[1][0]= 2;
	dataset[1][1]="Second";
	
		return dataset;
	}
	
	
	
	
	
	
	
}
