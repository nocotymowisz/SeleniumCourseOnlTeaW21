package pl.coderslab.seleniumcourse.zadanie_zaliczeniowe_2;

import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
}
