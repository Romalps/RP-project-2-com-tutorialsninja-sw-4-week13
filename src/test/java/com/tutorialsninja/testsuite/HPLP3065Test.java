package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HPLP3065Page;
import com.tutorialsninja.pages.Homepage;
import com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HPLP3065Test extends BaseTest {


    Homepage homepage = new Homepage();
    DesktopPage desktopPage = new DesktopPage();
    HPLP3065Page hplp3065Page = new HPLP3065Page();

    @Test
    public void verifyProductAddedToShoppingCartSuccessfully() {


        // 2.1 Mouse hover on Desktops Tab. and click
        homepage.mouseHoverOnDesktopsTabAndClick();
        //2.2 Click on “Show All Desktops”
        homepage.selectMenu("Show AllDesktops");
        //2.3 Select Sort By position "Name: A to Z"
        desktopPage.getProductNameAToZAndSelectHPLP3065();
        //2.5 Verify the Text "HP LP3065"
        Assert.assertEquals(getTextFromElement(desktopPage.hpLP3065), "HP LP3065", "HP LP3065 Product not display");

        hplp3065Page.selectDeliveryDate2022_11_30();// 2.6 Select Delivery Date "2022-11-30"
        hplp3065Page.enterQty_1();// 2.7.Enter Qty "1” using Select class.
        hplp3065Page.addHPLP3065ToCart();//2.8 Click on “Add to Cart” button

        //2.9 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
        Assert.assertTrue(getTextFromElement(By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible"))
                .contains("Success: You have added HP LP3065 to your shopping cart!"), "Product not added to cart");

        //2.10 Click on link “shopping cart” display into success message
        hplp3065Page.clickOnShoppingCartText();


    }


}
