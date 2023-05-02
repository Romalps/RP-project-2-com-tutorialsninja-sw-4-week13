package com.tutorialsninja.testsuite;

import com.sun.org.apache.xpath.internal.operations.Neg;
import com.tutorialsninja.pages.Homepage;
import com.tutorialsninja.pages.LaptopsAndNotebooksPage;
import com.tutorialsninja.testbase.BaseTest;
import org.checkerframework.common.reflection.qual.NewInstance;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaptopsAndNotebookPageTest extends BaseTest {


    Homepage homepage = new Homepage();
    LaptopsAndNotebooksPage laptopsAndNotebooksPage = new LaptopsAndNotebooksPage();

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {

        //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        homepage.mouseHoverOnLaptopsAndNotebooksTabAndClick();
        //2.2 call selectMenu method and pass the menu = “Show AllLaptops & Notebooks”
        homepage.selectMenu("Show AllLaptops & Notebooks");
        //2.3 Verify the text ‘Laptops & Notebooks’
        Assert.assertEquals(getTextFromElement(By.xpath("//h2[contains(text(),'Laptops & Notebooks')]")), "Laptops & Notebooks", "Not navigate to Laptops and Notebooks page");

    }

    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() {

        //1.1 Mouse hover on Laptops & Notebooks Tab.and click
        homepage.mouseHoverOnLaptopsAndNotebooksTabAndClick();
        //1.2 Click on “Show AllLaptops & Notebooks”
        homepage.selectMenu("Show AllLaptops & Notebooks");
        // 1.3 Select Sort By "Price (High > Low)"
        laptopsAndNotebooksPage.getAllTheProductsPriceDisplayHighToLow();


        //1.4 Verify the Product price will arrange in High to Low order.
        Assert.assertEquals(laptopsAndNotebooksPage.originalProductPrice, laptopsAndNotebooksPage.afterSortByPrice);


    }

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

    }

}
