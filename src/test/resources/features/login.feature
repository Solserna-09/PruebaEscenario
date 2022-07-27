#language: es


Característica: login


  @exitoso
  Escenario: login usuario exitoso
    Dado el usuario este en pagina web
    Cuando el usuario ingrese las credenciales
      | Usuario | Clave    |
      | solv    | Beta.123 |
    Entonces el usuario visualizara la pagina de inicio


  @LoginFalllidos
  Esquema del escenario: :  login usuario fallido
    Cuando el usuario ingrese las credenciales incorrectas
      | Usuario   | Clave   |
      | <usuario> | <clave> |
    Entonces el visualizara que no puede iniciar sesion

    Ejemplos:
      | usuario | clave      |
      | solv    | Beta.124   |
      | solg    | Beta.1 b23 |
      | sols    | Beta.345   |








