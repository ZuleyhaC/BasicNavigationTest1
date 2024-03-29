//Today 12/9/2019
//
//	Agenda: xml runners in testng.
//
//
//	testng xml runners helps to develop test suits. We can specify what tests we want to include into specific suit. For example for major regression, we need to include all tests that we have. But, when it comes to minor regression, we need to specify some group of tests only.
//
//	How to create testng xml runner file?
//
//Step 1. Create something.xml under project. This file will be next to pom.xml file. Default name is testng.xml.
//
//Right click on project name --> New --> File --> testng.xml
//
//Step 2. Put this line into testng.xml file
//
//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
//
//This line indicates that it's a testng runner file
//
//DTD Stands for “Document Type Definition.” A DTD defines the tags and attributes used in an XML or HTML document.
//
//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
//<suite name="Regression">
//    <test name="Login tests">
//        <classes>
//            <class name="tests.vytrack.LoginTests"/>
//        </classes>
//    </test>
//</suite>
//
///Users/cybertekstudios/IdeaProjects/Summer2019OnlineTestNGSeleniumProject/src/test/java/tests/vytrack/LoginTests.java
//
//tests.vytrack.LoginTests
//
//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
//<suite name="Regression">
//   <test name="Login tests">
//       <classes>
//           <class name="test." />
//
//       </classes>
//   </test>
//</suite>
//
//If you have this message, then put http instead of https
//
//[TestNGContentHandler] [WARN] It is strongly recommended to add "<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" >" at the top of your file, otherwise TestNG may fail or not work as expected.       ---------->>> what does this line means?
//
//
//<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" >
//<suite name="Regression">
//    <test name="Login tests">
//        <classes>
//            <class name="tests.vytrack.LoginTests"/>
//        </classes>
//    </test>
//    <test name="Calendar events tests">
//        <classes>
//            <class name="tests.vytrack.NewCalendarEventsTests"/>
//        </classes>
//    </test>
//</suite>
//
//
//<!-- in this case we don't need to specify every class one by one, just include package-->
//    <test name="Vytrack regression tests">
//        <parameter name="test" value="regression"></parameter>
//        <packages>
//            <package name="tests.vytrack"></package>
//        </packages>
//    </test>
//
//
//
//
//<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" >
//<suite name="Smoke test">
//    <test name="Smoke test on QA1">
//        <parameter name="test" value="smoke_test_qa1"></parameter>
//        <parameter name="env_url" value="https://qa1.vytrack.com/"></parameter>
//        <classes>
//            <class name="tests.vytrack.SmokeTest"/>
//        </classes>
//    </test>
//    <test name="Smoke test on QA2">
//        <parameter name="test" value="smoke_test_qa2"></parameter>
//        <parameter name="env_url" value="https://qa2.vytrack.com/"></parameter>
//        <classes>
//            <class name="tests.vytrack.SmokeTest"/>
//        </classes>
//    </test>
//    <test name="Smoke test on QA3">
//        <parameter name="test" value="smoke_test_qa3"></parameter>
//        <parameter name="env_url" value="https://qa3.vytrack.com/"></parameter>
//        <classes>
//            <class name="tests.vytrack.SmokeTest"/>
//        </classes>
//    </test>
//</suite>