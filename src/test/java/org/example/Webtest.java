package org.example;

import org.example.BrowserSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Webtest extends BrowserSetup {
    @Test
    public void testpage() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement autocompleteTextBox =browser.findElement(By.id("autocomplete"));
        autocompleteTextBox.sendKeys("Hello");
        WebElement radio1=browser.findElement(By.name("radioButton"));
        radio1.click();
        WebElement option1= browser.findElement(By.name("checkBoxOption1"));
        option1.click();
        WebElement title =browser.findElement(By.tagName("h1"));
        System.out.println(title.getText());
        Thread.sleep(2000);
        browser.findElement(By.cssSelector("input[value='radio2']")).click();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//input[@value=\"radio3\"]")).click();

        //browser.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
        //browser.findElement(By.partialLinkText("Free Access to InterviewQues")).click();
        Thread.sleep(5000);

    }
}