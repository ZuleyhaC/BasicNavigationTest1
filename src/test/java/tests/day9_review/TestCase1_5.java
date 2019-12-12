package tests.day9_review;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class TestCase1_5 {

    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = BrowserFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.linkText("Registration Form")).click();
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

    @Test(description = "Verify the date of birth is not valid is displayed with wrong date of birth")
    public void testcase1() {


        driver.findElement(By.xpath("//input[@name='birthday']")).sendKeys("wrong_dob");
        BrowserUtils.wait(1);
        String expectedMessage = "The date of birth is not valid";
        String actualMessage = driver.findElement(By.xpath("//small[@style='display: block;']")).getText();
        Assert.assertEquals(actualMessage, expectedMessage, "Expected message is not there!");

        System.out.println("Test  case 1");
        System.out.println("ecpected result: "+expectedMessage);
        System.out.println("actual result: "+actualMessage);

    }

     @Test( description = "Verify that  c++, java, JavaScript displayed")
     public void testcase2(){

        WebElement C= driver.findElement(By.xpath("//label[@for='inlineCheckbox1']"));
        WebElement java= driver.findElement(By.xpath("//label[@for='inlineCheckbox2']"));
        WebElement JS= driver.findElement(By.xpath("//label[@for='inlineCheckbox3']"));

         Assert.assertTrue(C.isDisplayed(),"C++ is not displayed");
         Assert.assertTrue(java.isDisplayed(),"Java is not displayed");
         Assert.assertTrue(JS.isDisplayed(),"Javascript is not displayed");


    }
    @Test( description ="Verify that warning message for firstname is displayed" )

    public void testcase3(){

        driver.findElement(By.xpath("//input[@placeholder='first name']")).sendKeys("z");
        BrowserUtils.wait(1);
        String actual =driver.findElement(By.xpath("//small[text()='first name must be more than 2 and less than 64 characters long']")).getText();
        //any other method instead ???
        String expected = "first name must be more than 2 and less than 64 characters long";
        Assert.assertEquals(actual,expected);
        System.out.println("Expected warning message is: "+expected);
        System.out.println("Actual warning message is: "+actual);

    }

    @Test(description = "Verify that warning message for lastname is displayed")

    public void testcase4(){


        driver.findElement(By.xpath("//input[@placeholder='last name']")).sendKeys("c");
        String actual1= driver.findElement(By.xpath("//small[text()='The last name must be more than 2 and less than 64 characters long']")).getText();
        String expected1 ="The last name must be more than 2 and less than 64 characters long";
        Assert.assertEquals(actual1,expected1);
        System.out.println("Expected warning message is: "+expected1);
        System.out.println("Actual warning message is: "+actual1);
    }



}