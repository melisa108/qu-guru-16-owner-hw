package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    Faker faker = new Faker();
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String email = faker.internet().emailAddress();
    String phone = faker.phoneNumber().subscriberNumber(10);
    String currentAddress = faker.address().streetAddress();
    String gender = "Male",
            day = "30",
            month = "September",
            year = "1965",
            subject = "Physics",
            picture = "random.jpg",
            hobby = "Music",
            state = "Rajasthan",
            city = "Jaipur";


    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1500x600";
        Configuration.holdBrowserOpen = true;
    }
}
