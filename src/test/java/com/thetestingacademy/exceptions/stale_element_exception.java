package com.thetestingacademy.exceptions;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class stale_element_exception {
    @Test
    public void stale_element_exception(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement input_box = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        driver.navigate().refresh();
        try {
            input_box.sendKeys("test" + Keys.ENTER);
        }
        catch (StaleElementReferenceException ex){
            System.out.println("element not found");
        }


    }

}
