package com.thetestingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.sql.Driver;

public class TEstselenium7 {
    @Test
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");// will open google
        driver.get("https://www.yahoo.com/");//will open yahoo
        driver.navigate().back();//will go back to google
        driver.navigate().forward();//will go to yahoo
        driver.quit();
    }
}
