package com.thetestingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testselenium4 {
    public static void main(String[] args) {
        // web driver heirarchy

        //1.search Context(interface)-2 functions {find element & find elements}
        //2.web driver(interface)-10 functions{get
        //3.remote web driver (class)-15 functions
        //4.
        //Chromium driver(class)- 25 functions
        //edge driver (class)-45 functions
        //firefox driver
        //internet explorer driver

        //usage-dynamic dispatch

        SearchContext driver =new FirefoxDriver();
        WebDriver driver2 = new FirefoxDriver();
        RemoteWebDriver driver3 = new FirefoxDriver();
        FirefoxDriver driver4 = new FirefoxDriver();

        //scenerio1
        //do u want to run on edge or chrome(1-2%)
        ChromeDriver driver5 = new ChromeDriver();//we can not change browser now
        //do u want to run on edge then change to chrome(95-96%)
        WebDriver driver6 = new EdgeDriver();
        driver6 = new ChromeDriver();
        //do u want to run on multiple browsers aws machines(2-3%)

    }
}
