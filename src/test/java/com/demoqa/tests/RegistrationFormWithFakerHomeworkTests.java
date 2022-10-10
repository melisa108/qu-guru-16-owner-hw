package com.demoqa.tests;

import com.demoqa.pages.RegistrationFormPage;
import org.junit.jupiter.api.Test;

public class RegistrationFormWithFakerHomeworkTests extends TestBase {
    RegistrationFormPage registrationFormPage = new RegistrationFormPage();

    @Test
    void fillFormTest() {

        registrationFormPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setGender(gender)
                .setNumber(phone)
                .setBirthDate(day, month, year)
                .setSubject(subject)
                .setHobbies(hobby)
                .setPicture("img/" + picture)
                .setCurrentAddress(currentAddress)
                .setAddress(state, city)
                .clickSubmit();

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
    }
}