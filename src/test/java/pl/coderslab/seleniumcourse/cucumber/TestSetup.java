package pl.coderslab.seleniumcourse.cucumber;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.coderslab.seleniumcourse.zadanie_zaliczeniowe_2.*;

import java.time.Duration;

public class TestSetup {

   protected WebDriver driver;
   protected LoginStorePage loginStorePage;
   protected SearchItemPage searchItemPage;
   protected CartPage cartPage;
   protected ItemDetailsPage itemDetailsPage;
   protected AddressConfirmPage addressConfirmPage;
   protected PaymentPage paymentPage;
   protected PrintScreenPage printScreenPage;
   @BeforeEach
    public void setUp() {
       System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
       driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
      loginStorePage = new LoginStorePage(driver);
      searchItemPage = new SearchItemPage(driver);
      cartPage = new CartPage(driver);
      itemDetailsPage = new ItemDetailsPage(driver);
      addressConfirmPage = new AddressConfirmPage(driver);
      paymentPage = new PaymentPage(driver);
      printScreenPage = new PrintScreenPage(driver);
   }
}
