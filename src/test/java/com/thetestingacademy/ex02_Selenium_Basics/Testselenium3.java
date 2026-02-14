package com.thetestingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testselenium3 {
    @Test
    public void Test_selenium(){
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
    }

}
