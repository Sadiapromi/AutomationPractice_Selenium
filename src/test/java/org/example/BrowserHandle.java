package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class BrowserHandle {
    @Test
    public void browserWork()throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.manage().window().minimize();
        Thread.sleep(1000);
        driver.manage().window().fullscreen();
        Thread.sleep(1000);
        //for website browse
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        //another way
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.switchTo().newWindow(WindowType.WINDOW);
        Thread.sleep(2000);
        driver.get("https://www.instagram.com");
        //one window close
        driver.close();
        Thread.sleep(2000);
        //all window close
        driver.quit();
    }
    @Test
    public void testWindow() throws InterruptedException {
        WebDriver driver1=new ChromeDriver();
        driver1.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver1.findElement(By.xpath("//button[@id='openwindow']")).click();
        Thread.sleep(2000);
        driver1.findElement(By.xpath("//*[text()='Open Tab']")).click();
        Thread.sleep(2000);
        //to show window handle number(single page)
        System.out.println(driver1.getWindowHandle());
        //all page
        List<String> window_handles =new ArrayList<>(driver1.getWindowHandles());
        for(String handle:window_handles) {
            System.out.println(handle);
        }

        //to show current page's title and get url
        System.out.println(driver1.getTitle());
        System.out.println(driver1.getCurrentUrl());
        //switch to window
        driver1.switchTo().window(window_handles.get(1));
        System.out.println(driver1.getTitle());
        System.out.println(driver1.getCurrentUrl());

        System.out.println("------------------------");
        driver1.switchTo().window(window_handles.get(2));
        System.out.println(driver1.getTitle());
        System.out.println(driver1.getCurrentUrl());
        System.out.println("------------------------");
        driver1.switchTo().window(window_handles.get(0));
        System.out.println(driver1.getTitle());
        System.out.println(driver1.getCurrentUrl());

        driver1.quit();



    }

}