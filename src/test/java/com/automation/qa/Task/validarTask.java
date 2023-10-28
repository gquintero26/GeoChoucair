package com.automation.qa.Task;
/*
 **@Autor: gequintero
 */
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import com.automation.qa.Page.nuevoProductoPO;
import org.openqa.selenium.WebElement;
import static jxl.biff.FormatRecord.logger;

public class validarTask extends UIInteractionSteps{

    @Step("Extraer nombre del producto registrado")
    public void NombreProductoRegistrado(String Nombre_producto){

        $(nuevoProductoPO.NombreProductoReegistrado).waitUntilEnabled ();
        WebElement trigger = $(nuevoProductoPO.NombreProductoReegistrado);
        String texto = trigger.getText();
        if( Nombre_producto.equals(texto)) {
            logger.info("NOMBRE DEL PRODUCTO|"+texto+"|");
        }else {
            logger.info("NO SE LOGRO EXTRAER EL NOMBRE DEL PRODUCTO|");
        }
    }

}
