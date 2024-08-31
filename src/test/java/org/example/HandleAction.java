package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class HandleAction extends BrowserSetup{
    @Test
    public void testAction() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        Actions action=new Actions(browser);
        //to ignore write getElement---------
        WebElement hoverElement=getElement(By.xpath("//button[@id='mousehover']"));
        action.scrollToElement(getElement(By.xpath("//button[@id='mousehover']"))).build().perform();
        action.scrollByAmount(0,150).build().perform();
        action.clickAndHold(hoverElement).build().perform();
        //clickOnElement(By.xpath("//button[@id='mousehover']"));
        Thread.sleep(2000);
        clickOnElement(By.xpath("//a[normalize-space()='Top']"));
        Thread.sleep(2000);
        //up to down arrow
        clickOnElement(By.id("dropdown-class-example"));
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(2000);
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(2000);
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(2000);
        action.sendKeys(Keys.ARROW_UP).build().perform();
        Thread.sleep(2000);
        //control copy-paste
        action.sendKeys(getElement(By.xpath("//input[@id='autocomplete']")),"Hello").build().perform();
        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
        action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        getElement(By.xpath("//input[@id='name']")).sendKeys(Keys.CONTROL,"v");
        Thread.sleep(3000);
        //we can write single line
       /* action.sendKeys(getElement(By.xpath("//input[@id='autocomplete']")),"Promi").build().perform();
        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
        action.keyDown(Keys.CONTROL);
        action.sendKeys("c");
        action.keyUp(Keys.CONTROL).build().perform();
        getElement(By.xpath("//input[@id='name']")).sendKeys(Keys.CONTROL,"v");*/













    }
}