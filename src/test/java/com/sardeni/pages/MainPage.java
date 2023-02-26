package com.sardeni.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {

    public SelenideElement
            header = $$("h3[data-qa=bloko-header-3]").first(),

    createResumeButton = $("a[data-qa=signup]"),

    signInButton = $("a[data-qa=login]"),

    searchInput = $("[data-qa=search-input]"),
            searchButton = $("button[data-qa=search-button]");

    public MainPage checkElementText(SelenideElement element, String text) {
        element.shouldHave(text(text));
        return this;
    }

    public MainPage checkElementAttribute(SelenideElement element, String attirbuteType, String attirbuteValue) {
        element.shouldHave(attribute(attirbuteType, attirbuteValue));
        return this;
    }


}
