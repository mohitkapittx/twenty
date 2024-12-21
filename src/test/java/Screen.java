import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import Listener.Testing;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Screen extends Testing {

    public void captureScreenshot(WebDriver dr) {
        // Generate a timestamp for the screenshot name
        String timestamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
        String screenshotName = "screenshot_" + timestamp + ".png";

        // Define the destination folder
        String destination = System.getProperty("user.dir") + "/screenshots/" + screenshotName;

        // Take the screenshot
        File srcFile = ((TakesScreenshot) dr).getScreenshotAs(OutputType.FILE);

        try {
            // Save the screenshot to the destination
            FileUtils.copyFile(srcFile, new File(destination));
            System.out.println("Screenshot saved at: " + destination);
        } catch (IOException e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
        }
    }
}
