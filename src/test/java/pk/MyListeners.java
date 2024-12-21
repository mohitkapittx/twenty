package pk;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.IListeners;

public class MyListeners implements ITestListener {
	
	public void onTestStart(ITestResult result) {
	    System.out.println("start");
	  }

	  
	  public void onTestSuccess(ITestResult result) {
		  System.out.println("sucess");
	  }

	 
	  public void onTestFailure(ITestResult result) {
		  System.out.println("fail");
	  }

	 
	  public void onTestSkipped(ITestResult result) {
		  System.out.println("skippes");
	  }

	  
	  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		  System.out.println("failed");
	  }

	  
	  public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }

	  
	  public void onStart(ITestContext context) {
	    // not implemented
	  }

	  
	  public void onFinish(ITestContext context) {
	    // not implemented
	  }

	
	
	
}
