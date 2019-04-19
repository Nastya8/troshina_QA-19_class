package com.qa19.wikiTest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstClass1 {
    WebDriver wd;
    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
    }
    @Test
    public void openGoogleTest(){
        wd.navigate().to("https://www.google.com/");


    }
    @AfterClass
    public void tearDown(){
        wd.quit();
    }
}
