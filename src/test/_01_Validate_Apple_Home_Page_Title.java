package test;

import org.openqa.selenium.WebDriver;
import utils.Driver;

public class _01_Validate_Apple_Home_Page_Title {
    /*
    TEST CASE
    1. Go to "https://www.apple.com/"
    2. Validate the title of the page is displayed as "Apple"

    NOTE:
    The <title></title> tag defines the title of the HTML document, and it goes into <head></head> tag
    Title is displayed in the browser's title bar or in the page's tab
    driver.getTitle(); // this line returns the title of the current page as a String
     */

    public static void main(String[] args) {
        // 1. Use Driver util method - getDriver() to set driver to be used for the script
        WebDriver driver = Driver.getDriver();

        // 2. Navigate to the "https://www.apple.com/" using get() method
        driver.get("https://www.apple.com/");

        // 3. Check if the actual title displayed on the page is equal to the expected title
        String expectedTitle = "Apple";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)) System.out.println("The title validation PASSED");
        else System.out.println("The title validation FAILED");

        // 4. Use Driver util method - quitDriver() to quit browser session
        Driver.quitDriver();
    }
}
