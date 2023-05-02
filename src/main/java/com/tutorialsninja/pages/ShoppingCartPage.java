package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

    By qty = By.cssSelector("input[value='1']");

    //2.11 Change Quantity "2"
    public void changeMacBookQty1To2() {
        driver.findElement(qty).clear();
        sendTextToElement(qty, "2");

    }

    By updateTab = By.xpath("//button[contains(@data-original-title, 'Update')]");

    //2.12 Click on “Update” Tab
    public void clickOnUpdateTab() {
        clickOnElement(updateTab);
    }

    By checkoutButton = By.xpath("//a[@class='btn btn-primary']");

    // 2.15 Click on “Checkout” button
    public void clickOnCheckoutButton() {
        clickOnElement(checkoutButton);
    }
}
