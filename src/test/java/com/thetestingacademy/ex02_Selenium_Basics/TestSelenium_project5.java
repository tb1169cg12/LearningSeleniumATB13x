package com.thetestingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestSelenium_project5 {
    @Test
    public void testSelenium_project5() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.us.espocrm.com/");
        Thread.sleep(7000);
        WebElement login = driver.findElement(By.id("btn-login"));
        login.click();
    }
}
