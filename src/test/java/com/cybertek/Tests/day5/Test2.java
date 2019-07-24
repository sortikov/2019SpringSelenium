package com.cybertek.Tests.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.cybertek.utilities.BrowserFactory;

public class Test2 {

    public static void main(String[] args) throws Exception {
        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.get("http://www.wikipedia.org");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("selenium webdriver");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@class='pure-button pure-button-primary-progressive']")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//a[@title='Selenium (software)']")).click();
        Thread.sleep(5000);



        String currentUrl =  driver.getCurrentUrl();
        Character lastChar = currentUrl.charAt(currentUrl.length()-1);
        Character expectedValue = 'x';

        if (lastChar == expectedValue){
            System.out.println("Test passed successfully!");
        }else{
            System.out.println("Test failed!");
            System.out.println("Actual result: " + lastChar);
            System.out.println("Expected result: " + expectedValue);
        }

        driver.quit();

    }


}
