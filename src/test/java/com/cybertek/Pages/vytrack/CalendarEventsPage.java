package com.cybertek.Pages.vytrack;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class CalendarEventsPage {
    private WebDriver driver = Driver.getDriver();
    public String createCalendarEventBtnLocator = "a[title^='Create Calendar']";
    public String repeatCheckBoxLocator = "input[id^='recurrence-repeat-view']";
    public String repeatsDropdownLocator = "select[id^='recurrence-repeats-view']";

    // this is a method that would return collections of repeat options
    public List<String> getRepeatOptions(){
        // this is select object to work with dropdown
        Select select = new Select(driver.findElement(By.cssSelector(repeatsDropdownLocator)));

        // .getOptions() --> return all available options in the dropdown
        // every option is WebElement
        List<WebElement> options = select.getOptions();

        // this is a collection that store text of every option
        List<String> optionsTextList = new ArrayList<>();

        for (WebElement option: options ) {

            // go through every option and retrieve text
            //add that text into collection of text options

            optionsTextList.add(option.getText());

        }


        return optionsTextList;
    }
}
