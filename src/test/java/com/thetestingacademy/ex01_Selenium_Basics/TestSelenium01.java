package com.thetestingacademy.ex01_Selenium_Basics;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium01 {
@Test
    public void testCode(){
    Assert.assertEquals("Pramod","Pramod");

}
@Test
    public void test_openthetestingacademy(){
    FirefoxDriver driver = new FirefoxDriver();
    driver.get("https://thetestingacademy.com");
    }

}
