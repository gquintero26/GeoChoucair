package com.automation.qa.Page;
/*
 **@Autor: gequintero
 */
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class nuevoProductoPO extends PageObject {


    public static final Target btnNorthWind  = Target.the("Se ingresa NorthWind ").located(By.xpath("//span[contains(text(),'Northwind')]"));

    public static final Target btnProducts  = Target.the("Se ingresa Products ").located(By.xpath("//ul[@id='nav_menu1_2_1']/li[3]"));

    public static final Target btnNewProducts  = Target.the("Se hace tap en new Products ").located(By.xpath("//span[contains(text(),'Nuevo Producto')]"));

    public static final Target inputNewProduct  = Target.the("Se ingrrsa nombre del new Products ").located(By.xpath("//input[@id='Serenity_Demo_Northwind_ProductDialog9_ProductName']"));

    public static final Target btnSelectFile  = Target.the("Se selecciona archivo a subir").located(By.xpath("//*[@class='tool-button add-file-button fileinput-button']"));

    public static Target btnboooo = Target.the("Cuadro de diálogo de selección de archivos").located(By.xpath("//span[contains(text(),'Select File')]"));



    public static final Target listSupplier  = Target.the("Se despliega lista de Producto ").located(By.cssSelector("#select2-chosen-4"));
    public static final Target slctSupplier  = Target.the("Se ingresa Producto ").located(By.xpath("//input[@id='s2id_autogen4_search']"));

    public static final Target slctResult  = Target.the("Se slecciona Producto ").located(By.xpath("//span[@class='select2-match']"));


    public static final Target listCategory  = Target.the("Se ingresa Categoria ").located(By.cssSelector("#select2-chosen-5"));

    public static final Target slctCategory  = Target.the("Se ingresa categoria ").located(By.xpath("//input[@id='s2id_autogen5_search']"));

    public static final Target inputCantidad  = Target.the("Se ingresa Cantidad ").located(By.xpath("//input[@name='QuantityPerUnit']"));

    public static final Target inputPrecioUnidad  = Target.the("Se ingresa precio por unidad ").located(By.xpath("//input[@name='UnitPrice']"));

    public static final Target inputUnidadStock = Target.the("Se ingresa unidad en stock ").located(By.xpath("//input[@name='UnitsInStock']"));

    public static final Target inputUnidadPedido  = Target.the("Se ingresa unidades en pedido ").located(By.xpath("//input[@name='UnitsOnOrder']"));

    public static final Target inputUnidadReorden = Target.the("Se ingresa nivel de reorden").located(By.xpath("//input[@name='ReorderLevel']"));

    public static final Target btnGuardar = Target.the("Se guarda el producto").located(By.xpath("//div[@data-action='save-and-close']"));

    public static final Target inputBuscar = Target.the("Se realiza la busqueda del producto").located(By.xpath("//input[@class='s-Serenity-QuickSearchInput s-QuickSearchInput']"));

    public static By NombreProductoReegistrado = By.xpath("//a[@class='s-EditLink s-Demo-Northwind-ProductLink'][contains(text(), 'Lapicero')]");


}
