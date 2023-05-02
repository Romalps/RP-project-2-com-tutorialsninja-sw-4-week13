package com.tutorialsninja.testsuite;

import com.google.common.base.Verify;
import com.tutorialsninja.pages.*;
import com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccountsTest extends BaseTest {

    Homepage homepage = new Homepage();
    RegisterPage registerPage = new RegisterPage();
    SuccessPage successPage = new SuccessPage();
    LoginPage loginPage = new LoginPage();
    MyAccountPage myAccountPage= new MyAccountPage();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {

        //1.1 Click on My Account Link.
        homepage.clickOnMyAccountLink();
        //1.2 Call the method “selectMyAccountOptions” method and pass the parameter "Register”
        homepage.selectMyAccountOptions("Register");
        //1.3 Verify the text “Register Account”.
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[normalize-space()='Register Account']")), "Register Account");
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {

        // 2.1 Click on My Account Link.
        homepage.clickOnMyAccountLink();
        //2.2 Call the method “selectMyAccountOptions” method and pass the parameter " Login ”
        homepage.selectMyAccountOptions("Login");
        //2.3 Verify the text “Returning Customer”.
        Assert.assertEquals(getTextFromElement(By.xpath("//h2[contains(text(),'Returning Customer')]")), "Returning Customer");

    }

    @Test
    public void verifyThatUserRegisterAccountSuccessfully() {

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
        //3.2 Call the method “selectMyAccountOptions” method and pass the parameter “Logout "
        homepage.selectMyAccountOptions("Logout");

    }

    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() {

        // 4.1 Click on My Account Link.
        homepage.clickOnMyAccountLink();
        //4.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
        homepage.selectMyAccountOptions("Login");
        // Enter the Login details
        loginPage.enterLoginDetails();
        //4.7 Verify text “My Account”
        Assert.assertEquals(getTextFromElement(By.xpath("//h2[normalize-space()='My Account']")),"My Account");
        //4.8 Click on My Account Link.
        myAccountPage.clickOnMyAccountLink();
        //4.9 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
        myAccountPage.selectMyAccountOptions("Logout");


    }

}
