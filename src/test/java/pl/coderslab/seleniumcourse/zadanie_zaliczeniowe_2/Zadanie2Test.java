package pl.coderslab.seleniumcourse.zadanie_zaliczeniowe_2;

import io.cucumber.java.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;

public class Zadanie2Test {
    private WebDriver driver;
    private LoginStorePage loginStorePage;
    private SearchItemPage searchItemPage;
    private CartPage cartPage;
    private ItemDetailsPage itemDetailsPage;
    private AddressConfirmPage addressConfirmPage;
    private PaymentPage paymentPage;
    private PrintScreenPage printScreenPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        this.driver = new ChromeDriver();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.loginStorePage = new LoginStorePage(driver);
        this.searchItemPage = new SearchItemPage(driver);
        this.cartPage = new CartPage(driver);
        this.itemDetailsPage = new ItemDetailsPage(driver);
        this.addressConfirmPage = new AddressConfirmPage(driver);
        this.paymentPage = new PaymentPage(driver);
        this.printScreenPage = new PrintScreenPage(driver);
    }

    @Test
    public void shouldOrderAndTakeScreenshot() throws IOException {
        loginStorePage.loginAsCreatedUser("gdhthtdxtzehqimdxa@bvhrk.com", "Tajnehaslo123");
        searchItemPage.mainPage();
        searchItemPage.chooseItem();
        itemDetailsPage.selectSize("M");
        itemDetailsPage.setQuantity("5");
        itemDetailsPage.addToCart();
        cartPage.proceedToCheckout();
        addressConfirmPage.confirmAddress();
        paymentPage.paymentChoose();
        printScreenPage.savePrintScreen();
    }
}