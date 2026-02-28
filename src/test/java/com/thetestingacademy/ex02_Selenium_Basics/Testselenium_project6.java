package com.thetestingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Testselenium_project6 {
@Test
    public void loginTest() throws Exception {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://awesomeqa.com/webtable.html");

        //XPATH- table[@id="customer"]/tbody/tr[5]/td[2]
        //XPATH- table[@id="customer"]/tbody/tr[i]/td[j]
       String fp ="//table[@id=\"customer\"]/tbody/tr[";
       String sp = "]/td[";
       String tp = "]";

        int row =driver.findElements(By.xpath("//table[@id=\"customer\"]/tbody/tr")).size();
        int column = driver.findElements(By.xpath("//table[@id=\"customer\"]/tbody/tr[2]/td")).size();
        for (int i = 1; i<=row; i++){  // we are starting from 1st row
             for (int j = 1; j<=column; j++){
                 String dynamic_path = fp+i+sp+j+tp ;
                 System.out.println(dynamic_path);
                 String data = driver.findElement(By.xpath(dynamic_path)).getText();
                 System.out.println(data);

        }

        }
    }
}
