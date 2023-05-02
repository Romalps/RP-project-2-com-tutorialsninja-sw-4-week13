package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    By firstName = By.id("input-firstname");
    By lastName = By.id("input-lastname");
    By email = By.id("input-email");
    By telephone = By.id("input-telephone");
    By password = By.id("input-password");
    By confirmPassword = By.id("input-confirm");
    By radioButton = By.xpath("//fieldset[3]//input");
    By privacyPolicyCheckbox = By.xpath("//div[@class = 'buttons']//input[@name='agree']");
    By continueButton = By.xpath("//div[@class = 'buttons']//input[@value='Continue']");

    public void enterYourPersonalDetailsInTheRegisterPage() {

        //3.3 Enter First Name
        sendTextToElement(firstName, "prime" + getAlphaNumericString(4));
        //3.4 Enter Last Name
        sendTextToElement(lastName, "test" + getAlphaNumericString(4));
        //3.5 Enter Email
        sendTextToElement(email, "prime" + getAlphaNumericString(4) + "@gmail.com");
        //3.6 Enter Telephone
        sendTextToElement(telephone, "07988112233");
        //3.7 Enter Password
        sendTextToElement(password, "test123");
        //3.8 Enter Password Confirm
        sendTextToElement(confirmPassword, "test123");
        //3.9 Select Subscribe Yes radio button
        selectByContainsTextFromListOfElements(radioButton, "Yes");
        //3.10 Click on Privacy Policy check box
        clickOnElement(privacyPolicyCheckbox);
        //3.11 Click on Continue button
        clickOnElement(continueButton);


    }

}
