package com.automation.qa.Steps;
/*
 **@Autor: gequintero
 */

import com.automation.qa.Task.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import com.automation.qa.Navigation.NavigateTo;

public class LoginSteps {


    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Steps
    validarTask validarTask;

    @Given("^(.*) que al ingresar al sitio web$")
    public void que_al_ingresar_al_sitio_web(String actor) {
        theActorCalled(actor).attemptsTo(
                NavigateTo.theHomePage(),
                loginTask.login()
        );
    }


    @When("^(.*) se crea un nuevo producto \"([^\"]*)\"$")
    public void SeCreaUnNuevoProducto(String actor, String Nombre_producto)   {
        theActorCalled(actor).attemptsTo(
                nuevoProductoTask.NuevoProducto(Nombre_producto)

        );

        theActorCalled(actor).attemptsTo(
                formularioTask.formulario()
        );

        theActorCalled(actor).attemptsTo(
                buscarProductoTask.buscarProducto(Nombre_producto)
        );

    }


    @Then("^(.*) realiza un filtrado y validar su existencia \"([^\"]*)\"$")
    public void RealizaUnFiltradoYValidarSuExistencia( String Nombre_producto) {

        validarTask.NombreProductoRegistrado(Nombre_producto);

    }
}
