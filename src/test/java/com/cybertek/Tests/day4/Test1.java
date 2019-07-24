package com.cybertek.Tests.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get ("http://practice.cybertekschool.com/forgot_password");


        WebElement emailBox = driver.findElement(By.name("email"));
        emailBox.sendKeys("abc@gmail.com" + Keys.ENTER);

                Thread.sleep(5000);

                String expected = "Your e-mail's been sent!";

                String actual = driver.findElement(By.name("confirmation_message")).getText();

        System.out.println(actual.equals(expected));

//        WebElement submitButton = driver.findElement(By.id("form_submit"));
//        submitButton.click();


        driver.close();




    }
}
