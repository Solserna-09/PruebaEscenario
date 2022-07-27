package com.demo.guru99.StepDefinitions;

import com.demo.guru99.Models.DatosAcceso;
import com.demo.guru99.Steps.LoginStep;
import com.demo.guru99.Steps.PaginaPrincipalStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class LoginStepDefinition {

    @Steps
    LoginStep loginStep;
    @Steps
    PaginaPrincipalStep paginaPrincipalStep;


    @Dado("^el usuario este en pagina web$")
    public void elUsuarioEsteEnPaginaWeb() {
        loginStep.abrirNavegador();


    }

    @Cuando("^el usuario ingrese las credenciales$")
    public void el_usuario_ingrese_las_credenciales(List<DatosAcceso>lista) {
        loginStep.escribirUsuario(lista.get(0).getUsuario());
        loginStep.escribirClave(lista.get(0).getClave());
        loginStep.clicIngresar();

    }


    @Entonces("^el usuario visualizara la pagina de inicio$")
    public void elUsuarioVisualizaraLaPaginaDeInicio() {
        paginaPrincipalStep.validarMensaje();



    }

    @Cuando("^el usuario ingrese las credenciales incorrectas$")
    public void elUsuarioIngreseLasCredencialesIncorrectas(List<DatosAcceso>lista) {
        loginStep.abrirNavegador();
        loginStep.escribirUsuario(lista.get(0).getUsuario());
        loginStep.escribirClave(lista.get(0).getClave());
        loginStep.clicIngresar();



    }


    @Entonces("^el visualizara que no puede iniciar sesion$")
    public void elVisualizaraQueNoPuedeIniciarSesion() {

    }



}
