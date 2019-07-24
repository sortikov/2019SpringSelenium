package com.cybertek.Pages.vytrack;

import org.openqa.selenium.By;
import com.cybertek.utilities.Driver;

public class LoginPage {

    String userNameLocator = "prependedInput";
    String passwordLocator = "prependedInput2";
    String loginButtonLocator = "_submit";

    public void login (String userName, String password){
        Driver.getDriver().findElement(By.id(userNameLocator)).sendKeys(userName);
        Driver.getDriver().findElement(By.id(passwordLocator)).sendKeys(password);
        Driver.getDriver().findElement(By.id(loginButtonLocator)).click();
    }
}
