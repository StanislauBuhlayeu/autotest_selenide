package org.example.test;

import org.example.pages.MainPage;
import org.junit.jupiter.api.Test;

public class MainTest extends BaseTestSetup{
    @Test
    public void checkClickUserListButton(){
        MainPage mainPage = new MainPage();
        mainPage.clickUserListButton();
    }
}
