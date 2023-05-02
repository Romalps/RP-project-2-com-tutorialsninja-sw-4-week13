package com.tutorialsninja.testsuite;

import com.google.common.base.Verify;
import com.tutorialsninja.pages.Homepage;
import com.tutorialsninja.pages.LaptopsAndNotebooksPage;
import com.tutorialsninja.pages.MacBookPage;
import com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MacBookTest extends BaseTest {


    Homepage homepage = new Homepage();
    LaptopsAndNotebooksPage laptopsAndNotebooksPage = new LaptopsAndNotebooksPage();
    MacBookPage macBookPage = new MacBookPage();
    @Test
    public void verifyThatUserPlaceOrderSuccessfully() {
        homepage.selectCurrency£Sterling();
        //2.1 Mouse hover on Laptops & Notebooks Tab.and click
        homepage.mouseHoverOnLaptopsAndNotebooksTabAndClick();
        //2.2 Click on “Show AllLaptops & Notebooks”
        homepage.selectMenu("Show AllLaptops & Notebooks");
        // 2.3 Select Sort By "Price (High > Low)"
        laptopsAndNotebooksPage.getAllTheProductsPriceDisplayHighToLow();
        // 2.4 Select Product “MacBook”
        laptopsAndNotebooksPage.selectProductMacBook();
        //2.5 Verify the text “MacBook”
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[contains(text(),'MacBook')]")),"MacBook","MacBook Product not display");
        //2.6 Click on ‘Add To Cart’ button
        macBookPage.ClickMacBookOnAddToCart();
        //2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
        Assert.assertTrue(getTextFromElement(By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible"))
                        .contains("Success: You have added MacBook to your shopping cart!"),"Product not added to cart");

        //2.8 Click on link “shopping cart” display into success message
        macBookPage.clickOnLinkShoppingCartIntoSuccessMessage();



    }


}
