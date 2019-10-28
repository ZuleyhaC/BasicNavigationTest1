package tests.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;

public class ReadAttributesTest {

    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement input=driver.findElement(By.name("email"));
        //this is to read value of any attribute
        //in this case name="email" name its an attribute, email its a alur of attribute
        System.out.println(input.getAttribute("pattern"));
        input.sendKeys("random_email@email.com");
        //how to read antered text?
        //its gonna be inside value attribute
        System.out.println(input.getAttribute("value"));
        //if button has a type "submit"
        //we can use .submit() method instead of click() as well
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        //alternative to click, only if type="submit"
        retrievePasswordButton.submit();
        driver.close();
    }
}