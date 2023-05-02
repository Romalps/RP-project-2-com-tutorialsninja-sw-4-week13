package com.tutorialsninja.testsuite;

import com.google.common.base.Verify;
import com.tutorialsninja.pages.*;
import com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest {

    Homepage homepage = new Homepage();
    DesktopPage desktopPage = new DesktopPage();
    HPLP3065Page hplp3065Page = new HPLP3065Page();

    LaptopsAndNotebooksPage laptopsAndNotebooksPage = new LaptopsAndNotebooksPage();
    MacBookPage macBookPage = new MacBookPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Test
    public void verifyThatUserShouldPlaceMacBookOrderSuccessfully() {

        homepage.selectCurrency£Sterling();
        //2.1 Mouse hover on Laptops & Notebooks Tab.and click
        homepage.mouseHoverOnLaptopsAndNotebooksTabAndClick();
        //2.2 Click on “Show AllLaptops & Notebooks”
        homepage.selectMenu("Show AllLaptops & Notebooks");
        // 2.3 Select Sort By "Price (High > Low)"
        laptopsAndNotebooksPage.getAllTheProductsPriceDisplayHighToLow();
        // 2.4 Select Product “MacBook”
        laptopsAndNotebooksPage.selectProductMacBook();
        //2.6 Click on ‘Add To Cart’ button
        macBookPage.ClickMacBookOnAddToCart();
        //2.8 Click on link “shopping cart” display into success message
        macBookPage.clickOnLinkShoppingCartIntoSuccessMessage();
        //2.9 Verify the text "Shopping Cart"
        Assert.assertTrue(getTextFromElement(By.xpath("//div[@id='content']//h1")).contains("Shopping Cart"));
        //2.9 Verify the text "Shopping Cart"
        Assert.assertTrue(getTextFromElement(By.xpath("//div[@id='content']//h1")).contains("Shopping Cart"));
        //2.10 Verify the Product name "MacBook"
        Assert.assertEquals(getTextFromElement(By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")), "MacBook", "Product name not matched");
        //2.11 Change Quantity "2"
        shoppingCartPage.changeMacBookQty1To2();
        //2.12 Click on “Update” Tab
        shoppingCartPage.clickOnUpdateTab();
        //2.13 Verify the message “Success: You have modified your shopping cart!”
        Assert.assertTrue(getTextFromElement(By.xpath("//div[@id='checkout-cart']/div[1]")).contains("Success: You have modified your shopping cart!"), "Cart not modified");
        //2.14 Verify the Total £737.45
        Assert.assertEquals(getTextFromElement(By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]")), "£737.45", "Total not matched");
        //2.15 Click on “Checkout” button
        shoppingCartPage.clickOnCheckoutButton();


        //2.16 Verify the text “Checkout”
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[normalize-space()='Checkout']")), "Checkout");

        //2.17 Verify the Text “New Customer”
        Assert.assertEquals(getTextFromElement(By.xpath("//h2[normalize-space()='New Customer']")), "New Customer");

        //2.18 Click on “Guest Checkout” radio button
        checkoutPage.clickOnGuestCheckoutRadioButton();

        //2.19 Click on “Continue” tab
        clickOnElement(By.xpath("//input[@id='button-account']"));
        checkoutPage.clickOnContinueTab();
        //2.20 Fill the mandatory fields
        checkoutPage.fillMandatoryFields();
        //2.21 Click on “Continue” Button
        checkoutPage.clickOnContinueButton();
        //2.22 Add Comments About your order into text area
        checkoutPage.addCommentsAboutYourOrderIntoTextArea();
        //2.23 Check the Terms & Conditions check box
        checkoutPage.checkTheTermsAndConditionsCheckbox();
        //2.24 Click on “Continue” button
        checkoutPage.clickOnContinue();
        // 2.25 Verify the message “Warning: Payment method required!
        //Assert.assertTrue(getTextFromElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).contains("Warning: Payment method required!"));




    }
}
