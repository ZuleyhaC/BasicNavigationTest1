package tests.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import java.util.List;

public class TestCase2 {
    public static void main(String[] args) {


        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice-cybertekschool.herokuapp.com/");


        List<WebElement> list=  driver.findElements(By.className("list-group-item"));
        System.out.println(list.size());
        driver.quit();

    }
}