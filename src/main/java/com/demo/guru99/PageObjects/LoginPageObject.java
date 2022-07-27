package com.demo.guru99.PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://demo.guru99.com/test/newtours/")
public class LoginPageObject extends PageObject {

    By txtUsuario = By.name("userName");
    By txtClave = By.name("password");
    By btnIngresar = By.name("submit");


    public By getTxtUsuario() {
        return txtUsuario;
    }

    public By getTxtClave() {
        return txtClave;
    }

    public By getBtnIngresar() {
        return btnIngresar;
    }
}
