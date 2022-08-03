#language: es

  Característica: confirmar no hay asiento para vuelo

    Antecedentes:
      Dado el usuario este en pagina web
      Cuando el usuario ingrese las credenciales
        | Usuario | Clave    |
        | solv    | Beta.123 |


    Escenario: confirmar no hay asiento para vuelo exitoso
      Dado el usuario ingrese a la opcion de vuelos
      Cuando el usuario cambie la informacion del vuelo
      Y el de clic en continuar
      Entonces el visualizara un mensaje de que no hay asientos


