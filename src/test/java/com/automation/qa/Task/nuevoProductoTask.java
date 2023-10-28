package com.automation.qa.Task;
/*
 **@Autor: gequintero
 */

import com.automation.qa.Page.nuevoProductoPO;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class nuevoProductoTask {

    public static Performable NuevoProducto(String Nombre_producto) {
        return Task.where("Creacion de nuevo producto",
                Click.on(nuevoProductoPO.btnNorthWind),
                Click.on(nuevoProductoPO.btnProducts),
                Click.on(nuevoProductoPO.btnNewProducts),
                Enter.theValue(Nombre_producto).into(nuevoProductoPO.inputNewProduct)

        );
    }
}
