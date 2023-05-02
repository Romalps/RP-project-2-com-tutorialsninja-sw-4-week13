package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class SuccessPage extends Utility {

    By continueButton = By.xpath("//a[contains(text(),'Continue')]");
    //3.13 Click on Continue button
    public void clickOnContinueButton(){
        clickOnElement(continueButton);

    }


}
