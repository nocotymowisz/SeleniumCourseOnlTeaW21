package pl.coderslab.seleniumcourse.cucumber;

import com.google.common.base.Verify;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.fail;

public class zz1_pageObjectSteps {
    private WebDriver driver;
    private Zz1_loginPageFactory zz1_loginPageFactory;

    @Given("^Browser with open page at address (.*)$")
    public void browserNavigate(String url) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.get(url);
    }

    @And("Sing in icon clicked")
    public void clickSignInIcon() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.zz1_loginPageFactory = new Zz1_loginPageFactory(driver);
        this.zz1_loginPageFactory.signInIconClick();
    }

    @And("^Login using (.*) and (.*)$")
    public void loggingIn(String email, String password) {
        this.zz1_loginPageFactory = new Zz1_loginPageFactory(driver);
        zz1_loginPageFactory.logInAs(email, password);
    }

    @When("Addresses button clicked")
    public void addressesButtonClick() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.zz1_loginPageFactory.addressesButtonClick();

    }

    @And("Create new address button clicked")
    public void createNewAddressButtonClick() {
        this.zz1_loginPageFactory.createNewAddressButtonClick();
    }

    @And("^Create new address using data (.*), (.*), (.*), (.*), (.*), (.*)$")
    public void newAddress(String alias, String address, String city, String postcode, String country, String phone) {
        this.zz1_loginPageFactory.newAddress(alias, address, city, postcode, country, phone);
    }

    @Then("New address is created")
    public void createNewAddress() {
        this.zz1_loginPageFactory.createNewAddress();
    }
    @And("^Verify the new address (.*)$")
    public void addressContainPhrase(String address) {
    }

    @Then("Delete the new address")
    public void clickDeleteButton() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.zz1_loginPageFactory.deleteAddress();

    }


}