package com.automation.qa.Task;
/*
 **@Autor: gequintero
 */
import com.automation.qa.Page.LoginPO;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


public class loginTask {
    public static Performable login() {
        return Task.where("Ingresar al sitio web",
                Click.on(LoginPO.btnLogin)
                );
    }
}
