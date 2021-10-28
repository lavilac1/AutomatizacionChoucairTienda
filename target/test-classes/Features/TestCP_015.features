Feature: Ejecucion casos de prueba 2

  Scenario Outline: CP_015 Prueba enlaces mi cuenta
    Given abrir pagina de la tienda
    When clic en sign in
    And ingresar correo <Email>
    And ingresar contraseña <clave>
    And clic en el botonsign in
    And clic en historial de ordenes
    And El resultado debe ser <historial>
    And clic en regresar
    And clic en historial creditos
    And El resultado debe ser <creditos>
    And clic en regresar
    And clic en mis direcciones
    And El resultado debe ser <direcciones>
    And clic en regresar
    And clic en mi informacion
    And El resultado debe ser <informacion>
    And clic en regresar
    And clic en mi lista
    Then El resultado debe ser <lista>

    Examples:
    | Email | clave  |historial|creditos|direcciones|informacion|lista|
    |luisalanana@hotmail.com |    123456      |   ORDER HISTORY|CREDIT SLIPS|MY ADDRESSES|YOUR PERSONAL INFORMATION|MY WISHLISTS|



