package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    String firstName = "Elon",
            lastName = "Musk",
            email = "elon@gmail.com",
            phone = "1234567891",
            day = "30",
            month = "September",
            year = "1965";

    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1500x600";
        Configuration.holdBrowserOpen = true;
    }
}
