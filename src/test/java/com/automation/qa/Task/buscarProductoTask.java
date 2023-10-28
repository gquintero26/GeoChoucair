package com.automation.qa.Task;
/*
 **@Autor: gequintero
 */
import com.automation.qa.Page.nuevoProductoPO;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;


public class buscarProductoTask {

    public static Performable buscarProducto(String Nombre_producto)  {
        return Task.where("Buscar producto creado",
                Enter.theValue(Nombre_producto).into(nuevoProductoPO.inputBuscar)

        );

    }
}
