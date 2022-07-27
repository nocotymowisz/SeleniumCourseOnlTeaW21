package pl.coderslab.seleniumcourse.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(features = "src/cucumber/features/zadanie_zaliczeniowe_2.feature", plugin = {"pretty","html:out"})
    public class zad2Test {
    }

