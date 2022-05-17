package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import java.util.List;

public class _10_findElement_findElements_Methods {
    /*
    -There are mainly 2 methods helps us to locate elements
    -findElement() method returns a single web element, and it can be stored in a WebElement variable
    -findElements() method returns a list of web elements, and they can be stored in a List<WebElement>

    NOTE: if element is not found with findElement() method, it will throw a NoSuchElementException
    NOTE: if elements are not found with findElements() method, it will not throw an exception and returns size as zero

    TEST CASE:
    1. Go to https://www.wikipedia.org/
    2. Validate the first primary language link is "English ..."
    3. Validate there are 10 primary languages displayed around the wiki image logo
     */
    public static void main(String[] args) {
        // 1. Use Driver util method - getDriver() to set driver to be used for the script
        WebDriver driver = Driver.getDriver();

        // 2. Navigate to "https://www.wikipedia.org/" using get() method
        driver.get("https://www.wikipedia.org/");

        // 3. Locate the primary languages and validate them
        WebElement wikiFirstPrimaryLanguage = driver.findElement(By.cssSelector("div[class='central-featured'] a"));
        List<WebElement> listOfPrimaryLanguages= driver.findElements(By.cssSelector("div[class='central-featured'] a"));

        System.out.println(wikiFirstPrimaryLanguage.getText()); // English ...
        System.out.println(listOfPrimaryLanguages.size()); // 10

        // 4. Use Driver util method - quitDriver() to quit browser session
        Driver.quitDriver();
    }
}
