package tests.day4;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class AsyasHomework2 {

    /*Go to the login page of VyTrack
     •Enter invalid credential (can be any role)
     •Click login button
      •Verify that the system shows error message “Invalid user name or password.”*/

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();    // to set up WebDriver
        WebDriver driver = BrowserFactory.getDriver("chrome");     // we need to create Webdriver object.

        driver.get("https://qa2.vytrack.com/user/login");  // to get into the URL
        driver.manage().window().maximize(); // to maximize the window.

        WebElement usernameButon = driver.findElement(By.name("_username")); //we need to create WebElement obj for user name button.
        WebElement passwordButon = driver.findElement(By.name("_password")); //we need to create WebElement obj for password button.
        WebElement submitButon = driver.findElement(By.name("_submit")); //we need to create WebElement obj for submit button.

        usernameButon.sendKeys("user100"); // I want Selenium to type the username
        BrowserUtils.wait(2);  // to wait untill the elements are accessible.
        passwordButon.sendKeys("UserUser");   // I want Selenium to type the password
        BrowserUtils.wait(2);  // to wait untill the elements are accessible.
        submitButon.click();
        BrowserUtils.wait(5);

        System.out.println(driver.getCurrentUrl());  // after login i want to see the URL adress.

        // I want to check if log in successful or not by comparing the URL adresses.
        if (driver.getCurrentUrl().equals("https://qa2.vytrack.com/")) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Login failed");
        }

        driver.close();

    }
}