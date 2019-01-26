package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.LinkedHashMap;

public class AmazonSearch {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.get("http://amazon.com");

        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));

        searchBox.sendKeys("charger"+ Keys.ENTER);

        String search=driver.findElement(By.id("twotabsearchtextbox")).getAttribute("value");

        if(search.equals("charger")){
            System.out.println("PASS");

        }else{
            System.out.println("FAIL");
            System.out.println("Expected: charger");
            System.out.println("Actual: "+search);
        }




    }


}
