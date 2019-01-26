package com.cybertek.tests;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SmartBearNegative {
    public static void main(String[] args) {
        WebDriver driver;

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/l\n" +
                "ogin.aspx");
        if(driver.getTitle().equals("Web Orders Login")){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }

        String URL = driver.getCurrentUrl();
        WebElement userName = driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester");
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("Tester");
        WebElement LOGIN = driver.findElement(By.id("ctl00_MainContent_login_button"));
        LOGIN.click();
      //  if(driver.getTitle().equals("Web Orders Login")){
        //    S//  System.out.println("Failed");
        //        //ystem.out.println("Passed");
        //}else{
          Assert.assertTrue(driver.getTitle().equals("Web Orders Login"));

        if(driver.getTitle().equals(URL)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }



    }
}
