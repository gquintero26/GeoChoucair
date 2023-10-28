package com.automation.qa.Task;
/*
 **@Autor: gequintero
 */
import com.automation.qa.Page.nuevoProductoPO;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class formularioTask {

    public static Performable formulario()  {
        return Task.where("Llenar formulario",

                Click.on(nuevoProductoPO.listSupplier),
                Enter.theValue("Aux joyeux ecclésiastiques").into(nuevoProductoPO.slctSupplier),
                Click.on(nuevoProductoPO.slctResult),
                Click.on(nuevoProductoPO.listCategory),
                Enter.theValue("Produce").into(nuevoProductoPO.slctCategory),
                Click.on(nuevoProductoPO.slctResult),
                Enter.theValue("1").into(nuevoProductoPO.inputCantidad),
                Enter.theValue("5").into(nuevoProductoPO.inputPrecioUnidad),
                Enter.theValue("500").into(nuevoProductoPO.inputUnidadStock),
                Enter.theValue("100").into(nuevoProductoPO.inputUnidadPedido),
                Enter.theValue("50").into(nuevoProductoPO.inputUnidadReorden),
                Click.on(nuevoProductoPO.btnGuardar)
        );

    }
}
