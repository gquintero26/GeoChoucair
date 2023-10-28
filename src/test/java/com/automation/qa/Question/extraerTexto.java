package com.automation.qa.Question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.openqa.selenium.By;
public class extraerTexto implements Question<String> {
    private final By elementLocator;

    public extraerTexto(By elementLocator) {
        this.elementLocator = elementLocator;
    }
    public static extraerTexto fromElement(By elementLocator) {
        return new extraerTexto(elementLocator);
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(elementLocator).answeredBy(actor).toString();
    }

}
