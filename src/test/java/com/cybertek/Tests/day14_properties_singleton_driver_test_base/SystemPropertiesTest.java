package com.cybertek.Tests.day14_properties_singleton_driver_test_base;

import org.testng.annotations.Test;

import java.util.Map;
import java.util.Properties;

public class SystemPropertiesTest {

    @Test
    public void systemPropertiesTest1(){

        String os = System.getProperty("os.name");
        System.out.println(os);

        String username = System.getProperty("user.name");
        System.out.println(username);

        String javaVersion = System.getProperty("java.specification.version");
        System.out.println(javaVersion);

        String homeDirectory = System.getProperty("user.home");
        System.out.println(homeDirectory);

        Properties properties = System.getProperties();

        for(Map.Entry<Object, Object > property: properties.entrySet()){

            System.out.println("Key: " + property.getKey() + ", Value: " + property.getValue());

        }
    }
}
