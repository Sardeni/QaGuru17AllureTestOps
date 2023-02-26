package com.sardeni.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.sardeni.pages.MainPage.searchInput;
import static com.sardeni.pages.MainPageForEmployers.*;
import static io.qameta.allure.Allure.step;

public class MainPageForEmployers extends TestBase {

    String forEmployersTitle = "Разместите вакансию на hh.ru";
    String forEmployersSubtitle = "И находите сотрудников среди тех, кто хочет у вас работать. hh.ru — сервис №1 по поиску сотрудников в России*";


    @Test
    @DisplayName("Check elements on main page for employers, without authorization")
    @Tag("regress")
    public void checkMainPageForEmployersItems() {

        open("/employer");

        step("Checking title", () -> {
            mainPageForEmployers.checkElementText(title, forEmployersTitle);
        });

        step("Checking subtitle", () -> {
            mainPageForEmployers.checkElementText(subtitle, forEmployersSubtitle);
        });

        step("Checking text on publish vacancy button", () -> {
            mainPageForEmployers.checkElementText(publishVacancyButton, "Разместить вакансию");
        });

        step("Checking text in search resume input", () -> {
            mainPageForEmployers.checkElementAttribute(searchEmployeeInput, "placeholder", "Поиск по резюме");
        });

        step("Checking text on find employee button", () -> {
            mainPageForEmployers.checkElementText(findEmployeeButton, "Найти сотрудника");
        });

    }
}
