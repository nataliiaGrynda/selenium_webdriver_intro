package test;

import org.openqa.selenium.WebDriver;
import utils.Driver;

public class _02_Validate_Apple_Home_Page_URL {
    /*
    TEST CASE
    1. Go to "https://www.apple.com/"
    2. Validate the URL of the page is displayed as "https://www.apple.com/"

    NOTE:
    driver.getCurrentUrl(); // this line returns the URL of the current page as a String
     */

    public static void main(String[] args) {
        // 1. Use Driver util method - getDriver() to set driver to be used for the script
        WebDriver driver = Driver.getDriver();

        // 2. Navigate to "https://www.apple.com/" using get() method
        driver.get("https://www.apple.com/");

        // 3. Check if the actual URL displayed on the page is equal to the expected URL
        String expectedURL = "https://www.apple.com/";
        String actualURL = driver.getCurrentUrl();

        if(actualURL.equals(expectedURL)) System.out.println("The URL validation PASSED");
        else System.out.println("The URL validation FAILED");

        // 4. Use Driver util method - quitDriver() to quit browser session
        Driver.quitDriver();
    }
}
