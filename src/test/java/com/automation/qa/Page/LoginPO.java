package com.automation.qa.Page;
/*
 **@Autor: gequintero
 */
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPO extends PageObject {

    public static final Target btnLogin = Target.the("Se ingresa hace login").located(By.xpath("//button[@id='LoginPanel0_LoginButton']"));

}