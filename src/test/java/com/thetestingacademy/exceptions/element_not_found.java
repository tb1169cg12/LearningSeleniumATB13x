package com.thetestingacademy.exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class element_not_found {
    @Test
    public void element_not_found(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        //driver.findElement(By.id("pramod"));
        //error-org.openqa.selenium.NoSuchElementException: Unable to locate element: #pramod
        //fix-
        try {
            driver.findElement(By.id("pramod"));
        }
        catch (NoSuchElementException ex){
            System.out.println("element not found");

        }
    }
}
