package org.example.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private final SelenideElement userListButton = $x("//a[@href='clients.html']");

    public void clickUserListButton(){
        userListButton.shouldBe(visible).shouldBe(enabled).click();
    }
}
