package com.thetestingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.sql.Driver;

public class spicejet {
    @Test
    public void spicejet(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://book.spicejet.com/");
        driver.manage().window().maximize();
        WebElement source= driver.findElement(By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT']"));
        WebElement source1= driver.findElement(By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(source).click().sendKeys("blr").moveToElement(source1).click().sendKeys("del").build().perform();

    }
}
