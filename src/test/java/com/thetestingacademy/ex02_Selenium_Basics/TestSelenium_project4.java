package com.thetestingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium_project4 {
    //html/body/header/div/a



    @Test
    public void testSelenium_project4() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        WebElement make_appontment = driver.findElement(By.id("btn-make-appointment"));
        //how to find-//*[@id="btn-login"]  or
        //*[@id="btn-make-appointment"]
        make_appontment.click();
        driver.quit();

    }
}
