	@tag

	Feature: Es que un usuario realize el ingreso app , con usuario y  contraseña 


  @tag1
  
  Scenario:  Ingreso Login
  
    Given se debe montrar la URL correcta y el boton inicio de sesion
    When se debe registrar el usuario 
    Then al dar clic en el boton ok debe cerrar la pagina 

@tag2
  
  Scenario:  Realizar Compra
  
    Given se debe ingresar a la URL
    When seleccionamos producto 
    Then cerramos la pag
    
