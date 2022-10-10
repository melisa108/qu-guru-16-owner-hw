package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    String firstName = "Elon",
            lastName = "Musk",
            email = "elon@gmail.com",
            gender = "Male",
            phone = "1234567891",
            day = "30",
            month = "September",
            year = "1965",
            subject = "Physics",
            picture = "random.jpg",
            hobby = "Music",
            address = "St. Petersburg, Nevskiy pr, 100",
            state = "Rajasthan",
            city = "Jaipur";


    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1500x600";
        Configuration.holdBrowserOpen = true;
    }
}
