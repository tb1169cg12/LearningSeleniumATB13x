package com.thetestingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class javascript {
    @Test
    public void main() {
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.location='https://www.google.com'");
        driver.get("https://selectorshub.com/xpath-practice-page/");

        js.executeScript("window.scrollBy(0,1000)");
        String url =js.executeScript("return document.url").toString();
        String title =js.executeScript("return document.title").toString();
        System.out.println(url);
        System.out.println(title);
    }
}
