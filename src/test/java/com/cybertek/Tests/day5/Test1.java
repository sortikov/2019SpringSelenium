package com.cybertek.Tests.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.cybertek.utilities.BrowserFactory;

public class Test1 {

    public static void main(String[] args) throws Exception {
        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.get("http://www.amazon.com");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Java book");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(5000);



        String actualValue =  driver.getTitle();
        String expectedValue = "Amazon.com: Java book";

        if (actualValue.equals(expectedValue)){
            System.out.println("Test passed successfully!");
        }else{
            System.out.println("Test failed!");
            System.out.println("Actual result: " + actualValue);
            System.out.println("Expected result: " + expectedValue);
        }

        driver.quit();

    }
}
