package tests.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class TestCase4 {


    public static void main(String[] args) {


        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.linkText("Registration Form")).click();

        BrowserUtils.wait(1);

        WebElement inputBox = driver.findElement(By.name("firstname"));
        inputBox.sendKeys("123");

        BrowserUtils.wait(2);

        WebElement warningMessage = driver.findElement(By.xpath("//small[text()='first name can only consist of alphabetical letters']"));
        String expectedwarningMessage = "first name can only consist of alphabetical letters";
        String actualwarningMessage = warningMessage.getText();

        if (expectedwarningMessage.equals(actualwarningMessage)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
        driver.quit();
    }
}