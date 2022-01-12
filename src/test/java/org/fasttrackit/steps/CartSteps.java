package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.ProductPage;
import org.junit.Assert;

public class CartSteps extends ScenarioSteps {

    private ProductPage productPage;
    private CartPage cartPage;

    @Step
    public void clickAddProductToCart(){
        productPage.clickAddToCartButton();
    }

    @Step
    public void clickOnDeleteButton(){
        cartPage.clickOnDeleteButton();
    }

    @Step
    public void verifyDeleteProduct(){
        Assert.assertEquals("You have no items in your shopping cart.", "You have no items in your shopping cart.");
    }




}
