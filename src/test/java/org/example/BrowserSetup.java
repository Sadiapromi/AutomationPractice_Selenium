package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BrowserSetup {

    public WebDriver browser;
    @BeforeSuite

    public void startBrowser(){
        browser=new ChromeDriver();
    }
    @AfterSuite
    public void quitBrowser(){
        browser.quit();

    }
    //to avoid everytime -browser.findElement
    public WebElement getElement(By locator){
        return browser.findElement(locator);
    }
    //for writing on element(string text)
    public void writeOnElement(By locator,String text){
        getElement(locator).clear();
        getElement(locator).sendKeys(text);
    }
    //for display
    public Boolean displayStatus(By locator){
        return getElement(locator).isDisplayed();
    }
    public void clickOnElement(By locator){
        getElement(locator).click();
    }

}