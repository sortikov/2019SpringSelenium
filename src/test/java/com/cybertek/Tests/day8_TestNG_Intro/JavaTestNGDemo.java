package com.cybertek.Tests.day8_TestNG_Intro;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaTestNGDemo {

    @Test
    public void test1(){

        String a = "A";
        String b = "A";

        Assert.assertEquals(a, b);
    }


    @Test
    public void test2(){

        String a = "apple";
        String b = "orange";

        Assert.assertEquals(a, b);
    }


    @Test
    public void test3(){


        String a = "ADAF";
        String b = "AAA";


        Assert.assertTrue(a.contains(b));


    }


    @Test
    public void test4(){


        String a = "ADAF";
        String b = "AAA";


        Assert.assertFalse(a.contains(b));


    }
}
