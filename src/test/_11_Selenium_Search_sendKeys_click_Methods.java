package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class _11_Selenium_Search_sendKeys_click_Methods {
    /*
    TEST CASE:
    1. Go to "https://www.wikipedia.org/"
    2. Search for "Tesla"
    3. Validate the main heading of the page is "Tesla"

    NOTE: for the test case below we will use sendKeys(), click() and getText() methods
    -click() method: this method is used to click on a located web element
    -sendKeys() method: this method is used to type in a located input web element
    -getText() method: this method is used to get the inner text of a located web element
     */
    public static void main(String[] args) throws InterruptedException {
        // 1. Use Driver util method - getDriver() to set driver to be used for the script
        WebDriver driver = Driver.getDriver();

        // 2. Navigate to "https://www.wikipedia.org/" using get() method
        driver.get("https://www.wikipedia.org/");

        // 3. Locate the wiki search input box and search button
        WebElement wikiSearchInputBox = driver.findElement(By.id("searchInput"));
        WebElement wikiSearchButton = driver.findElement(By.className("pure-button-primary-progressive"));

        // 4. Search for "Tesla" using located elements above
        wikiSearchInputBox.sendKeys("Tesla");
        wikiSearchButton.click();

        /*
        //Search could be used as below as well instead of line 34 and 35
        wikiSearchInputBox.sendKeys("Tesla" + Keys.ENTER);
         */

        // 5. Locate and validate the main heading of the page is "Tesla"
        WebElement mainHeading = driver.findElement(By.id("firstHeading"));

        System.out.println(mainHeading.getText()); // Tesla

        // 6. Use Driver util method - quitDriver() to quit browser session
        Driver.quitDriver();
    }
}
