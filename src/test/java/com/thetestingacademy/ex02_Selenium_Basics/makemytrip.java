package com.thetestingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class makemytrip {
    @Test
    public void makemytrip(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.makemytrip.com");
        driver.manage().window().maximize();
        WebDriverWait  wait =new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']"))).click();
        WebElement from = driver.findElement(By.xpath("//input[@id='fromCity']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(from).click().sendKeys("blr").build().perform();

    }
}
