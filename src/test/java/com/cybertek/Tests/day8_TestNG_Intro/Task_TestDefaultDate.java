package com.cybertek.Tests.day8_TestNG_Intro;

import com.cybertek.utilities.Driver;
import com.cybertek.utilities.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

import java.sql.SQLOutput;

public class Task_TestDefaultDate {

    WebDriver driver;


    @BeforeClass
    public void setUp(){
        driver = Driver.getDriver();


        driver.get("http://practice.cybertekschool.com/dropdown");


    }

    @Test
    public void test1(){


        Select select = new Select(driver.findElement(By.xpath("//select[@id='year']")));

        String actualYear = select.getFirstSelectedOption().getText();
        String exptectedYear = "2019";

        Assert.assertEquals(actualYear,exptectedYear);

    }

    @Test
    public void test2(){


        Select select = new Select(driver.findElement(By.xpath("//select[@id='month']")));

        String actualYear = select.getFirstSelectedOption().getText();
        String exptectedYear = "July";

        Assert.assertEquals(actualYear,exptectedYear);

    }

    @Test
    public void test3(){


        Select select = new Select(driver.findElement(By.xpath("//select[@id='day']")));

        String actualYear = select.getFirstSelectedOption().getText();
        String exptectedYear = "22";

        Assert.assertEquals(actualYear,exptectedYear);

    }

    @AfterClass
    public void tearDown (){
        driver.quit();
    }


}
