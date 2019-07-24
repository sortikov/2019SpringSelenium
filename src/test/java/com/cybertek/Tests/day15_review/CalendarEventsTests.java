package com.cybertek.Tests.day15_review;

import com.cybertek.Pages.vytrack.CalendarEventsPage;
import com.cybertek.Tests.day14_properties_singleton_driver_test_base.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.SeleniumUtils;
import com.cybertek.utilities.VYTrackUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class CalendarEventsTests extends TestBase {


    //BeforeMethod is coming from TestBase class --> Inheritance

    CalendarEventsPage calendarPage = new CalendarEventsPage();
    @Test
    public void verifyRepeatOptions(){

        //Reading username from .properties file
        String username = ConfigurationReader.getProperty("storemanagerusername");

        //Reading password from .properties file
        String password = ConfigurationReader.getProperty("storemanagerpassword");

        VYTrackUtils.login(driver, username, password); //login

        //go to Calendar Events
        VYTrackUtils.waitUntilLoaderScreenDisappear(driver);
        VYTrackUtils.navigateToModule(driver,"Activities", "Calendar Events");



        VYTrackUtils.waitUntilLoaderScreenDisappear(driver);
        driver.findElement(By.cssSelector(calendarPage.createCalendarEventBtnLocator)).click();
        VYTrackUtils.waitUntilLoaderScreenDisappear(driver);
        driver.findElement(By.cssSelector(calendarPage.repeatCheckBoxLocator)).click();


        List<String> expectedOptions = Arrays.asList ("Daily", "Weekly", "Monthly");
        List<String> actualOptions = calendarPage.getRepeatOptions();

        for(int i = 0; i < expectedOptions.size(); i++){
            Assert.assertEquals (actualOptions.get(i),expectedOptions.get(i));
        }



    }


    //AfterMethod is coming from TestBase class --> Inheritance
}
