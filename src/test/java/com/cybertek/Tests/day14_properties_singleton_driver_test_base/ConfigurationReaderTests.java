package com.cybertek.Tests.day14_properties_singleton_driver_test_base;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.cybertek.utilities.ConfigurationReader;

public class ConfigurationReaderTests {

    @Test
    public void test1 (){
        String expected = "chrome";
        String actual = ConfigurationReader.getProperty("browser");

        Assert.assertEquals(actual, expected);


    }

    @Test
    public void test2(){
        String expectedUsername = "storemanager";
        String actualUsername= ConfigurationReader.getProperty("username");

        Assert.assertEquals(actualUsername, expectedUsername);

    }
}
