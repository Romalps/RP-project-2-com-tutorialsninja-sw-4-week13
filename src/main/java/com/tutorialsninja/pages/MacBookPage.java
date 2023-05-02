package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class MacBookPage extends Utility {

    By macBookAddToCartButtonLink = By.xpath("//button[@id='button-cart']");

    //2.6 Click on ‘Add To Cart’ button
    public void ClickMacBookOnAddToCart() {
        clickOnElement(macBookAddToCartButtonLink);
    }

    By shoppingCartLink = By.xpath("//a[contains(text(),'shopping cart')]");

    //2.8 Click on link “shopping cart” display into success message
    public void clickOnLinkShoppingCartIntoSuccessMessage() {
        clickOnElement(shoppingCartLink);
    }

}
