package com.sardeni.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class MainPageTests extends TestBase {

    String headerText = "Работа найдется для каждого";
    String searchInputText = "Профессия, должность или компания";

    @Test
    @DisplayName("Check elements on main page, without authorization")
    @Tag("smoke")
    @Tag("regress")
    public void checkMainPageItems() {

        open("/");

        step("Checking header", () -> {
            mainPage.checkElementText(mainPage.header, headerText);
        });

        step("Checking text on creating resume button", () -> {
            mainPage.checkElementText(mainPage.createResumeButton, "Создать резюме");
        });

        step("Checking text on signIn button", () -> {
            mainPage.checkElementText(mainPage.signInButton, "Войти");
        });

        step("Checking text in search input", () -> {
            mainPage.checkElementAttribute(mainPage.searchInput, "placeholder", searchInputText);
        });

        step("Checking text on search job button", () -> {
            mainPage.checkElementText(mainPage.searchButton, "Найти работу");
        });
    }
}
