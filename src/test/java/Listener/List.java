package Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class List implements ITestListener {

	 @Override
	    public void onTestFailure(ITestResult result) {
	        System.out.println("Test Failed: " + result.getName());
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	        System.out.println("Test Skipped: " + result.getName());
	    }

	    @Override
	    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	       
	    }

	    @Override
	    public void onStart(ITestContext context) {
	        System.out.println("Test Execution Started for: " + context.getName());
	    }

	    @Override
	    public void onFinish(ITestContext context) {
	        System.out.println("Test Execution Finished for: " + context.getName());
	    }
	
	
	
}
