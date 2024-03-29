package tests.day7;

public class GununNotlari {
}
//Datte: 11/12/2019
//Agenda: TestNG
//testing pyramid:
//UAT
//system
//integration
//unit
//unit testing - it's a testing of the smallest functional part of the application.
//smallest functional part = method
//Why developers test their methods?
//To make sure that method works as expected. It helps to prevent bugs on the UAT stage of testing.
//public static String reverseAString(String arg){
//    String reversed = "";
//    for(int i=arg.length()-1;i>=0;i--){
//        reversed+=arg.charAt(i)+"";
//    }
//    return reversed
//}
//How to make sure that it's working as expected?
//String expected = "tac"
//String word = "cat";
//reverseAString(word).equals(expected)
//if yes (true) - then test passed, if no (false) - then test failed.
//What's the role of TestNG over here?
//The thing is, TestNG is a unit, integration, e2e, etc.. testing framework.
//Before testng, there was Junit, which is only unit testing framework. Still, Junit is more popular.
//Why do we use testng with selenium?
//We can create test scripts as methods. So in testng, test looks like this:
//@Test
//public void test(){
//
//}
//TestNG has a report, xml runners, it support Data Driven Testing, test priorities, test dependencies, parametrization of test, it a lot of annotations to configure test suite execution, etc...
//How to add testng? It's just another library. We can add it manually, or add maven dependency.
//IF assertion fails, it will stop the program. And you will see everything is red in the console.
//If it's green, that means everything is good and test/tests passed
//===============================================
//Default Suite
//Total tests run: 1, Failures: 0, Skips: 0
//===============================================
//For every feature or page of the application we can create a test class. Let's say LoginTests. Then for every test case we can create a separate test method.
//java.lang.AssertionError: Element is not visible expected [true] but found [false]
//Expected :true
//Actual   :false
//<Click to see difference>
//assertEquals() - to check is 2 things are the same.
//assertTrue() - to check if something true.
//In both cases, if there is some miss match (should be true, but false; must be equals but not equals) test will step, and test will be marked as a failed. Also, in the console, you can see where it failed.
//#######If test fails, why driver.quit() doesn't work?
//Because program stops, and it doesn't reach driver.quit() line, because assertion stops program (in case of failure).
//public class AnnotationsTest {
//    //runs only ones before beforeMethod, and before all tests
//    @BeforeClass
//    public void beforeClass() {
//        System.out.println("Before class!");
//    }
//    //runs only ones after afterMethod, and after all tests
//    @AfterClass
//    public void afterClass(){
//        System.out.println("After class!");
//    }
//    // runs automatically before every test
//    @BeforeMethod
//    public void setup() {
//        //some code that will be running before every test, like: test1, test2, test3...
//        //we can use method with @BeforeMethod annotation
//        System.out.println("Before method!");
//    }
//    // runs automatically after every test
//    @AfterMethod
//    public void teardown() {
//        System.out.println("After Method!");
//    }
//    @Test
//    public void test1() {
//        System.out.println("Test 1!");
//        Assert.assertTrue(5 == 5);
//    }
//    @Test
//    public void test2() {
//        System.out.println("Test 2!");
//    }
//    @Test
//    public void test3() {
//        System.out.println("Test 3!");
//    }
//}
//