package DataPro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Sauce {
	
	
	
	
	@Test  (dataProvider="setdata")
	public void login(String id , String Pass) {
		  WebDriverManager.chromedriver().setup();
		    WebDriver d = new ChromeDriver();
		    d.get("https://www.saucedemo.com/v1/");
		    d.findElement(By.id("user-name")).sendKeys(id);
		    d.findElement(By.id("password")).sendKeys(Pass);
		    d.findElement(By.id("login-button")).click();
		
	}
	@DataProvider
	public Object[][] setdata() {
	    return new Object[][] {
	        {"standard_user", "secret_sauce"}, // First set of data
	        {"problem_user", "secret_sauce"}  // Second set of data
	    };
	}


}
