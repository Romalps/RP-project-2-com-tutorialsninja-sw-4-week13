package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Homepage extends Utility {


    public void selectMenu(String menu) {
        List<WebElement> topMenuList = getListOfElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = getListOfElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        }
    }

    By desktopsTab = By.linkText("Desktops");
    By laptopsAndNotebooksTab = By.linkText("Laptops & Notebooks");

    By componentsTab= By.linkText("Components");
    //1.1 Mouse hover on “Desktops” Tab and click
    public void mouseHoverOnDesktopsTabAndClick() {
        mouseHoverToElementAndClick(desktopsTab);
    }

    //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
    public void mouseHoverOnLaptopsAndNotebooksTabAndClick() {
        mouseHoverToElementAndClick(laptopsAndNotebooksTab);
    }
    //3.1 Mouse hover on “Components” Tab and click
    public void mouseHoverOnComponentsTabAndClick(){
        mouseHoverToElementAndClick(componentsTab);
    }

    By poundSterlingCurrencyLink = By.xpath("//span[contains(text(),'Currency')]");
    By poundSterling = By.xpath("//button[normalize-space()='£Pound Sterling']");

    public void selectCurrency£Sterling(){
        // Select currency as £ Pound Sterling
        clickOnElement(poundSterlingCurrencyLink);
        clickOnElement(poundSterling);
    }
    By myAccountLink = By.xpath("//span[contains(text(),'My Account')]");
    //1.1 Click on My Account Link.
    public void clickOnMyAccountLink() {
        clickOnElement(myAccountLink);
    }
    public void selectMyAccountOptions(String option) {
        List<WebElement> myAccountList = getListOfElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        try {
            for (WebElement options : myAccountList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = getListOfElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        }
    }
}
