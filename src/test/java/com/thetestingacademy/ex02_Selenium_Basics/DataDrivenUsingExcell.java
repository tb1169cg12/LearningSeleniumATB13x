package com.thetestingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataDrivenUsingExcell {

@Test(dataProvider = "getdata",dataProviderClass = UtilExcell.class)
    public void test_VWO_login(String email, String password) {
        System.out.println("email: " + email);
        System.out.println("password: " + password);


    }

}
