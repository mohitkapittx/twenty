package testingteam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test6 {

	
	@Test
     public void method() {
	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://console-uat.kapittx.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("email")).sendKeys("xx500@kapittx.com");
	driver.findElement(By.id("password")).sendKeys("Mohit@777");
	driver.findElement(By.id("btnSignIn")).click();
	
	SoftAssert sft = new SoftAssert();
	String act = driver.getTitle();
	String exp = "KapittXy";
	sft.assertEquals(act, exp, "unmatched");
	
	System.out.println("continue");
	
	boolean txtex = true;
	
	boolean checkbtn =  true;
	
	sft.assertEquals(txtex, checkbtn);
	
	System.out.println("complete");
	//sft.assertAll();
	
	
	driver.close();

}}