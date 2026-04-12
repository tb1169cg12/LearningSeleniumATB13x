package com.thetestingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class awesomeQA_locators {
    @Test
    public void awesomeQA_locators(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK/");
        driver.manage().window().maximize();
        driver.switchTo().frame("result");
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));

        username.sendKeys("test");
    }
}
