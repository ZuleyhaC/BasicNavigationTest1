package tests.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.BrowserFactory;
import utils.BrowserUtils;

public class TestCase3 {
    public static void main(String[] args) {
        chromeTest();
        fireFoxTest();
     //   edgeTest();
    }



        public static void chromeTest(){
            WebDriver driver = BrowserFactory.getDriver("chrome");
            driver.get("http://practice-cybertekschool.herokuapp.com/");
            driver.findElement(By.linkText("Multiple Buttons")).click();

            BrowserUtils.wait(1);

            driver.findElement(By.tagName("button")).click();

            String expectedResult = "Clicked on button one!";
            String actualResult = driver.findElement(By.id("result")).getText();


            System.out.println("Expected Result: " + expectedResult);
            System.out.println("Actual result: " + actualResult);


            if (expectedResult.equals(actualResult)) {
                System.out.println("PASS for chrome");
            } else {
                System.out.println("FAIL for chrome");
            }

            driver.close();

        }

    public static void fireFoxTest(){
        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.get("http://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.linkText("Multiple Buttons")).click();

        BrowserUtils.wait(1);

        driver.findElement(By.tagName("button")).click();

        String expectedResult = "Clicked on button one!";
        String actualResult = driver.findElement(By.id("result")).getText();


        System.out.println("Expected Result: " + expectedResult);
        System.out.println("Actual result: " + actualResult);


        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS for firefox");
        } else {
            System.out.println("FAIL for firefox");
        }

        driver.close();

    }


    public static void edgeTest(){
        WebDriver driver = BrowserFactory.getDriver("edge");
        driver.get("http://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.linkText("Multiple Buttons")).click();

        BrowserUtils.wait(1);

        driver.findElement(By.tagName("button")).click();

        String expectedResult = "Clicked on button one!";
        String actualResult = driver.findElement(By.id("result")).getText();


        System.out.println("Expected Result: " + expectedResult);
        System.out.println("Actual result: " + actualResult);


        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        driver.close();

    }
    }




