package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.*;
import com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingCartTest extends BaseTest {


    Homepage homepage = new Homepage();
    DesktopPage desktopPage = new DesktopPage();
    HPLP3065Page hplp3065Page = new HPLP3065Page();

    LaptopsAndNotebooksPage laptopsAndNotebooksPage = new LaptopsAndNotebooksPage();
    MacBookPage macBookPage = new MacBookPage();
    ShoppingCartPage shoppingCartPage =new ShoppingCartPage();

    @Test
    public void verifyProductHPLP3065AddedToSHoppingCartSuccessfully() {

        // 2.1 Mouse hover on Desktops Tab. and click
        homepage.mouseHoverOnDesktopsTabAndClick();
        //2.2 Click on “Show All Desktops”
        homepage.selectMenu("Show AllDesktops");
        //2.3 Select Sort By position "Name: A to Z"
        desktopPage.getProductNameAToZAndSelectHPLP3065();
        hplp3065Page.selectDeliveryDate2022_11_30();
        hplp3065Page.enterQty_1();
        hplp3065Page.addHPLP3065ToCart();
        hplp3065Page.clickOnShoppingCartText();


        //2.11 Verify the text "Shopping Cart"
        // waitUntilVisibilityOfElementLocated(By.xpath("//div[@id='content']//h1"),10);
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[contains(text(),'Shopping Cart')]")), "Shopping Cart  (1.00kg)");
        //Assert.assertTrue(getTextFromElement(By.xpath("//h1[contains(text(),'Shopping Cart')]")).contains("Shopping Cart"));
        //2.12 Verify the Product name "HP LP3065"
        Assert.assertEquals(getTextFromElement(By.xpath("(//a[contains(text(),'HP LP3065')])[2]")), "HP LP3065", "Product name not matched");
        //2.13 Verify the Delivery Date "2022-11-30"
        //waitUntilVisibilityOfElementLocated(By.xpath("//small[normalize-space()='Delivery Date:2022-11-30']"),10);
        Assert.assertEquals(getTextFromElement(By.xpath("//small[normalize-space()='Delivery Date:2022-11-30']")), "Delivery Date:2022-11-30");
        //2.14 Verify the Model "Product21"
        Assert.assertEquals(getTextFromElement(By.xpath("//td[normalize-space()='Product 21']")), "Product 21", "Model not matched");
        //2.15 Verify the Total "£74.73"
        Assert.assertEquals(getTextFromElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]")), "£74.73", "Total not matched");


    }

@Test
    public void verifyThatUserPlaceMacBookOrderSuccessfully() {

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
        Assert.assertEquals(getTextFromElement(By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")), "MacBook","Product name not matched" );
        //2.11 Change Quantity "2"
        shoppingCartPage.changeMacBookQty1To2();
        //2.12 Click on “Update” Tab
        shoppingCartPage.clickOnUpdateTab();
        //2.13 Verify the message “Success: You have modified your shopping cart!”
        Assert.assertTrue(getTextFromElement(By.xpath("//div[@id='checkout-cart']/div[1]")).contains("Success: You have modified your shopping cart!"),"Cart not modified");
        //2.14 Verify the Total £737.45
        Assert.assertEquals(getTextFromElement(By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]")), "£737.45","Total not matched" );
        //2.15 Click on “Checkout” button
        shoppingCartPage.clickOnCheckoutButton();


    }

}
