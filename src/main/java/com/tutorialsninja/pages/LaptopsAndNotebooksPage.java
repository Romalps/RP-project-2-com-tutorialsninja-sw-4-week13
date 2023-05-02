package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopsAndNotebooksPage extends Utility {

    public ArrayList originalProductPrice;
    public ArrayList afterSortByPrice;
    By priceHighToLow = By.id("input-sort");

    By productsPrice = By.xpath("//p[@class ='price']");

    // Get all the products price and stored into array list
    public void getAllTheProductsPriceDisplayHighToLow() {

        List<WebElement> products = driver.findElements(productsPrice);
        List<Double> originalProductPrice = new ArrayList<>();
        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(originalProductPrice);
        // Sort By Reverse order
        Collections.sort(originalProductPrice, Collections.reverseOrder());
        System.out.println(originalProductPrice);
        selectByVisibleTextFromDropDown(priceHighToLow, "Price (High > Low)");
        // After filter Price (High > Low) Get all the products price and stored into array list
        products = driver.findElements(productsPrice);
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(afterSortByPrice);

    }


    By macBookLink = By.linkText("MacBook");
    public void selectProductMacBook(){

        clickOnElement(macBookLink);
    }
    public void placeLaptopsAndNotebooksOrderSuccessfully() {






    }


}
