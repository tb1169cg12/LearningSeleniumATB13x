package com.thetestingacademy.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testselenium_project2 {
    @Description ("program to automate login")
    @Test
    public void testselenium_project2() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();
        WebElement mail_input_box = driver.findElement(By.id("login-username"));
        mail_input_box.sendKeys("admin@admin.com");
        Thread.sleep(2000);
        WebElement mail_password= driver.findElement(By.id("login-password"));
        mail_password.sendKeys("1234");
        Thread.sleep(2000);
        WebElement Show_password = driver.findElement(By.id("js-password-show-icon"));
        Show_password.click();
        Thread.sleep(2000);
        WebElement remember_me = driver.findElement(By.className("checkbox-radio-icon"));
        remember_me.click();
        Thread.sleep(2000);
        WebElement sign_in = driver.findElement(By.id("js-login-btn"));
        sign_in.click();
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println("sleep interrupted");
        }
        WebElement notification= driver.findElement(By.id("js-notification-box-msg"));
        System.out.printf(notification.getText());
        Assert.assertEquals(notification.getText(),"Your email, password, IP address or location did not match");
    //preference-unique ID → name → class Name → TagName → Link Text/ Partial ( a tag] - CSS Selector //XPath.
        Thread.sleep(2000);
        driver.quit();

    }
}
