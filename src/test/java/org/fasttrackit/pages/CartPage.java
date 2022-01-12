package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CartPage extends PageObject {

    @FindBy(css = ".first.odd .a-center [title='Remove Item']")
    private WebElementFacade clickOnDeleteButton;
    
    public void clickOnDeleteButton(){
        clickOn(clickOnDeleteButton);
    }
    
    
}
