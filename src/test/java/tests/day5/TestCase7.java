package tests.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class TestCase7 {

    public static void main(String[] args) {


        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.xpath("//a[contains(text(),'Registration Form')]")).click();

        BrowserUtils.wait(1);

        driver.findElement(By.xpath("//input[@placeholder='email@email.com']")). sendKeys("testers@email");

        BrowserUtils.wait(2);

        String actualwarningMessage3 = driver.findElement(By.xpath("//small[contains(text(),'email address is not a valid')]")).getText();
        String actualwarningMessage4 = driver.findElement(By.xpath("//small[contains(text(),'Email format is not correct')]")).getText();
        String actualwarningMessage5= actualwarningMessage3 + actualwarningMessage4;

        String expectedwarningMessage3 = "email address is not a valid";
        String expectedwarningMessage4="Email format is not correct";
        String expectedwarningMessage5= expectedwarningMessage3 + expectedwarningMessage4;



        System.out.println("Expected warning message: " +expectedwarningMessage5 );
        System.out.println("Actual warning message: "+actualwarningMessage5);

        if (expectedwarningMessage5.equals(actualwarningMessage5)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
        driver.quit();
    }
}

