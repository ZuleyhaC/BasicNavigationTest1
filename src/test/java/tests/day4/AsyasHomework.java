package tests.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class AsyasHomework {

    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://qa2.vytrack.com/user/login ");
        WebElement input = driver.findElement(By.name("_username"));
        // Keys.ENTER will simulate ENTER button press
        input.sendKeys("user151", Keys.ENTER);
        WebElement password = driver.findElement(By.name("_password"));
        password.sendKeys("UserUser123", Keys.ENTER);
        WebElement button = driver.findElement(By.id("_submit"));
        button.click();
        BrowserUtils.wait(2);
        String expectedUrl = "https://qa2.vytrack.com/";
        String actualUrl = driver.getCurrentUrl();
        if (expectedUrl.equals(actualUrl)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
        BrowserUtils.wait(2);
        driver.close();
    }
}
