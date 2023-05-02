package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.Homepage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {

    Homepage homepage = new Homepage();

    @Test
    public void verifyUserShouldNavigateToDesktopPageSuccessfully() {

        //1.1 Mouse hover on “Desktops” Tab and click
        homepage.mouseHoverOnDesktopsTabAndClick();
        //1.2 call selectMenu method and pass the menu = “Show AllDesktops”
        homepage.selectMenu("Show AllDesktops");


    }
    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){
        //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        homepage.mouseHoverOnLaptopsAndNotebooksTabAndClick();
        //2.2 call selectMenu method and pass the menu = “Show AllLaptops & Notebooks”
        homepage.selectMenu("Show AllLaptops & Notebooks");

    }
@Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
    //3.1 Mouse hover on “Components” Tab and click
    homepage.mouseHoverOnComponentsTabAndClick();
    //3.2 call selectMenu method and pass the menu = “Show AllComponents”
    homepage.selectMenu("Show AllComponents");

}

}
