package com.thetestingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datadriventesting {
    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
        new Object[]{"admin@gmail.com","password123"},
         new Object[]{"admin1@gmail.com","password1234"},
    };
    }

    @Test(dataProvider = "getData")
    public void logintest(String email,String password){
        System.out.println(email +"|" + password);

    }
}
