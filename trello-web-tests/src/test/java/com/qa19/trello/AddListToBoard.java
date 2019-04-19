package com.qa19.trello;

import org.testng.annotations.Test;

public class AddListToBoard extends TestBase {
    @Test
    public void AddListToFirstBoard() throws InterruptedException {
        clickOnFirstBoard();
        clickOnAddAListButton();
        typeListName();
        submitAddList();
    }

}

