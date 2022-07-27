package pl.coderslab.seleniumcourse.cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import static org.junit.jupiter.api.Assertions.fail;

public class Zadanie_zal_1_loginPageFactory {

    @FindBy(xpath = "//*[contains(text(),\"Sign in\")]")
    private WebElement signInIcon;
    @FindBy(name = "email")
    private WebElement emailInput;
    @FindBy(name = "password")
    private WebElement passwordInput;
    @FindBy(id = "submit-login")
    private WebElement signInButton;

    @FindBy(id = "addresses-link")
    private WebElement addressesButton;

    @FindBy(xpath = "//a[@data-link-action=\"add-address\"]")
    private WebElement createNewAddressButton;

    @FindBy(name = "alias")
    private WebElement aliasInput;

    @FindBy(name = "address1")
    private WebElement addressInput;

    @FindBy(name = "city")
    private WebElement cityInput;

    @FindBy(name = "postcode")
    private WebElement zipInput;

    @FindBy(name = "id_country")
    private WebElement countryInput;

    @FindBy(name = "phone")
    private WebElement phoneInput;

    @FindBy(css = ".btn.btn-primary.float-xs-right")
    private WebElement saveButton;

    @FindBy(css = ".alert.alert-success")
    private WebElement deleteSuccessMessage;

    @FindBy(className = "address-body")
    List<WebElement> allAddressBodies;

    @FindBy(xpath = "//a[@data-link-action=\"delete-address\"]")
    private WebElement deleteButton;


    public Zadanie_zal_1_loginPageFactory(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }


    public void signInIconClick() {
        signInIcon.click();

    }

    public void logInAs(String email, String password) {
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        signInButton.click();

    }

    public void addressesButtonClick() {
        addressesButton.click();

    }

    public void createNewAddressButtonClick() {
        createNewAddressButton.click();

    }

    public void newAddress(String alias, String address, String city, String postcode, String country, String phone) {
        aliasInput.sendKeys(alias);
        addressInput.sendKeys(address);
        cityInput.sendKeys(city);
        zipInput.sendKeys(postcode);
        countryInput.sendKeys(country);
        phoneInput.sendKeys(phone);

    }

    public void createNewAddress() {
        saveButton.click();
    }

    public void newAddressCheck(String city) {
        for (int i = 0; i < allAddressBodies.size(); i++) {
            WebElement currentAddressElement = allAddressBodies.get(i);
            if (!currentAddressElement.getText().toLowerCase().contains(city.toLowerCase())) {
                fail(String.format("Address %s NOT found in existing addresses", city));
            }

        }
    }

    public void deleteAddress() {
        deleteButton.click();
    }

    public void deleteAddresCheck() {
        String expectedPhrase = "deleted";
        if (!deleteSuccessMessage.getText().toLowerCase().contains(expectedPhrase.toLowerCase())) {
            fail(String.format("Address is NOT succesfully deleted"));
        }
    }
}