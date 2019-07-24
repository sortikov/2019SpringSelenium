package com.cybertek.Tests.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.cybertek.utilities.BrowserFactory;
import com.cybertek.utilities.SeleniumUtils;

import java.util.concurrent.TimeUnit;

public class CheckBoxPage {

    static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) {
        openCheckBoxPage();
        test2();
        driver.close();


    }


    public static void openCheckBoxPage() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/checkboxes");
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    public static void test1(){

        WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));


        if(!checkbox1.isSelected()){
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }

        if(checkbox2.isSelected()){
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }

    }


    public static void test2(){

        WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));

        SeleniumUtils.waitPlease(3);
        checkbox1.click();
        SeleniumUtils.waitPlease(3);

        if(checkbox1.isSelected()){
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }

        checkbox2.click();
        SeleniumUtils.waitPlease(3);
        if(!checkbox2.isSelected()){
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }

    }


}
