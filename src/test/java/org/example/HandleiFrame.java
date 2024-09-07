package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandleiFrame extends BrowserSetup{
    @Test
    public void test_iFrame() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        //casting to javascript executor in browser
        JavascriptExecutor javaScript=(JavascriptExecutor)browser;
        //for scroll to iframe position
        WebElement scrollElement= getElement(By.xpath("//legend[text()='iFrame Example']"));
        javaScript.executeScript("arguments[0].scrollIntoView();",scrollElement);
        Thread.sleep(2000);
        //for take into iframe name or id
        // browser.switchTo().frame("courses-iframe");
        //another way
       // browser.switchTo().frame(getElement(By.id("courses-iframe")));
        //using index
        browser.switchTo().frame(0);
        getElement(By.xpath("//a[text()='Register']"));
        Thread.sleep(2000);
        //for back to normal page
       // browser.switchTo().parentFrame();
        //if multiple iframe then we can go parent page by using default
        browser.switchTo().defaultContent();
        getElement(By.xpath("//legend[text()='iFrame Example']"));





    }
}