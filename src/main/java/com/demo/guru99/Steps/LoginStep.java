package com.demo.guru99.Steps;

import com.demo.guru99.PageObjects.LoginPageObject;
import net.thucydides.core.annotations.Step;

public class LoginStep {

    LoginPageObject loginPageObject = new LoginPageObject();

    @Step
    public void abrirNavegador() {
        loginPageObject.open();

    }
    @Step
    public void escribirUsuario(String usuario){
        loginPageObject.getDriver().findElement(loginPageObject.getTxtUsuario()).sendKeys(usuario);

    }

    @Step
    public void escribirClave(String clave){
        loginPageObject.getDriver().findElement(loginPageObject.getTxtClave()).sendKeys(clave);
    }

    @Step
    public void clicIngresar (){
        loginPageObject.getDriver().findElement(loginPageObject.getBtnIngresar()).click();
    }


}

