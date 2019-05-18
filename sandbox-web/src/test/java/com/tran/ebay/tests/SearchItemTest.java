package com.tran.ebay.tests;

import org.junit.BeforeClass;
import org.junit.Test;

public class SearchItemTest extends TestBase {

//    @BeforeClass
//    public void isSearchBarPresent(){
//        if(!app.getItem().isSearchBarPresent()){
//        app.clickOnLogo();
//        }
//    }
@Test
    public void testSearchItem(){
    app.getItem().typeToTheSearchBar("box");
    app.getItem().startSearch();
}
    @Test
    public void testSearchItem2(){
        app.getItem().typeToTheSearchBar("coat");
        app.getItem().startSearch();
    }

}
