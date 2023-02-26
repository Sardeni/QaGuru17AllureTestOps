package com.sardeni.tests;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.sardeni.pages.MainPage.*;
import static io.qameta.allure.Allure.step;


public class Tests extends TestBase{

    String headerText = "Работа найдется для каждого";
    String searchInputText = "Работа найдется для каждого";

    @Test
    @DisplayName("Проверяем элементы на главной странице, без авторизации")
    @Tag("regress")
    public void checkMainPageItems() {
        step("Checking header", () -> {
            mainPage.checkElementText(mainPageheader, headerText);
        });

        step("Checking text on creating resume button", () -> {
            mainPage.checkElementText(createResumeButton, "Создать резюме");
        });

        step("Checking text on signIn button", () -> {
            mainPage.checkElementText(signInButton, "Войти");
        });

        step("Checking text in search input", () -> {
            mainPage.checkElementText(signInButton, "Войти");
        });
    }
}
