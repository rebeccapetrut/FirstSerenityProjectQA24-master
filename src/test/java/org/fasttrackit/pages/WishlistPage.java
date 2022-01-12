package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class WishlistPage extends PageObject {

    @FindBy(css = ".add-to-links .link-wishlist")
    private WebElementFacade addToWishlistButton;


    public void clickOnAddToWishlistButton(){
        clickOn(addToWishlistButton);
    }
}
