package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddressBook {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement userName =  driver.findElement(By.name("session[email]"));
        userName.sendKeys("kexesobepu@zsero.com" + Keys.ENTER);

        WebElement password = ((ChromeDriver) driver).findElementByName("session[password]");
        password.sendKeys("password" + Keys.ENTER);

        WebElement SignIn = ((ChromeDriver) driver).findElementByName("commit");
        SignIn.click();





    }
}
