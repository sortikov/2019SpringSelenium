package com.cybertek.Tests.day14_properties_singleton_driver_test_base;

import com.cybertek.Pages.vytrack.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.cybertek.utilities.ConfigurationReader;

public class LoginTest extends TestBase {
    LoginPage loginPage = new LoginPage();
    WebDriver driver;




    @Test
    public void test1(){
        String username = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");
        loginPage.login(username,password);


    }
}
