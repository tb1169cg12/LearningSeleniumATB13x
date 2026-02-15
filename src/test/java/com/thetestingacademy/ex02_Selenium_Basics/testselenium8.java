package com.thetestingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.sql.Driver;

public class testselenium8 {
    @Test
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=100,100");
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://www.google.com/");



    }
}
