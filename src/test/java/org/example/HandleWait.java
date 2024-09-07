package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class HandleWait extends BrowserSetup {
    @Test
    public void testWait() throws InterruptedException {
        browser.get("https://qavbox.github.io/demo/alerts/");
        clickOnElement(By.id("delayalert"));
        // Thread.sleep(1000);
        WebDriverWait wait=new WebDriverWait(browser, Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.alertIsPresent());
      // Alert alert=browser.switchTo().alert();
        //to avoid switch alert
        Alert alert=wait.until(ExpectedConditions.alertIsPresent());
        Assert.assertEquals(alert.getText(),"I appeared after 5 seconds!");

        alert.accept();
        browser.get("https://qavbox.github.io/demo/delay/");
        clickOnElement(By.name("commit1"));
       // Thread.sleep(10000);
        //another way
      //  wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//h2[@id='delay']")));
        //another way
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(getElement(By.xpath("//h2[@id='delay']")).isDisplayed());


        
    }

}
