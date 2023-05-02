package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class CheckoutPage extends Utility {

    By guestCheckoutRadioButtonLink = By.xpath("//input[@value='guest']");

    //2.18 Click on “Guest Checkout” radio button
    public void clickOnGuestCheckoutRadioButton() {
        clickOnElement(guestCheckoutRadioButtonLink);
    }

    By continueTab = By.xpath("//input[@id='button-account']");

    //2.19 Click on “Continue” tab
    public void clickOnContinueTab() {
        clickOnElement(continueTab);
    }

    By firstName= By.xpath("//input[@id='input-payment-firstname']");
    By lastName= By.xpath("//input[@id='input-payment-lastname']");
    By email = By.xpath("//input[@id='input-payment-email']");
    By telephone= By.xpath("//input[@id='input-payment-telephone']");
    By address1 = By.xpath("//input[@id='input-payment-address-1']");
    By city = By.xpath("//input[@id='input-payment-city']");
    By postcode = By.xpath("//input[@id='input-payment-postcode']");
    By country = By.xpath("//select[@id='input-payment-country']");
    By region = By.xpath("//select[@id='input-payment-zone']");
    //2.20 Fill the mandatory fields
    public void fillMandatoryFields(){

        // Find First Name field element and send element
        sendTextToElement(firstName, "prime654");
        // Find Last Name field element and send element
        sendTextToElement(lastName, "Tester");
        // Find Email field element and send element
        sendTextToElement(email, "prime654tester123@gmail.com");
        // Find Telephone field element and send element
        sendTextToElement(telephone, "07963258712");
        // Find Address1 field element and send element
        sendTextToElement(address1, "333, High Hill");
        // Find City field element and send element
        sendTextToElement(city, "Birmingham");
        // Find Postcode field element and send element
        sendTextToElement(postcode, "BR10 6TR");
        // Find Country field element and select element
        selectByVisibleTextFromDropDown(country, "United States");
        // Find Region field element and select element
        selectByVisibleTextFromDropDown(region, "Colorado");
    }

    By continueButton =By.xpath("//input[@id='button-guest']");
    //2.21 Click on “Continue” Button
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
   By addComments = By.xpath("//textarea[@name='comment']");
    //2.22 Add Comments About your order into text area
    public void addCommentsAboutYourOrderIntoTextArea(){
        sendTextToElement(addComments, "Make sure it's arrive on time and handle with care.");
    }
    By termsAndConditionsCheckbox =By.xpath("//input[@name='agree']");
    //2.23 Check the Terms & Conditions check box
    public void checkTheTermsAndConditionsCheckbox(){
        clickOnElement(termsAndConditionsCheckbox);
    }

      By continueBtn = By.xpath("//input[@name='agree']");
    //2.24 Click on “Continue” button
    public void clickOnContinue(){
        clickOnElement(continueBtn);
    }



}
