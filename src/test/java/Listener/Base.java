package Listener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Base {
     WebDriver dr=null;
	@BeforeSuite
	public void browserstart() {
		WebDriverManager.chromedriver().setup();
        dr= new ChromeDriver();
	}
	@AfterSuite
	public void Closebrowser() {
		dr.close();
	}
}
