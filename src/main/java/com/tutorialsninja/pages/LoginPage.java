package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By emailAddress = By.id("input-email");
    By password = By.id("input-password");
    By loginButton = By.xpath("//form[contains(@action,'login')]//input[@type='submit']");

    public void enterLoginDetails() {

        //4.3 Enter Email address
        sendTextToElement(emailAddress, "prime1233@gmail.com");
        //4.4 Enter Password
        sendTextToElement(password, "test1234");
        //4.5 Click on Login button
        clickOnElement(loginButton);

    }
}
