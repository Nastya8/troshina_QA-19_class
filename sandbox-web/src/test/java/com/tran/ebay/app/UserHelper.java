package com.tran.ebay.app;

import com.tran.ebay.model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends HelperBase {


    public UserHelper(WebDriver wd) {
        super(wd);
    }
    public void confirmLogin() {
        //click(By.id("sghBt"));
        click(By.xpath("//button[@id='sgnBt']"));
    }

    public void fillLoginForm(User user1) {

        type(By.name("userid"), user1.getUser());
        type(By.id("pass"), user1.getPwd());

    }

    public void initLogin() {
        //click(By.linkText("Sing in"));
        click(By.xpath("//a[contains(text(),'Sign in')]"));
    }
}
