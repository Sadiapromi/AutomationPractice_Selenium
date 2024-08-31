package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class handleScroll extends BrowserSetup{
    @Test
    public void test_Scroll() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        //casting to javascript executor in browser
        JavascriptExecutor javaScript=(JavascriptExecutor)browser;
        javaScript.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(3000);
        javaScript.executeScript("window.scrollTo(document.body.scrollHeight,0)");
        Thread.sleep(3000);
        //scroll to any-position using hover element
        WebElement hoverElement=getElement(By.xpath("//button[@id='mousehover']"));
        javaScript.executeScript("arguments[0].scrollIntoView();",hoverElement);
        Thread.sleep(3000);




    }
}