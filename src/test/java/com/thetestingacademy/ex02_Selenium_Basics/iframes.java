package com.thetestingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class iframes {
    @Test
    public void iframes(){
        WebDriver driver= new FirefoxDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();
        String parentid = driver.getWindowHandle();
        System.out.println(parentid);
        driver.findElement(By.xpath("//a[text()=\"Click Here\"]")).click();

        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println(allWindowHandles);

        for(String window : allWindowHandles){
            driver.switchTo().window(window);
            if(driver.getPageSource().contains("New Window")){
                System.out.println("test case passed");
            }
        }
        driver.switchTo().window(parentid);
    }
}
