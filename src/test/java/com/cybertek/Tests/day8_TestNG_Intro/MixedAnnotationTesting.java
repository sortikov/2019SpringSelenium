package com.cybertek.Tests.day8_TestNG_Intro;

import org.testng.annotations.*;

public class MixedAnnotationTesting {
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void setup(){
        System.out.println("Before Method");
    }

    @Test
    public void test1 (){
        System.out.println("I am test1!");
    }

    @Test
    public void test2 (){
        System.out.println("I am test2!");
    }

    @AfterMethod
    public void tearDown (){
        System.out.println("After method");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }


}
