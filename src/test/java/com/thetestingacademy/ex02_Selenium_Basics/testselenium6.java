package com.thetestingacademy.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;

public class testselenium6 {
    @Description("verify title is visible")
    @Test
    public void testselenium6(){
    WebDriver driver6 = new ChromeDriver();
    driver6.get("https://www.google.com/");

    //testng assertion
    Assert.assertEquals(driver6.getCurrentUrl(), "https://www.google.com/");
   //restassured assertion-not uised
        //assert j assertion
     //   AssertThat(driver6.getCurrentUrl(), "https://www.google.com/");

    driver6.quit();
    }
}
