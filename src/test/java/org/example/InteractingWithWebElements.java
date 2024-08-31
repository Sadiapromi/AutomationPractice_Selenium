package org.example;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class InteractingWithWebElements extends BrowserSetup{
    @Test
    public void testElement() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        browser.findElement(By.xpath("//input[@value='radio2']")).click();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Promi");
        browser.findElement(By.xpath("//select[@id='dropdown-class-example']")).click();
        String optionName =browser.findElement(By.xpath("//label[normalize-space()='Option1']")).getText();
        System.out.println(optionName);
        Thread.sleep(2000);
        browser.findElement(By.xpath("//input[@id='autocomplete']")).clear();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("HI");
        Thread.sleep(2000);
        //to get attribute
        String placeholder=browser.findElement(By.xpath("//input[@id='name']")).getAttribute("placeholder");
        System.out.println(placeholder);
        //to know attribute/css-value value
        //colour
        String fontSize=browser.findElement(By.xpath("//a[@id='opentab']")).getCssValue("font-size");
        System.out.println(fontSize);
        String backgroundColour=browser.findElement(By.xpath("//a[@id='opentab']")).getCssValue("background-color");
        System.out.println(backgroundColour);
        //to see option selected or not.if selected it shows true otherwise false
        Boolean isSelect=browser.findElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected();
        System.out.println(isSelect);
        browser.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();

        isSelect=browser.findElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected();
        System.out.println(isSelect);
        //to show display or hide
        System.out.println("_________________________________________________");
        Boolean isdisplay=browser.findElement(By.xpath("//input[@id='displayed-text']")).isDisplayed();
        System.out.println(isdisplay);
        //use getElement extends from browser set up to avoid browser.findElement everytime
        getElement(By.id("hide-textbox")).click();
        Thread.sleep(2000);
        isdisplay=getElement(By.xpath("//input[@id='displayed-text']")).isDisplayed();
        System.out.println(isdisplay);
        //use display method which created in browser setup
        isdisplay=displayStatus(By.xpath("//input[@id='displayed-text']"));
        System.out.println(isdisplay);
        //to check google search button enable
        browser.get("https://www.google.com/");
        System.out.println("***************************************");
        Boolean isEnable=getElement(By.xpath("//textarea[@id='APjFqb']")).isEnabled();
        System.out.println(isEnable);













    }
}