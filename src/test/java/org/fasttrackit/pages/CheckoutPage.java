package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.yecht.Data;

import java.time.Duration;

public class CheckoutPage extends PageObject {

    @FindBy(css= ".bottom button")
    private WebElementFacade proceedCheckoutButton;

    @FindBy(id = "billing[firstname]")
    private WebElementFacade firstNameField;

    @FindBy(css = "billing[lastname]")
    private WebElementFacade lastNameField;

    @FindBy(css ="input#billing\\:street1")
    private WebElementFacade addressField;

    @FindBy(css = "[name='billing[city]'")
    private WebElementFacade cityField;

    @FindBy(css = "#billing\\:region_id ")      //  [name='billing[region_id]'
    private WebElementFacade stateField;

    @FindBy(css = "#billing\\:postcode")      //  billing[postcode]
    private WebElementFacade postcodeField;

    @FindBy(css = "billing[country_id]")
    private WebElementFacade countryField;

    @FindBy(css = "#billing\\:telephone")    // billing[telephone]
    private WebElementFacade phoneField;

    @FindBy(css = "[title='Ship to this address']")
    private WebElementFacade shippingField;

    @FindBy(css = "[onclick='billing.save()'] > span")
    private WebElementFacade continueButton;

    // wait

    @FindBy(id = "#s_method_flatrate_flatrate") //[value='flatrate_flatrate']  // [name='shipping_method']
    private WebElementFacade shippingButton; //#s_method_freeshipping_freeshipping      #s_method_flatrate_flatrate

    @FindBy(css = "#shipping-method-buttons-container > button > span > span") // button.button.validation-passed span span
    private WebElementFacade continueShippingButton; //shippingMethod.save()    #shipping-method-buttons-container > button > span > span

    @FindBy(css = "payment-buttons-container > button > span > span")     //#payment-buttons-container > button > span > span
    private WebElementFacade continuePaymentButton;     //payment.save()

    // wait

    @FindBy(css = "review.save()")
    private WebElementFacade placeOrderButton;

    public void clickOnProceedCheckoutButton(){
        clickOn(proceedCheckoutButton);
    }

    public void setFirstNameField(String firstName){
        typeInto(firstNameField, firstName);
    }

    public void setLastNameField(String lastName){
        typeInto(lastNameField, lastName);
    }

    public void setAddressField(String address){
        typeInto(addressField, address);
    }

    public void setCityField(String city){
        typeInto(cityField, city);
    }

    public void setStateField(){
        clickOn(stateField);
        stateField.selectByIndex(1);
    }

    public void setPostcodeField(String postCode){
        typeInto(postcodeField, postCode);
    }

    public void setCountryField(){
        clickOn(countryField);
        countryField.selectByValue("România");
    }

    public void setPhoneField(String phoneNumber){
        typeInto(phoneField, phoneNumber);
    }

    public void clickShippingField(){
        clickOn(shippingField);
    }

    public void clickOnContinueButton(){
        clickOn(continueButton);
    }

    public void clickOnShippingButton(){
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(shippingButton);
        clickOn(shippingButton);
    }

    public void clickOnContinueShippingButton(){
        clickOn(continueShippingButton);
    }

    public void clickOnContinuePaymentButton(){
       // waitFor(continuePaymentButton);
        clickOn(continuePaymentButton);
    }

    public void clickOnPlaceOrderButton(){
        clickOn(placeOrderButton);
    }









}
