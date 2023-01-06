package com.demoqa.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import com.demoqa.pages.RegistrationFormPage;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class RegistrationFormBestPracticiesTest extends TestBase {
    RegistrationFormPage registrationFormPage = new RegistrationFormPage();

    @Test
    @DisplayName("Registration form with valid values")
    public void fillFormTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Открыть главную страницу", () -> {

            registrationFormPage.openPage();
        });

        step("Заполнить все поля валидными данными", () -> {
            registrationFormPage.setFirstName(firstName)
                    .setLastName(lastName)
                    .setEmail(email)
                    .setGender(gender)
                    .setNumber(phone)
                    .setBirthDate(day, month, year)
                    .setSubject(subject)
                    .setHobbies(hobby)
                    .setPicture("img/" + picture)
                    .setCurrentAddress(currentAddress)
                    .setAddress(state, city);
        });

        step("Нажать кнопку Submit", () -> {
            registrationFormPage.clickSubmit();
        });

        step("Проверить поля в открывшийся форме", () -> {
            registrationFormPage.checkResultsTableVisible()
                    .checkResult("Student Name", firstName + " " + lastName)
                    .checkResult("Student Email", email)
                    .checkResult("Gender", gender)
                    .checkResult("Mobile", phone)
                    .checkResult("Date of Birth", day + " " + month + "," + year)
                    .checkResult("Subjects", subject)
                    .checkResult("Hobbies", hobby)
                    .checkResult("Picture", picture)
                    .checkResult("Address", currentAddress)
                    .checkResult("State and City", state + " " + city);
        });
    }
}