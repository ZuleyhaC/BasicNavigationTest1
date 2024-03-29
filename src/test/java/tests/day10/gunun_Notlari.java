package tests.day10;

public class gunun_Notlari {



}
//Today is 11/18/2019
//Agenda:
//    Windows, how to switch in between windows/tabs
//    Frames
//    File uploading
//    Alerts/Pop-ups
//     driver.switchTo().window(windowHandle); - in thins way we can switch to another window.
//     window handle - it's like window id
//
//     //set can store only unique values
//     //getWindowHandles() return collection of window id's that are currently opened by webdriver
//     Set<String> windowHandles = driver.getWindowHandles();
//     String pageTitle = "Practice"; //title of the page that we want
//        for (String windowHandle : windowHandles) {
//            //keep jumping from window to window
//            driver.switchTo().window(windowHandle);
//            //once we found a correct page title
//            if(driver.getTitle().equals(pageTitle)){
//                //just exit
//                //stop jumping
//                break;
//            }
//        }
////to open new blank tab
// driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
//ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
//driver.switchTo().window(tabs.get(0));
//to open hyperlink in the new window use command/control + left click
//######################
//How to upload file in Selenium?
//.sendKeys("path/to/the/file.txt")
//For Window: hold shift and make a right click on the file
//For Mac: right click and click and hold option button --> copy as a path name
//"\"C:\\users\\user\\desktop\\file.txt\""
//change \ to \\ or, /. also remove extra double quotes \"
//package tests.day10;
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//import utils.BrowserFactory;
//import utils.BrowserUtils;
//public class PopUpPractice {
//    private WebDriver driver;
//    @BeforeMethod
//    public void setup(){
//        driver = BrowserFactory.getDriver("chrome");
//        driver.get("http://practice.cybertekschool.com/");
//    }
//    @Test(description = "Click on button 1 and click ok in pop up message")
//    public void test1(){
//        driver.findElement(By.linkText("JavaScript Alerts")).click();
//        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//        BrowserUtils.wait(2);
//        //to deal with popup, we can create object of Alert
//        //Switches to the currently active modal dialog
//        Alert alert = driver.switchTo().alert();
//        alert.accept();//to click ok
//        BrowserUtils.wait(2);
//    }
//    @Test(description = "Click on button 2 and click cancel in pop up message")
//    public void test2(){
//        driver.findElement(By.linkText("JavaScript Alerts")).click();
//        //[2] means second button out of available, since there are 3 buttons
//        //I use [index]
//        driver.findElement(By.xpath("//button[2]")).click();
//        BrowserUtils.wait(2);
//        Alert alert = driver.switchTo().alert();
//        //print text of popup message
//        System.out.println(alert.getText());
//        //to click cancel
//        alert.dismiss();
//        BrowserUtils.wait(2);
//        //to print text of result
//        System.out.println(driver.findElement(By.id("result")).getText());
//    }
//    @Test(description = "Click on button 3, enter some text and then click OK")
//    public void test3(){
//        driver.findElement(By.linkText("JavaScript Alerts")).click();
//        driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();
//        BrowserUtils.wait(2);
//        driver.switchTo().alert().sendKeys("Java is fun!");
//        BrowserUtils.wait(2);
//        driver.switchTo().alert().accept();
//        //to print text of result
//        //should be Java is fun!
//        System.out.println(driver.findElement(By.id("result")).getText());
//        BrowserUtils.wait(2);
//    }
//    @AfterMethod
//    public void teardown(){
//        driver.quit();
//    }
//}
//package tests.day10;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//import utils.BrowserFactory;
//import utils.BrowserUtils;
//public class FileUploading {
//    private WebDriver driver;
//    @BeforeMethod
//    public void setup(){
//        driver = BrowserFactory.getDriver("chrome");
//        driver.get("http://practice.cybertekschool.com/");
//    }
//    @Test(description = "Verify that file was uploaded")
//    public void test1(){
//        driver.findElement(By.linkText("File Upload")).click();
//        //provide path to the file
//        //insert your path to the file into sendKeys() method
//        driver.findElement(By.id("file-upload")).sendKeys("/Users/studio2/Desktop/class_notes.txt");
//        //click submit
//        driver.findElement(By.id("file-submit")).click();
//        BrowserUtils.wait(5);
//        //make sre that it's your file name
//        String expectedFileName = "class_notes.txt";
//        String actualFileName = driver.findElement(By.id("uploaded-files")).getText();
//        Assert.assertEquals(actualFileName, expectedFileName);
//    }
//    @AfterMethod
//    public void teardown(){
//        driver.quit();
//    }
//}
//package tests.day10;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//import utils.BrowserFactory;
//import utils.BrowserUtils;
//import java.util.Set;
//public class WindowSwitching {
//    private WebDriver driver;
//    @BeforeMethod
//    public void setup() {
//        driver = BrowserFactory.getDriver("chrome");
//        driver.get("http://practice.cybertekschool.com/");
//        driver.manage().window().maximize();
//    }
//    @Test(description = "Verify that title is still Practice")
//    public void test1() {
//        driver.findElement(By.linkText("New tab")).click();
//        //after 3 seconds, another website will be opened,in the second window
//        //selenium doesn't switch automatically to the new window
//        BrowserUtils.wait(5);
//        System.out.println(driver.getTitle());
//        Assert.assertEquals(driver.getTitle(), "Practice", "Title is wrong!");
//    }
//    @Test(description = "Verify that user is able to see new window")
//    public void test2() {
//        driver.findElement(By.linkText("New tab")).click();
//        //record id of original window, that we opened initially
//        String oldWindow = driver.getWindowHandle();
//        //after 3 seconds, another website will be opened,in the second window
//        //selenium doesn't switch automatically to the new window
//        BrowserUtils.wait(5);
//        //in the selenium every window has an id. That id calls window handle
//        //to read window handle we use a method getWindowHandle()
//        //after new window was opened, we can get list of all window id's/window handles
//        //list - it's a data structure
//        //set it's also a data structure, like list, but it doesn't allow duplicates
//        //also, you cannot easily access anything from there
//        //there is no .get() method
//        //that's why, we need to loop through the set, to read a data from there
//        //set can store only unique values
//        Set<String> windowHandles = driver.getWindowHandles();
//        //loop through the collection of window handles
//        for (String windowHandle : windowHandles) {
//            //if it's not an old window
//            if (!windowHandle.equals(oldWindow)) {
//                //switch to that window
//                driver.switchTo().window(windowHandle);
//            }
//        }
//        //let's verify that title of new window is a Fresh tab
//        System.out.println(driver.getTitle());
//        Assert.assertEquals(driver.getTitle(), "Fresh tab", "Title is wrong!");
//        //comeback to original page
//        //we can build a function, that will jump in between windows
//        //based on page title, we can determine where to stop
//        String pageTitle = "Practice"; //title of the page that we want
//        for (String windowHandle : windowHandles) {
//            //keep jumping from window to window
//            driver.switchTo().window(windowHandle);
//            //once we found a correct page title
//            if(driver.getTitle().equals(pageTitle)){
//                //just exit
//                //stop jumping
//                break;
//            }
//        }
//        System.out.println(driver.getTitle());
//    }
//    @AfterMethod
//    public void teardown() {
//        driver.quit();
//    }
//}