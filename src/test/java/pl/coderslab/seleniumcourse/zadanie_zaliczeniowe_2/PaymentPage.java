package pl.coderslab.seleniumcourse.zadanie_zaliczeniowe_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPage {
    private WebDriver driver;
    public PaymentPage(WebDriver driver) {
        this.driver = driver;
}
    public void paymentChoose() {

        WebElement payByCheck = driver.findElement(By.id("payment-option-1"));
        payByCheck.click();
        WebElement agreeBox = driver.findElement(By.id("conditions_to_approve[terms-and-conditions]"));
        agreeBox.click();
        WebElement orderAndPayButton = driver.findElement(By.xpath("//*[contains(text(),\"Order with an obligation to pay\")]"));
        orderAndPayButton.click();

    }
}