package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class LogoutPage extends Utility {

    By continueButtonLink = By.xpath("//a[contains(text(),'Continue')]");

    //3.17 Click on Continue button
    public void clickOnContinueButton() {
        clickOnElement(continueButtonLink);

    }

}
