package testingteam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test4 {
	
	 public static void main(String[] args) {
   
	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://console-uat.kapittx.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("email")).sendKeys("xx500@kapittx.com");
	driver.findElement(By.id("password")).sendKeys("Mohit@777");
	driver.findElement(By.id("btnSignIn")).click();
	
	
	String act = driver.getTitle();
	String exp = "KapittX";
	Assert.assertEquals(act, exp, "unmatched");
	
	driver.close();

	
}}
