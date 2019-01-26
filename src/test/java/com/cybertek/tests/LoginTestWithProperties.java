package com.cybertek.tests;

import com.cybertek.com.cybertek.utilities.ConfigurationReader;
import com.cybertek.com.cybertek.utilities.TestBase;
import com.cybertek.pages.HomePage;
import org.testng.annotations.Test;

public class LoginTestWithProperties extends TestBase {

    @Test
    public void readPropertyTest(){
        String browser = ConfigurationReader.getProperty("url");
        HomePage homePage = new HomePage();

        String username = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");
        homePage.login(username, password);
    }
}
