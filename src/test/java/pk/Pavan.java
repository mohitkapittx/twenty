package pk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(pk.MyListeners.class)
public class Pavan {
	
	
    WebDriver d;
    
    @BeforeTest
	
	public void login() {
		 
		    WebDriverManager.chromedriver().setup();
	        d = new ChromeDriver(); // Assign to the class-level WebDriver 'd'
	        d.get("https://www.saucedemo.com/v1/");
	        d.findElement(By.id("user-name")).sendKeys("standard_user");
	        d.findElement(By.id("password")).sendKeys("secret_sauce");
	        d.findElement(By.id("login-button")).click();
	        System.out.println("test");
	        System.out.println("test1"); 
}   
	
	@Test
	public void verifyTitle() {
		String T = d.getCurrentUrl();
		System.out.println(T);
		Assert.assertEquals((d.getCurrentUrl()), "https://www.saucedemo.com/v1/inventory.html");
	}
	
	@AfterTest
	public void logout() {
		d.close();
	}
	

}


