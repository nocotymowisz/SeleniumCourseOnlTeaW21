package pl.coderslab.seleniumcourse.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/cucumber/features/zadanie_zaliczeniowe_1.feature", plugin = {"pretty","html:out"})
public class zadanie_zal_1_Test {
}