package com.thetestingacademy.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.SeverityLevel;
import org.apache.logging.log4j.core.net.Severity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestSelenium_project8 {
    @Owner("rahul")

    @Description("verify login is working")
    @Test
    public void testSelenium_project8() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Rahul");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("bajaj");
        driver.findElement(By.xpath("//input[@value='Female']")).click();
        driver.findElement(By.xpath("//input[@value='7']")).click();
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("17 oct 1994");
        driver.findElement(By.xpath("//input[@value='Automation Tester']")).click();
        driver.findElement(By.xpath("//input[@value='Selenium Webdriver']")).click();
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='continents']"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Europe");



}}
