package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class _08_Selenium_Locators_BASIC_XPATH_CSSSELECTOR {
    /*
    -CSS Selector and XPath have their own syntax, and both have their own advantages over each other
    -We will cover more about them with upcoming demo classes but overall
    -xpath is the most flexible locator to identify web elements while css is faster than xpath
    -There are 2 types of XPath:
        -Absolute XPath: /html/body/form/div/span/span
        -Relative XPath: //tagName[@attribute=’value’]

    XPATH:
    -Syntax:
        //tagName[@attribute=‘attributeValue’]
    -It is a syntax or language that provides a way to locate and process the elements in XML document
    -It is used in Selenium to uniquely identify any element on a web page using HTML DOM structure
    -xpath can access any element present in the web page even when they have dynamic properties

    CSS SELECTOR
    -Syntax:
        tagName[attribute=‘attributeValue’]
    -CSS Selector is the cascading stylesheet path
    -It is a pattern to find an element in a web page

    TEST CASE:
    1. Go to https://www.wikipedia.org/
    2. Validate the search input box is displayed
    3. Validate the search button is displayed

    NOTE: The search input box has a name attribute as "search"
    NOTE: The search button has a class attribute as "pure-button pure-button-primary-progressive"
     */

    public static void main(String[] args) {
        // 1. Use Driver util method - getDriver() to set driver to be used for the script
        WebDriver driver = Driver.getDriver();

        // 2. Navigate to "https://www.wikipedia.org/" using get() method
        driver.get("https://www.wikipedia.org/");

        // 3. Locate the search input box and search button elements and make sure that they are displayed
        WebElement wikiSearchInputBox = driver.findElement(By.xpath("//input[@name='search']"));
        WebElement wikiSearchButton = driver.findElement(By.cssSelector("button[class='pure-button pure-button-primary-progressive']"));

        if(wikiSearchInputBox.isDisplayed()) System.out.println("The wiki search input box validation PASSED");
        else System.out.println("The wiki search input box validation FAILED");

        if(wikiSearchButton.isDisplayed()) System.out.println("The wiki search button validation PASSED");
        else System.out.println("The wiki search button validation FAILED");

        // 4. Use Driver util method - quitDriver() to quit browser session
        Driver.quitDriver();
    }
}
