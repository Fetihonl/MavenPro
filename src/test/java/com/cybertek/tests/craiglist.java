package com.cybertek.tests;

import com.cybertek.com.cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class craiglist extends TestBase {


    @Test
    public void setUp(){
        driver.get("https://www.craigslist.org/about/sites");
        driver.findElement(By.linkText("new york city")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.linkText("create a posting")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.getTitle();
        System.out.println(driver.getTitle());

    }
    @Test
    public void setLocation(){
        setUp();
      WebElement manhattan = driver.findElement(By.xpath("//input[@value='1']"));
        System.out.println("Manhattan " + manhattan.isSelected());
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       manhattan.click();
       WebElement midtown = driver.findElement(By.xpath("//input[@value='135']"));
       ((WebElement) midtown).click();
      WebElement typeOfPosting = driver.findElement(By.xpath("//input[@value='fso']"));
      typeOfPosting.click();
      WebElement cars = driver.findElement(By.xpath("//input[@value='145']"));
      cars.click();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @Test
    public void productInformation(){
        setUp();
        setLocation();
        WebElement carTitle = driver.findElement(By.xpath("//input[@name='PostingTitle']"));
        carTitle.sendKeys("Toyota");
        WebElement price = driver.findElement(By.xpath("//input[@name='price']"));
        price.sendKeys("5000");
        WebElement postalCode = driver.findElement(By.xpath("//input[@name='postal']"));
        postalCode.sendKeys("10036");

        WebElement postingBody = driver.findElement(By.xpath("//textarea[@name='PostingBody']"));
        postingBody.sendKeys("My car is clean");

        WebElement model = driver.findElement(By.xpath("//input[@name='auto_make_model']"));
        model.sendKeys("Camry");






    }
    @Test
    public void contactInfo(){
        setUp();
        setLocation();
        productInformation();
        WebElement email = driver.findElement(By.xpath("//input[@placeholder='Your email address']"));
        email.sendKeys("fetihonl@gmail.com");
        WebElement emailConfirm = driver.findElement(By.xpath("//input[@placeholder='Type email address again']"));
        emailConfirm.sendKeys("fetihonl@gmail.com");


    }
    @Test
    public void locationInfo(){
        setUp();
        setLocation();
        productInformation();
        contactInfo();
        WebElement street = driver.findElement(By.xpath("//input[@name='xstreet0']"));
        street.sendKeys("56 West 45th street");
        WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
        city.sendKeys("New York");

        WebElement continue1 = driver.findElement(By.xpath("//button[@type='submit']"));
        continue1.click();
    }


}
