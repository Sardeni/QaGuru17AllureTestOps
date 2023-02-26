package com.sardeni.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class MainPageForEmployers {

    public static SelenideElement
            title = $("[data-qa=employer-index-title]"),

    subtitle = $("[data-qa=employer-index-subtitle]"),

    publishVacancyButton = $("[data-qa=employer-index-publish-vacancy]"),
            searchEmployeeInput = $("[data-qa=employer-index-search-input]"),
            findEmployeeButton = $("[data-qa=employer-index-search-submit]");


    public MainPageForEmployers checkElementText(SelenideElement element, String text) {
        element.shouldHave(text(text));
        return this;
    }

    public MainPageForEmployers checkElementAttribute(SelenideElement element, String attirbuteType, String attirbuteValue) {
        element.shouldHave(attribute(attirbuteType, attirbuteValue));
        return this;
    }
}
