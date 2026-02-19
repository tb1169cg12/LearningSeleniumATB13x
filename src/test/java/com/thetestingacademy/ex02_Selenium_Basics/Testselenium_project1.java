package com.thetestingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testselenium_project1 {
    @Test
    public void Verify_text_on_catalon_website(){
    WebDriver driver = new ChromeDriver();
    driver.navigate().to("https://katalon-demo-cura.herokuapp.com");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "CURA Healthcare Service");
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/");
        System.out.println(driver.getPageSource());


        if (driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("test case pass");
            Assert.assertTrue(true);
        }else {
            System.out.println("test case fail");
            Assert.fail();
        }
        driver.quit();
        }

    }

