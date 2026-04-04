package com.thetestingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class locators {
    @Test
    public void test(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://awesomeqa.com/practice.html");
        WebElement experiece = driver.findElement(By.xpath("//span[text()='Years of Experience']"));
        driver.findElement(with(By.id("exp-1")).toRightOf(experiece)).click();
    }
}
