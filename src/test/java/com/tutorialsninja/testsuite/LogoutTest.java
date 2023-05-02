package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.*;
import com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {
    Homepage homepage = new Homepage();
    RegisterPage registerPage = new RegisterPage();
    SuccessPage successPage = new SuccessPage();
    LogoutPage logoutPage = new LogoutPage();
    LoginPage loginPage = new LoginPage();
    MyAccountPage myAccountPage = new MyAccountPage();

    @Test
    public void verifyUserShouldLogoutSuccessfully() {
        // 3.1 Click on My Account Link.
        homepage.clickOnMyAccountLink();
        //3.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register "
        homepage.selectMyAccountOptions("Register");
        // Enter personal details in the Register page
        registerPage.enterYourPersonalDetailsInTheRegisterPage();
        //3.13 Click on Continue button
        successPage.clickOnContinueButton();
        // 3.14 Click on My Account Link.
        homepage.clickOnMyAccountLink();
        //3.15 Call the method “selectMyAccountOptions” method and pass the parameter “Logout "
        homepage.selectMyAccountOptions("Logout");
        //3.16 Verify the text “Account Logout”
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[contains(text(),'Account Logout')]")), "Account Logout");
        //3.17 Click on Continue button
        logoutPage.clickOnContinueButton();

    }

    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() {
        // 4.1 Click on My Account Link.
        homepage.clickOnMyAccountLink();
        //4.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
        homepage.selectMyAccountOptions("Login");
        // Enter the Login details
        loginPage.enterLoginDetails();
        //4.8 Click on My Account Link.
        myAccountPage.clickOnMyAccountLink();
        //4.9 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
        myAccountPage.selectMyAccountOptions("Logout");
        //4.10 Verify the text “Account Logout”
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[contains(text(),'Account Logout')]")),"Account Logout");
        logoutPage.clickOnContinueButton();

    }

}
