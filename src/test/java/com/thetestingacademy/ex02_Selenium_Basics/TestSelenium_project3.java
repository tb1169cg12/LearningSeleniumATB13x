package com.thetestingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.time.Duration;
import java.util.Set;

public class TestSelenium_project3 {
    @Test
    public void TestSelenium_project3() {
        {
            WebDriver driver = new FirefoxDriver();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            try {
                driver.get("https://app.vwo.com/#/login");

                // 1. Purane window ka ID save kar lo
                String parentWindow = driver.getWindowHandle();

                WebElement startTrial = driver.findElement(By.partialLinkText("Start a free trial"));
                startTrial.click();

                // 2. Ab check karo total kitne tabs khule hain
                Set<String> allWindows = driver.getWindowHandles();

                // 3. Naye tab par switch karo
                for (String handle : allWindows) {
                    if (!handle.equals(parentWindow)) {
                        driver.switchTo().window(handle);
                    }
                }

                // 4. Ab naye page par wait karo URL change hone ka
                wait.until(ExpectedConditions.urlContains("free-trial"));
                System.out.println("New Tab URL: " + driver.getCurrentUrl());

                // 5. Purana tab close karna hai?
                // Pehle purane par switch karo, use close karo, phir wapas naye par aao
                String childWindow = driver.getWindowHandle(); // Save child ID
                driver.switchTo().window(parentWindow);
                driver.close(); // Sirf parent tab band hoga
                driver.switchTo().window(childWindow); // Wapas control naye tab par

                // 6. Ab yahan email find ho jayega
                WebElement emailInput = wait.until(
                        ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type='email']"))
                );
                emailInput.sendKeys("rahultarun203");
                WebElement i_accept = driver.findElement(By.id("page-free-trial-step1-cu-gdpr-consent-checkbox"));
                i_accept.click();
                WebElement check_text = driver.findElement(By.className("invalid-reason"));
                Assert.assertEquals(check_text.getText(),"The email address you entered is incorrect.");

            } finally {
                // driver.quit(); // Test khatam hone pe sab band karne ke liye
            }
        }
    }
}