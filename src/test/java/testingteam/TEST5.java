package testingteam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TEST5 {
	  WebDriver driver; 
	 @BeforeTest
	    public void setDriver() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver(); // Initialize the class-level WebDriver instance
	        driver.get("https://console-uat.kapittx.com/");
	        driver.manage().window().maximize();
	    }

	    @Test
	    public void method1() {
	        driver.findElement(By.id("email")).sendKeys("xx500@kapittx.com");
	        driver.findElement(By.id("password")).sendKeys("Mohit@777");
	        driver.findElement(By.id("btnSignIn")).click();
	    }

	    @Test
	    public void method2() {
	        String act = driver.getTitle();
	        String exp = "KapittX";
	        Assert.assertEquals(act, exp, "unmatched");
	    }

	    @AfterTest
	    public void closeDriver() {
	        if (driver != null) {
	            driver.close(); // Close the browser after tests are complete
	        }
	
}}
