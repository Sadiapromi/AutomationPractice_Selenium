package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class HandleSelectTag extends BrowserSetup{
    @Test
    public void testSelectOption() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        clickOnElement(By.id("dropdown-class-example"));
        Thread.sleep(2000);
        Select select=new Select(getElement(By.id("dropdown-class-example")));
        select.selectByVisibleText("Option2");
        Thread.sleep(2000);
        //using value
        clickOnElement(By.id("dropdown-class-example"));
        select.selectByValue("option1");
        Thread.sleep(2000);
        //use indexing
        clickOnElement(By.id("dropdown-class-example"));
        select.selectByIndex(3);
        Thread.sleep(2000);
        //to see which one is selected
        System.out.println(select.getFirstSelectedOption().getText());
        //to see all option
        List< WebElement >options=select.getOptions();
        for(WebElement option:options){
            System.out.println(option.getText());
        }





    }
}