package com.cybertek.Tests.day7_07032019;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.cybertek.utilities.BrowserFactory;
import com.cybertek.utilities.SeleniumUtils;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDownPractice {

    static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) {
        openDropDownPage();
        SeleniumUtils.waitPlease(2);
        test6();
        SeleniumUtils.waitPlease(2);
        driver.close();

    }

    public static void openDropDownPage() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
        //  String expected = "Dropdown List";
        //  String actual = driver.findElement(By.tagName("h3")).getText();

        WebElement element = driver.findElement(By.xpath("//h3[text()='Dropdown List']"));
        SeleniumUtils.verifyIsDisplayed(element);
    }

    public static void test1() {
        WebElement dropdown1 = driver.findElement(By.id("dropdown"));

        Select dropdownSelect = new Select(dropdown1);

        String actual = dropdownSelect.getFirstSelectedOption().getText();
        String expected = "Please select an option";

        SeleniumUtils.verifyEquals(actual, expected);

        List<WebElement> options = dropdownSelect.getOptions();

        for(WebElement option: options){
            System.out.println(option.getText());
        }


    }

    public static void test2(){
        WebElement dropdownState = driver.findElement(By.id("state"));

        Select dropdownStateSelect = new Select (dropdownState);

        List <WebElement> options = dropdownStateSelect.getOptions();

        for (WebElement option: options){
            System.out.println(option.getText());
        }

        dropdownStateSelect.selectByVisibleText("Texas");
        SeleniumUtils.waitPlease(2);
        dropdownStateSelect.selectByVisibleText("California");
        SeleniumUtils.waitPlease(2);
        dropdownStateSelect.selectByVisibleText("Colorado");
        SeleniumUtils.waitPlease(2);
    }

    public static void test3() {
        WebElement dropdownState = driver.findElement(By.id("state"));

        Select dropdownStateSelect = new Select(dropdownState);

        List<WebElement> options = dropdownStateSelect.getOptions();

        for(WebElement option: options){
            SeleniumUtils.waitPlease(1);
            dropdownStateSelect.selectByVisibleText(option.getText());
        }

    }

    public static void test4(){

        WebElement dropdownState = driver.findElement(By.id("state"));

        Select dropdownStateSelect = new Select(dropdownState);

        dropdownStateSelect.selectByValue("PA");
        SeleniumUtils.waitPlease(2);

        String expected = "Pennsylvania";
        String actual = dropdownStateSelect.getFirstSelectedOption().getText();

        SeleniumUtils.verifyEquals(expected,actual);




    }


    public static void test5(){
        WebElement dropdownState = driver.findElement(By.id("state"));

        Select dropdownStateSelect = new Select(dropdownState);
        SeleniumUtils.waitPlease(2);
        dropdownStateSelect.selectByIndex(5);
        SeleniumUtils.waitPlease(2);
    }

    public  static void test6(){
        WebElement multiSelection = driver.findElement(By.xpath("//select[@name='Languages']"));
        Select multipleSelectionSelect = new Select (multiSelection);
        SeleniumUtils.waitPlease(2);
        multipleSelectionSelect.selectByVisibleText("Java");
        SeleniumUtils.waitPlease(2);
        multipleSelectionSelect.selectByVisibleText("JavaScript");
    }
}