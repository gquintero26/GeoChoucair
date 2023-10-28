
Feature: Creacion de nuevo producto

  # Como usuario requiero la creacion de un nuevo producto y validar su creacion correctamente

  Scenario Outline: Test - Creacion y validacion de nuevo producto
    Given Ana que al ingresar al sitio web
    When Ana se crea un nuevo producto "<Nombre_producto>"
    Then Ana  realiza un filtrado y validar su existencia "<Nombre_producto>"
    Examples:
    |Nombre_producto|
    | Lapicero      |

