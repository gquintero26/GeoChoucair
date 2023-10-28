package com.automation.qa.Navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;


public class NavigateTo {

    public static Performable theHomePage() {
        return Task.where("opens",
                Open.browserOn().the(homePage.class));
    }
}
