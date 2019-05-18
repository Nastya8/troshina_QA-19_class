package com.tran.ebay.tests;

import com.tran.ebay.model.User;
import org.testng.annotations.Test;

public class EbayLoginTest extends TestBase{

    @Test
    public void loginTest() {

        app.getUser().initLogin();
        app.getUser().fillLoginForm(new User().setUser("korsarushka@yandex.ru").setPwd("yandex_korsar"));
        app.getUser().confirmLogin();
    }

}
