package com.thetestingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium_Project7 {
    @Test
    public void testSelenium_Project7() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        try {
            WebElement cross = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@data-cy='closeModal']")));
            cross.click();
        }catch (Exception e){
            System.out.println("Cross modal button is not clickable");
        }


        //WebElement cross = driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));



    }
}
