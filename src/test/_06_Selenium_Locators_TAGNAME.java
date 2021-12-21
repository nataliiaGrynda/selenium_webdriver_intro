package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class _06_Selenium_Locators_TAGNAME {
    /*
    -This locator type uses tag names to identify elements in a web page
    -It is the HTML tag, such as input, div, anchor, button, etc.
    -The tagName locator returns all the elements from the page that has the specified tag

    TEST CASE:
    1. Go to https://www.wikipedia.org/
    2. Validate the Wiki Image-Logo is displayed

    NOTE: The Wiki Image-Logo has a tag img
     */

    public static void main(String[] args) {
        // 1. Use Driver util method - getDriver() to set driver to be used for the script
        WebDriver driver = Driver.getDriver();

        // 2. Navigate to "https://www.wikipedia.org/" using get() method
        driver.get("https://www.wikipedia.org/");

        // 3. Locate the image-logo element and make sure that it is displayed
        WebElement wikiImageLogo = driver.findElement(By.tagName("img"));

        if(wikiImageLogo.isDisplayed()) System.out.println("The wiki image logo validation PASSED");
        else System.out.println("The wiki image logo validation FAILED");

        // 4. Use Driver util method - quitDriver() to quit browser session
        Driver.quitDriver();
    }
}
