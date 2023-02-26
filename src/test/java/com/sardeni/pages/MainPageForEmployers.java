package com.sardeni.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class MainPageForEmployis {

    public static SelenideElement
            mainPageheader = $("[data-qa=bloko-header-3]"),

    createResumeButton = $("a[data-qa=signup]"),

    signInButton = $("a[data-qa=login]"),

    searchInput = $("[data-qa=search-input]"),
            searchButton = $("button[data-qa=search-button]");

    public MainPageForEmployis checkElementText(SelenideElement element, String text) {
        element.shouldHave(text(text));
        return this;
    }

    public MainPageForEmployis checkElementAttribute(SelenideElement element, String attirbuteType, String attirbuteValue) {
        element.shouldHave(attribute(attirbuteType, attirbuteValue));
        return this;
    }


}
