package com.cybertek.Tests.day9;

import com.cybertek.utilities.BrowserFactory;
import com.cybertek.utilities.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AbsoluteXpathDemo {
    private WebDriver driver ;
    String fullNameLocator = "html/body/div/div[2]/div/div/form/div[1]/div/input[@name='full_name']";
    String emailLocator = "html/body/div/div[2]/div/div/form/div[2]/div/input[@name='email']";
    String signUpButton = "html/body/div/div[2]/div/div/form/button[@type='submit']";


    @BeforeMethod
    public void setup(){
        driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");
    }

    @Test
    public void test1(){
        driver.findElement(By.xpath("html/body/div/div[2]/div/div/form/div[1]/div/input[@name='full_name']")).sendKeys("Java Guru");
        driver.findElement(By.xpath("html/body/div/div[2]/div/div/form/div[2]/div/input[@name='email']")).sendKeys("abc123@gmail.com");
        SeleniumUtils.waitPlease(2);
        driver.findElement(By.xpath("html/body/div/div[2]/div/div/form/button[@type='submit']")).click();
        SeleniumUtils.waitPlease(2);

        String expectedMessage = "Thank you for signing up. Click the button below to return to the home page.";
        String actualMessage = driver.findElement(By.xpath("html/body/div/div[2]/div/div/h3[@name='signup_message']")).getText();

        Assert.assertEquals(actualMessage,expectedMessage);
    }

    @Test
    public void negativeEmailTest(){
        String expectedLink = driver.getCurrentUrl();
        driver.findElement(By.xpath(fullNameLocator)).sendKeys("Adam Smith");
        driver.findElement(By.xpath(emailLocator)).sendKeys("email");
        driver.findElement(By.xpath(signUpButton)).click();
        SeleniumUtils.waitPlease(2);
        String actualLink = driver.getCurrentUrl();

        Assert.assertEquals(actualLink,expectedLink);
    }

    @AfterMethod
    public void tearDown (){
        driver.quit();
    }
}
