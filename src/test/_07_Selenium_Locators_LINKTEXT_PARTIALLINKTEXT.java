package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class _07_Selenium_Locators_LINKTEXT_PARTIALLINKTEXT {
    /*
    -linkText and partialLinkText  are quite similar and used to locate web elements by using the hyperlink texts
    -They can be used for elements created with anchor (<a></a>) tag
    -Like the other locator strategies, if multiple hyperlinks with the same texts are present on the page, then you will get a list of web elements

    TEST CASE:
    1. Go to https://www.google.com
    2. Validate the Gmail and Images links are displayed on the top-right of the page

    NOTE: These 2 elements are created with anchor tag and their texts are respectively "Gmail" and "Images"
     */

    public static void main(String[] args) {
        // 1. Use Driver util method - getDriver() to set driver to be used for the script
        WebDriver driver = Driver.getDriver();

        // 2. Navigate to "https://www.google.com/" using get() method
        driver.get("https://www.google.com/");

        // 3. Locate the Gmail and Images elements and make sure that they are displayed
        WebElement gmailLinkText = driver.findElement(By.linkText("Gmail"));
        WebElement imagesLinkText = driver.findElement(By.partialLinkText("Ima"));

        if(gmailLinkText.isDisplayed()) System.out.println("The Gmail link validation PASSED");
        else System.out.println("The Gmail link validation FAILED");

        if(imagesLinkText.isDisplayed()) System.out.println("The Images link validation PASSED");
        else System.out.println("The Images link validation FAILED");

        // 4. Use Driver util method - quitDriver() to quit browser session
        Driver.quitDriver();
    }
}
