package org.example;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionHandle extends BrowserSetup{
    @Test
    public void testElement() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");

        browser.findElement(By.xpath("//input[@value='radio2']")).click();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Promi");
        //browser.findElement(By.xpath("//select[@id='dropdown-class-example']")).click();
        String optionName =browser.findElement(By.xpath("//label[normalize-space()='Option1']")).getText();
        //to see automatically actual result matched with expected result or not
        //for equal
        Assert.assertEquals(optionName,"Option1");
        //to avoid exit after one error,use soft-assertion to continue
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(optionName,"Option1");
        browser.findElement(By.xpath("//input[@id='autocomplete']")).clear();
        browser.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("HI");

        //to get attribute
        String placeholder=browser.findElement(By.xpath("//input[@id='name']")).getAttribute("placeholder");
        System.out.println(placeholder);
        //to know attribute/css-value value
        String fontSize=browser.findElement(By.xpath("//a[@id='opentab']")).getCssValue("font-size");
        System.out.println(fontSize);
        String backgroundColour=browser.findElement(By.xpath("//a[@id='opentab']")).getCssValue("background-color");
        System.out.println(backgroundColour);
        //to see option selected or not.if selected it shows true otherwise false
        Boolean isSelect=browser.findElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected();
        //to confirm what we expected.here we expected false
        Assert.assertFalse(isSelect);
        browser.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();

        isSelect=browser.findElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected();
        Assert.assertTrue(isSelect);
        //to show display or hide
        Boolean isdisplay=browser.findElement(By.xpath("//input[@id='displayed-text']")).isDisplayed();
        Assert.assertTrue(isdisplay);
        //use getElement extends from browser set up to avoid browser.findElement everytime
        getElement(By.id("hide-textbox")).click();
        isdisplay=getElement(By.xpath("//input[@id='displayed-text']")).isDisplayed();
        Assert.assertFalse(isdisplay);;
        isdisplay=displayStatus(By.xpath("//input[@id='displayed-text']"));
        System.out.println(isdisplay);
        //to check google search button enable
        browser.get("https://www.google.com/");
        Boolean isEnable=getElement(By.xpath("//textarea[@id='APjFqb']")).isEnabled();
        Assert.assertTrue(isEnable);

       //for working after all the test cases
        softAssert.assertAll();



    }
}