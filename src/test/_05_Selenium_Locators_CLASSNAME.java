package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class _05_Selenium_Locators_CLASSNAME {
    /*
    -className locator allows Selenium to find web elements based on the class attribute
    -It allows us to locate web elements with class attribute
    -When using the class attribute for the identification of a web element, always make sure that the class attribute is unique

    TEST CASE:
    1. Go to https://www.wikipedia.org/
    2. Validate the "Text Logo" heading is displayed on the top of the page

    NOTE: The "Text Logo" heading has a class attribute as "central-textlogo__image sprite svg-Wikipedia_wordmark"
     */

    public static void main(String[] args) {
        // 1. Use Driver util method - getDriver() to set driver to be used for the script
        WebDriver driver = Driver.getDriver();

        // 2. Navigate to "https://www.wikipedia.org/" using get() method
        driver.get("https://www.wikipedia.org/");

        // 3. Locate the search input element and make sure that it is displayed
        WebElement wikiTextLogo = driver.findElement(By.className("central-textlogo__image"));

        if(wikiTextLogo.isDisplayed()) System.out.println("The wiki text logo validation PASSED");
        else System.out.println("The wiki text logo validation FAILED");

        // 4. Use Driver util method - quitDriver() to quit browser session
        Driver.quitDriver();
    }
}
