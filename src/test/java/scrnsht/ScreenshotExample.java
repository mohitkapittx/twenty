package scrnsht;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotExample {
    public static void main(String[] args) {
        // Set up WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
       
        try {
            // Open a webpage
            driver.get("https://www.google.co.in/");
            System.out.println("Page Title: " + driver.getTitle());

            // Take a screenshot
            takeScreenshot(driver, "homepage");

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Close the browser
            driver.quit();
        }
    }

    public static void takeScreenshot(WebDriver driver, String screenshotName) {
        // Generate a timestamp for the screenshot
        String timestamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
        String fileName = screenshotName + "_" + timestamp + ".png";

        // Specify the destination folder
        String destination = System.getProperty("user.dir") + "/screenshots/" + fileName;

        // Take the screenshot
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try {
            // Save the screenshot to the destination folder
            FileUtils.copyFile(srcFile, new File(destination));
            System.out.println("Screenshot saved at: " + destination);
        } catch (IOException e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
        }
    }
}
