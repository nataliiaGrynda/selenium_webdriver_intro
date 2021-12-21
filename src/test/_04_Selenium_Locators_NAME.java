package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class _04_Selenium_Locators_NAME {
    /*
    -Like the id attribute, Selenium also offers testers a way to identify the element using the name attribute
    -But contrary to id, a web page can have multiple elements with the same name attribute
    -When using the name attribute for the identification of a web element, always make sure that the name attribute is unique

    TEST CASE:
    1. Go to https://www.google.com
    2. Validate the search input element is displayed in the middle of the page

    NOTE: The search input box has a name attribute as "q"
     */

    public static void main(String[] args) {
        // 1. Use Driver util method - getDriver() to set driver to be used for the script
        WebDriver driver = Driver.getDriver();

        // 2. Navigate to "https://www.google.com/" using get() method
        driver.get("https://www.google.com/");

        // 3. Locate the search input element and make sure that it is displayed
        WebElement searchInputBox = driver.findElement(By.name("q"));

        if(searchInputBox.isDisplayed()) System.out.println("The search input box validation PASSED");
        else System.out.println("The search input box validation FAILED");

        // 4. Use Driver util method - quitDriver() to quit browser session
        Driver.quitDriver();
    }
}
