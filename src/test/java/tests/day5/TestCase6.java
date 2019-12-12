package tests.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class TestCase6 {
    public static void main(String[] args) {


        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.xpath("//a[contains(text(),'Registration Form')]")).click();

        BrowserUtils.wait(1);

        driver.findElement(By.xpath("//input[@placeholder='username']")). sendKeys("user");

        BrowserUtils.wait(2);



        String expectedwarningMessage2 = "The username must be more than 6 and less than 30 characters long";
        String actualwarningMessage2 = driver.findElement(By.xpath("//small[text()='The username must be more than 6 and less than 30 characters long']")).getText();

        System.out.println("Expected warning message: " +expectedwarningMessage2);
        System.out.println("Actual warning message: "+actualwarningMessage2);

        if (expectedwarningMessage2.equals(actualwarningMessage2)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
        driver.quit();
    }
}

