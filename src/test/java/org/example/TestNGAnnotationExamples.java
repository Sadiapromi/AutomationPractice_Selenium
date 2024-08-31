package org.example;

import org.testng.annotations.*;

public class TestNGAnnotationExamples {
    @Test(priority = 0)
    public void test1() {
        System.out.println(" This is normal Test Case 2");
    }
    @Test(priority = 1)
    public void test2() {
        System.out.println("Test Case 1");
    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This will Execute Before Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("This will Execute After Method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("This will Execute Before Class Execution");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("This will Execute After Class Execution");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("This will Execute Before Test ");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("This will Execute After Test ");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("This will Execute Before Suite ");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("This will Execute After Suite ");
    }
}
