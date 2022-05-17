package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class _09_isDisplayed_isEnabled_isSelected_Methods {
    /*
    -All these methods are used with web elements and return true or false
    -isDisplayed() method is used to verify the presence of a particular web element and, it will return true if element is found, and false otherwise
    -isEnabled() is mostly used with buttons, and it verifies if the web element is enabled or disabled
    -isSelected() is mostly used with radio buttons, dropdowns and checkboxes, and it verifies if the web element is selected or not

    TEST CASE:
    1. Go to "https://www.united.com/en/us"
    2. Validate the "UNITED" logo is displayed
    3. Validate the "Round trip" radio button is selected by default
    4. Validate the "Find flights" button is enabled by default
     */
    public static void main(String[] args) {
        // 1. Use Driver util method - getDriver() to set driver to be used for the script
        WebDriver driver = Driver.getDriver();

        // 2. Navigate to "https://www.united.com/en/us" using get() method
        driver.get("https://www.united.com/en/us");

        // 3. Locate the "Round trip" radio button and "Find flights" button elements and validate them
        WebElement unitedLogo = driver.findElement(By.id("unitedLogo"));
        WebElement roundTripRadioButton = driver.findElement(By.id("roundtrip"));
        WebElement findFlightsButton = driver.findElement(By.cssSelector("button[aria-label='Find flights']"));

        System.out.println(unitedLogo.isDisplayed()); // true
        System.out.println(roundTripRadioButton.isSelected()); // true
        System.out.println(findFlightsButton.isEnabled()); // true

        // 4. Use Driver util method - quitDriver() to quit browser session
        Driver.quitDriver();
    }
}
