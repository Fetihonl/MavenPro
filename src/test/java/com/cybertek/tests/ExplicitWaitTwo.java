package com.cybertek.tests;

import com.cybertek.com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExplicitWaitTwo {

    @Test
    public void test(){
        Driver.getDriver().get("https://the-internet.herokuapp.com/dynamic_loading/1");

        //click on a button
        Driver.getDriver().findElement(By.id("start")).click();
        //locate text
        WebElement text = Driver.getDriver().findElement(By.id("finish"));
        System.out.println(text.getText());

        //verify text is displayed

        Assert.assertTrue(text.isDisplayed());
        //
    }
}
