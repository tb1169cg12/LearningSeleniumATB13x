package com.thetestingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class wsomeqa {
    @Test
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.awesomeqa.com/practice.html");
        WebElement name = driver.findElement(By.name("firstname"));
        Actions action = new Actions(driver);
        action.keyDown(Keys.SHIFT)
                .sendKeys(name,"rahul")
                .keyUp(Keys.SHIFT).build().perform();
    }
}
