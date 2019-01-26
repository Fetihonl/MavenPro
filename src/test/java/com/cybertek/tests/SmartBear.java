package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class SmartBear {
    public static void main(String[] args) {


        WebDriver driver;

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/\n" +
                    "login.aspx");
            if (driver.getTitle().equals("Web Orders Login")) {
                System.out.println("Pass");
            } else {
                System.out.println("Failed");
            }

            WebElement userName = driver.findElement(By.id("ctl00_MainContent_username"));
            userName.sendKeys("Tester");
            WebElement PASSWORD = driver.findElement(By.id("ctl00_MainContent_password"));
            PASSWORD.sendKeys("test");
            WebElement LOGIN = driver.findElement(By.id("ctl00_MainContent_login_button"));
            LOGIN.click();
            if (driver.getTitle().equals("Web Orders")) {
                System.out.println("PASS");
            } else {
                System.out.println("FAILED");
            }

            if (driver.getCurrentUrl().equals("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/")) {
                System.out.println("Pass");
            } else {
                System.out.println("Failed");
            }
        driver.close();
    }

    }
