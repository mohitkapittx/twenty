package DataPro;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Sause2 {
	
		    
		    @Parameters("browser")
		    @Test
		    
		    public void testMethod(String browser) {
		        System.out.println("Executing test on browser: " + browser);

		        // You can add browser-specific logic here
		        if (browser.equalsIgnoreCase("chrome")) {
		            System.out.println("Launching Chrome browser");
		            // Set up ChromeDriver, etc.
		        } else if (browser.equalsIgnoreCase("firefox")) {
		            System.out.println("Launching Firefox browser");
		            // Set up FirefoxDriver, etc.
		        }
		    }
		


}
