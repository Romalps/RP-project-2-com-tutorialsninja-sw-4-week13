package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HPLP3065Page extends Utility {


    By calenderButton = By.xpath("//div[@class = 'input-group date']//button");
    By monthAndYearOnDatePicker = By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']");
    By nextButtonOnDatePicker = By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']");
    By alldatesOnDatePicker = By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']");
    By productQty = By.xpath("//input[@id='input-quantity']");
    By addToCartButton = By.xpath("//button[@id='button-cart']");

    //2.6 Select Delivery Date "2023-11-30"
    public void selectDeliveryDate2022_11_30() {

        String year = "2022";
        String month = "November";
        String date = "30";

        clickOnElement(calenderButton);
        while (true) {
            String monthAndYear = driver.findElement(monthAndYearOnDatePicker).getText();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(nextButtonOnDatePicker);
            }
        }
        List<WebElement> allDates = driver.findElements(alldatesOnDatePicker);
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }
    }

    public void enterQty_1() {
        //2.7.Enter Qty "1” using Select class.
        driver.findElement(productQty).clear();
        sendTextToElement(productQty, "1");
    }

    public void addHPLP3065ToCart() {
        //2.8 Click on “Add to Cart” button
        clickOnElement(addToCartButton);
    }


    By shoppingCartButtonLink = By.xpath("//a[normalize-space()='shopping cart']");

    public void clickOnShoppingCartText() {
        waitUntilVisibilityOfElementLocated(shoppingCartButtonLink,10);
        clickOnElement(shoppingCartButtonLink);

    }


}
