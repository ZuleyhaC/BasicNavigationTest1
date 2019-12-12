package tests.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class TestCase1 {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.linkText("Sign Up For Mailing List")).click();

        WebElement inputBox = driver.findElement(By.name("full_name"));
        inputBox.sendKeys("Zuleyha");
        WebElement inputBox1 = driver.findElement(By.name("email"));
        inputBox1.sendKeys("zuleyhacakar@gmail.com");
        WebElement button = driver.findElement(By.name("wooden_spoon"));
        button.click();

        BrowserUtils.wait(2);
        WebElement signupmessage = driver.findElement(By.name("signup_message"));
        String expectedMessage = "Thank you for signing up. Click the button below to return to the home page.";
        String actualMessage = signupmessage.getText();

        if (expectedMessage.equals(actualMessage)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
        driver.quit();

    }
}
