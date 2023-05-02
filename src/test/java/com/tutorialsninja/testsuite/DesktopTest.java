package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.Homepage;
import com.tutorialsninja.testbase.BaseTest;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DesktopTest extends BaseTest {

    Homepage homepage = new Homepage();
    DesktopPage desktopPage = new DesktopPage();

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {

        //1.1 Mouse hover on “Desktops” Tab and click
        homepage.mouseHoverOnDesktopsTabAndClick();
        //1.2 call selectMenu method and pass the menu = “Show AllDesktops”
        homepage.selectMenu("Show AllDesktops");

        //1.3 Verify the text ‘Desktops’
        String expectedText = "Desktops";
        String actualText = getTextFromElement(By.xpath("//h2[contains(text(),'Desktops')]"));
        Assert.assertEquals(actualText, expectedText, "Not navigate to Desktop page");


    }

    @Test
    public void verifyProductArrangeInAlphabeticalOrder() {

        //1.1 Mouse hover on “Desktops” Tab and click
        homepage.mouseHoverOnDesktopsTabAndClick();
        //1.2 Click on “Show All Desktops”
        homepage.selectMenu("Show AllDesktops");
        //1.3 Select Sort By position "Name: Z to A"
        desktopPage.getTheProductNameZToAAndStoredIntoArrayList();
        //1.4 Verify the Product will arrange in Descending order.

        Assert.assertEquals(desktopPage.afterSortByZToAProductsName,desktopPage.originalProductsName,"Product not sorted into Z to A order");
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessfully(){

        // 2.1 Mouse hover on Desktops Tab. and click
        homepage.mouseHoverOnDesktopsTabAndClick();
        //2.2 Click on “Show All Desktops”
        homepage.selectMenu("Show AllDesktops");
        //2.3 Select Sort By position "Name: A to Z"
        desktopPage.getProductNameAToZAndSelectHPLP3065();

    }

}
