Feature: Ejecucion casos de prueba

  Scenario Outline: CP_003 Prueba  funcionalidad de búsqueda
    Given abrir pagina de la tienda
    When Ingresar texto <keyswords>
    And Presionar boton lupa
    Then El resultado debe ser <resultado>


    Examples:
      | keyswords   | resultado|
      | Una carta es un medio de comunicación escrita por un emisor (remitente) y enviado a un receptor (destinatario).Normalmente, el nombre y la dirección del destinatario aparecen en el frente del sobre, el nombre y la dirección del remitente aparecen en el reverso del mismo (en el caso de sobres manuscritos) o en el anverso (en los sobres preimpresos).|No results were found for your search|
      |4589552233655422334443                                                                                                                                                                                                                                                                                                                                         |No results were found for your search|
      | /*-+°!”#$%&//                                                                                                                                                                                                                                                                                                                           |No results were found for your search|


    Scenario Outline: CP_005 - CP_006 - CP_007 Prueba contact us
    Given abrir pagina de la tienda
    When clic en contact us
    And seleccionar en Subject Heading <Subject>
    And ingresar Email <Email>
    And ingresar Order <Order>
    And ingresar un mensaje <Message>
    Then El resultado debe ser <respuesta>

    Examples:
      | Subject | Email  |Order|Message|respuesta|
      |1  |    luisalanana@hotmail.com       |    852266    |  No llego mi pedido desde del mes de enero     |Your message has been successfully sent to our team.|
      |0  |                                  |              |                                                |Invalid email address.                                                 |
      |1  |       luisalanana                           |  Hola            |   48555668                                             |Invalid email address.                                                             |


  Scenario Outline: CP_008 - CP_009 - CP_010 Prueba sign in
    Given abrir pagina de la tienda
    When clic en sign in
    And ingresar registro email <Email>
    And clic en create an account
    And Sleccionar title
    And ingresar un nombre <nombre>
    And ingresar un apellido <apellido>
    And ingresar un password <password>
    And ingresar día nacimiento <dia>
    And ingresar mes nacimiento <mes>
    And ingresar año nacimiento <ano>
    And ingresar capañia <compania>
    And ingresar direccion <direccion>
    And ingresar ciudad <ciudad>
    And seleccionar estado <estado>
    And ingresar codigo postal <postal>
    And ingresar informacion adicional <adicional>
    And ingresar telefono casa <tel>
    And ingresar celular <cel>
    And limpiar alias
    And ingresar alias <alias>
    And clic en registrar
    Then El resultado debe ser <respuesta>


    Examples:
      | Email  |nombre|apellido|password|dia|mes|ano|compania|direccion|ciudad|estado|postal|adicional|tel |cel|alias|respuesta|
      |    carlos@hotmail.com       |    Luisa    |  avila     |123456|3|10|1993|los panchos|carrera 59#6640 |Orlando|9|37789|ubicado cerca a la playa|+1 321|+1 32166666|Mi casa|MY ACCOUNT|
      |      pepitosew@hotmail.com                         |             |            |      | |  |    |           |                |       | |     |                        |      |           |       |  You must register at least one phone number.       |
      |    juanchos@hotmail.com       |    Luvdvd9gv-isa    |  avila     |123456|3|10|1993|los panchos|carrera 59#6640 |Orlando|9|37789|ubicado cerca a la playa|+1 321|+1 32166666|Mi casa|firstname is invalid|



  Scenario Outline: CP_011 - CP_012 - CP_013 Prueba inicio sesion
    Given abrir pagina de la tienda
    When clic en sign in
    And ingresar correo <Email>
    And ingresar contraseña <clave>
    And clic en el botonsign in
    Then El resultado debe ser <respuesta>

    Examples:
      | Email | clave  |respuesta|
      |luisalanana@hotmail.com |    123456      |    MY ACCOUNT|
      | |                                  |       An email address required.       |
      |luisalanana@hotmail.com |                                  |       Password is required.       |
      |luisalanana@hotmail |                                  |         Invalid email address.              |


