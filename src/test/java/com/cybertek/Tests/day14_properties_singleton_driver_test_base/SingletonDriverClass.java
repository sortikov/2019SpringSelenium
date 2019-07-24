package com.cybertek.Tests.day14_properties_singleton_driver_test_base;

import org.testng.annotations.Test;
import com.cybertek.utilities.Driver;
import com.cybertek.utilities.SeleniumUtils;

public class SingletonDriverClass {

    @Test
    public void test1(){
        Driver.getDriver().get("http://google.com");
        SeleniumUtils.waitPlease(3);
        Driver.closeDriver();
    }

}
