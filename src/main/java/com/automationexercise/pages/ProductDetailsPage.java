package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Blue Top']")
    WebElement productNameText;

    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Category: Women > Tops']")
    WebElement categoryText;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Rs. 500']")
    WebElement priceText;

    @CacheLookup
    @FindBy(xpath = "//p[text() = ' In Stock']")
    WebElement availabilityText;

    @CacheLookup
    @FindBy(xpath = "//p[text() = ' New']")
    WebElement conditionText;

    @CacheLookup
    @FindBy(xpath = "//p[text() = ' Polo']")
    WebElement brandText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='quantity']")
    WebElement quantityField;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//u[normalize-space()='View Cart']")
    WebElement viewCartLink;







    public String verifyProductName(){
        return getTextFromElement(productNameText);
    }

    public String verifyCategory(){
        return getTextFromElement(categoryText);
    }

    public String verifyPrice(){
        return getTextFromElement(priceText);
    }

    public String verifyAvailability(){
        return getTextFromElement(availabilityText);
    }

    public String verifyTheCondition(){
        return getTextFromElement(conditionText);
    }

    public String verifyTheBrand(){
        return getTextFromElement(brandText);
    }

    public void enterQuantityInField(String quantity){
        clearTextOnElement(quantityField);
        sendTextToElement(quantityField,quantity);
    }

    public void clickOnAddToCartButton(){
        clickOnElement(addToCartButton);
    }

    public void clickOnViewCardLink(){
        clickOnElement(viewCartLink);
    }
}
