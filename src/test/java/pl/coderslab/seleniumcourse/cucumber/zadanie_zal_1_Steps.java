package pl.coderslab.seleniumcourse.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.fail;

public class zadanie_zal_1_Steps {
    private WebDriver driver;
    private Zadanie_zal_1_loginPageFactory zadanieZal1_loginPageFactory;

    @Given("^Browser with open page at address (.*)$")
    public void browserNavigate(String url) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.get(url);
    }

    @And("Sing in icon clicked")
    public void clickSignInIcon() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.zadanieZal1_loginPageFactory = new Zadanie_zal_1_loginPageFactory(driver);
        this.zadanieZal1_loginPageFactory.signInIconClick();
    }

    @And("^Login using (.*) and (.*)$")
    public void loggingIn(String email, String password) {
        this.zadanieZal1_loginPageFactory = new Zadanie_zal_1_loginPageFactory(driver);
        zadanieZal1_loginPageFactory.logInAs(email, password);
    }

    @When("Addresses button clicked")
    public void addressesButtonClick() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.zadanieZal1_loginPageFactory.addressesButtonClick();

    }

    @And("Create new address button clicked")
    public void createNewAddressButtonClick() {
        this.zadanieZal1_loginPageFactory.createNewAddressButtonClick();
    }

    @And("^Create new address using data (.*), (.*), (.*), (.*), (.*), (.*)$")
    public void newAddress(String alias, String address, String city, String postcode, String country, String phone) {
        this.zadanieZal1_loginPageFactory.newAddress(alias, address, city, postcode, country, phone);
    }

    @Then("New address is created")
    public void createNewAddress() {

        this.zadanieZal1_loginPageFactory.createNewAddress();
    }
    @And("^Verify the new address (.*)$")
    public void addressContainPhrase(String address) {
    }

    @Then("Delete the new address")
    public void clickDeleteButton() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.zadanieZal1_loginPageFactory.deleteAddress();

    }
    @And("Check address deletion")
    public void checkDeletion() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.zadanieZal1_loginPageFactory.deleteAddresCheck();
    }

}