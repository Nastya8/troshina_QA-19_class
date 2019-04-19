package com.qa19.wikiTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FirstClass1 {
    WebDriver wd;
    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
    }
    @Test
    public void openWikiTest(){
       wd.get("https://ru.wikipedia.org/");

    }
    @AfterClass
    public void tearDown(){
        wd.quit();
    }
}
