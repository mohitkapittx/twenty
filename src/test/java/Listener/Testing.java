package Listener;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(List.class)    
public class Testing extends Base {
	
	
	 @Test
	public void Test1()  {
		WebDriverManager.chromedriver().setup();
        dr= new ChromeDriver();
		dr.get("https://www.saucedemo.com/v1/");
		dr.findElement(By.id("user-name")).sendKeys("standard_user");
		dr.findElement(By.id("password")).sendKeys("secret_sauce");
		dr.findElement(By.id("login-button")).click();
		
		String exp ="Swag 1Labs";
		String act = dr.getTitle();
		
		Assert.assertEquals(exp , act , "match");
		dr.close();
	}
	
	
	
	

}
