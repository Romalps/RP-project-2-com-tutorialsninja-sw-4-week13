package com.tutorialsninja.testsuite;

import com.google.common.base.Verify;
import com.tutorialsninja.pages.Homepage;
import com.tutorialsninja.pages.RegisterPage;
import com.tutorialsninja.pages.SuccessPage;
import com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SuccessTest extends BaseTest {

    Homepage homepage = new Homepage();
    RegisterPage registerPage = new RegisterPage();
    SuccessPage successPage= new SuccessPage();
@Test
    public void verifyThatUserRegisterAccountSuccessfully() {

        // 3.1 Click on My Account Link.
        homepage.clickOnMyAccountLink();
        //3.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register "
        homepage.selectMyAccountOptions("Register");
        // Enter personal details in the Register page
        registerPage.enterYourPersonalDetailsInTheRegisterPage();
        // 3.12 Verify the message “Your Account Has Been Created!”
        Assert.assertEquals( getTextFromElement(By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]")),"Your Account Has Been Created!");
        //3.13 Click on Continue button
        successPage.clickOnContinueButton();



    }


}
