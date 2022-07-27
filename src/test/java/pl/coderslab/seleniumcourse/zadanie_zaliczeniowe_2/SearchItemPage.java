package pl.coderslab.seleniumcourse.zadanie_zaliczeniowe_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchItemPage {
    private WebDriver driver;
    public SearchItemPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void mainPage() {
        WebElement pageLogo = driver.findElement(By.id("_desktop_logo"));
        pageLogo.click();

    }
    public void chooseItem() {
        WebElement itemImg = driver.findElement(By.xpath("//img[@alt=\"Brown bear printed sweater\"]"));
        itemImg.click();
    }
}
