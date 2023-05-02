package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.Homepage;
import com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComponentsTest extends BaseTest {

Homepage homepage = new Homepage();


@Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){

    //3.1 Mouse hover on “Components” Tab and click
    homepage.mouseHoverOnComponentsTabAndClick();
    //3.2 call selectMenu method and pass the menu = “Show AllComponents”
    homepage.selectMenu("Show AllComponents");
    //3.3 Verify the text ‘Components’
    Assert.assertEquals(getTextFromElement(By.xpath("//h2[contains(text(),'Components')]")),"Components","Not navigate to Laptops and Notebooks page");
    


}




}
