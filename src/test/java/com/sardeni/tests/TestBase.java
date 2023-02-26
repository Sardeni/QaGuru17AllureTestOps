package com.sardeni.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.sardeni.helpers.Attach;
import com.sardeni.pages.MainPage;
import com.sardeni.pages.MainPageForEmployers;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    MainPage mainPage = new MainPage();
    MainPageForEmployers mainPageForEmployers = new MainPageForEmployers();

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = System.getProperty("browserSize", "1920x1080");
        Configuration.browserVersion = System.getProperty("browserVersion");
        Configuration.browser = System.getProperty("browserName", "chrome");
        Configuration.pageLoadStrategy = "eager";
        Configuration.baseUrl = "https://hh.ru";
        Configuration.remote = System.getProperty("remoteURL");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;
    }

    @BeforeEach
    void addListenerAndOpenPage() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}