package tests.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class TestCase5 {
    public static void main(String[] args) {


        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.xpath("//a[contains(text(),'Registration Form')]")).click();

        BrowserUtils.wait(1);

        driver.findElement(By.xpath("//input[@placeholder='last name']")). sendKeys("123");

        BrowserUtils.wait(2);



        String expectedwarningMessage1 = "The last name can only consist of alphabetical letters and dash";
        String actualwarningMessage1 = driver.findElement(By.xpath("//small[text()='The last name can only consist of alphabetical letters and dash']")).getText();

        if (expectedwarningMessage1.equals(actualwarningMessage1)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
        driver.quit();
    }
}

