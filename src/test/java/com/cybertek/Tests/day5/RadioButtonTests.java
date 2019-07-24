package com.cybertek.Tests.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.cybertek.utilities.BrowserFactory;
import com.cybertek.utilities.SeleniumUtils;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RadioButtonTests {

    static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) {
        openRadioButtonPage();
        test4();
        driver.close();


    }


    public static void openRadioButtonPage() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/radio_buttons");

    }

    public static void test1() {
        WebElement blueBtn = driver.findElement(By.id("blue"));
        if (blueBtn.isSelected()) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
        SeleniumUtils.waitPlease(2);
    }

    public static void test2() {

        WebElement blckBtn = driver.findElement(By.id("black"));
        WebElement grnBtn = driver.findElement(By.id("green"));

        if (blckBtn.isEnabled() && (!grnBtn.isEnabled())) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
    }

    public static void test3() {

        WebElement blckBtn = driver.findElement(By.id("black"));
        WebElement blueBtn = driver.findElement(By.id("blue"));

        if (blueBtn.isSelected()) {
            System.out.println("PASSED, blue is selected!");
        } else {
            System.out.println("FAILED");
        }

        blckBtn.click();

        if (blckBtn.isSelected()) {
            System.out.println("PASSED, Black is selected!");
        } else {
            System.out.println("FAILED");
        }

        if (!(blueBtn.isSelected())) {
            System.out.println("PASSED, blue is not selected!");
        } else {
            System.out.println("FAILED");


        }


    }

    public static void test4(){

        List <WebElement> listOfRadioButtons = driver.findElements(By.xpath("//input[@type='radio']"));

        int count = 0;

        for (WebElement radioButton: listOfRadioButtons ) {
            if(radioButton.isSelected()){
                count++;
                System.out.println(radioButton.getAttribute("id"));
            }

        }

        System.out.println(count);
    }




}
