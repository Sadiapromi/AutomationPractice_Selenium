package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class AdvanceLocator extends BrowserSetup{
    @Test
    public void testPageLocator() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        browser.findElement(By.cssSelector("input[value='radio2']")).click();
        Thread.sleep(1000);
        browser.findElement(By.xpath("//input[@value=\"radio3\"]")).click();
        Thread.sleep(1000);
        browser.findElement(By.cssSelector("#checkBoxOption1")).click();
        Thread.sleep(1000);
        browser.findElement(By.cssSelector(".radioButton")).click();
        Thread.sleep(1000);

        String h1Text=browser.findElement(By.cssSelector("h1")).getText();
        System.out.println("CSS Selector:"+h1Text);
        String h1Text_XPATH=browser.findElement(By.xpath("//h1")).getText();
        System.out.println("XPATH: "+h1Text_XPATH);

        browser.findElement(By.xpath("//*[@value='radio3']")).click();
        Thread.sleep(1000);

        String text = browser.findElement(By.cssSelector("div[id='checkbox-example']> fieldset >legend")).getText();
        System.out.println(text);
        text = browser.findElement(By.xpath("//div[@id='checkbox-example']/ fieldset /legend")).getText();
        System.out.println(text);

        browser.findElement(By.xpath("//input[@name='radioButton' and @value='radio2']")).click();
        Thread.sleep(1000);

        browser.findElement(By.cssSelector("input[placeholder^=\"Enter Your\"]")).sendKeys("HELLO");
        Thread.sleep(1000);
        browser.findElement(By.xpath("//input[starts-with(@placeholder,\"Enter Your\")]")).sendKeys("Hello Xpath");
        Thread.sleep(1000);

        browser.findElement(By.cssSelector("input[placeholder*=\"Your Name\"]")).sendKeys("Promi");
        Thread.sleep(1000);
        browser.findElement(By.xpath("//input[contains(@placeholder,\"Your Name\")]")).sendKeys("Limon");
        Thread.sleep(1000);

        text=browser.findElement(By.xpath("//table[@name='courses']//tr/th[1]")).getText();
        System.out.println(text);
        text=browser.findElement(By.xpath("//table[@name='courses']//tr/th[2]")).getText();
        System.out.println(text);
        text=browser.findElement(By.xpath("//table[@name='courses']//tr/th[last()]")).getText();
        System.out.println(text);

        text=browser.findElement(By.cssSelector("table[name='courses']> tbody>tr>th:first-child")).getText();
        System.out.println(text);
        text=browser.findElement(By.cssSelector("table[name='courses']> tbody> tr> th:nth-child(2)")).getText();
        System.out.println(text);

        //preceding siblings
        text=browser.findElement(By.xpath("//th[text()='Course']//preceding-sibling::th")).getText();
        System.out.println(text);
        //following
        text=browser.findElement(By.xpath("//th[text()='Course']//following-sibling::th")).getText();
        System.out.println(text);
        //for multiple
        text=browser.findElement(By.xpath("//th[contains(text(),'Instructor')]//following-sibling::th[last()]")).getText();
        System.out.println(text);

        //table-data count
        List<WebElement> table =browser.findElements(By.xpath("//table[@name='courses']//td"));
        System.out.println(table.size());
        for (WebElement e : table){
            System.out.println(e.getText());
        }




    }
}