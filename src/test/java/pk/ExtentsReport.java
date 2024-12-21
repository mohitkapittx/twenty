package pk;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentsReport implements ITestListener {
	
	
	ExtentSparkReporter spark ;
	ExtentReports extent;
	ExtentTest test;
	public void onTestStart(ITestResult result) {
	    spark = new ExtentSparkReporter(System.getProperty("user.dir")+"/Report/myreport.html");
	    spark.config().setDocumentTitle("Auto report");
	    spark.config().setReportName("fuctional test");
	    spark.config().setTheme(Theme.DARK);
	    
	    
	    extent =new  ExtentReports();
	    extent.attachReporter(spark);
	    
	    extent.setSystemInfo("cmptn name", "lenovo");
	    extent.setSystemInfo("env", "UAT");
	    extent.setSystemInfo("Tester", "mohit");
	  }
	  public void onTestSuccess(ITestResult result) {
		  test = extent.createTest(result.getName());
			test.log(Status.PASS,"test case pass is"+result.getName());
		
	  }
	  public void onTestFailure(ITestResult result) {
		    test = extent.createTest(result.getName());
			test.log(Status.FAIL,"test case fail is"+result.getName());
			test.log(Status.FAIL,"test case fail is"+result.getThrowable());
	  }
	  public void onTestSkipped(ITestResult result) {
		  test = extent.createTest(result.getName());
			test.log(Status.SKIP,"test caseskip is"+result.getName());
	  }
	  public void onFinish(ITestContext context) {
		   extent.flush();
		  }


}
