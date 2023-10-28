package com.automation.qa;
/*
 **@Autor: gequintero
 */
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature",
        plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json",}
)
public class testRunner {
}
