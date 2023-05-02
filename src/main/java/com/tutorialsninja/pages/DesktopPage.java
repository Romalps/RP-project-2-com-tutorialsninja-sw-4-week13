package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {

    public ArrayList afterSortByZToAProductsName;
    public ArrayList originalProductsName;
    By nameZtoA = By.id("input-sort");
    By productsName = By.xpath("//h4/a");

    // Get all the products name and stored into array list
    public void getTheProductNameZToAAndStoredIntoArrayList() {
        List<WebElement> products = driver.findElements(productsName);
        ArrayList<String> originalProductsName = new ArrayList<>();

        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        Collections.reverse(originalProductsName);
        System.out.println(originalProductsName);

        //1.3 Select Sort By position "Name: Z to A"
        selectByVisibleTextFromDropDown(nameZtoA, "Name (Z - A)");

        // After filter Z -A Get all the products name and stored into array list
        products = driver.findElements(productsName);
        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());
        }
        System.out.println(afterSortByZToAProductsName);


    }

    By poundSterlingCurrencyLink = By.xpath("//span[contains(text(),'Currency')]");
    By poundSterling = By.xpath("//button[normalize-space()='£Pound Sterling']");
    By nameAToZ = By.id("input-sort");
    public By hpLP3065 = By.xpath("//a[contains(text(),'HP LP3065')]");


    public void getProductNameAToZAndSelectHPLP3065() {

        // Select currency as £ Pound Sterling

        clickOnElement(poundSterlingCurrencyLink);
        clickOnElement(poundSterling);

        //2.3 Select Sort By position "Name: A to Z"
        selectByVisibleTextFromDropDown(nameAToZ, "Name (A - Z)");
        //2.4 Select product “HP LP3065”
        clickOnElement(hpLP3065);


    }

}



