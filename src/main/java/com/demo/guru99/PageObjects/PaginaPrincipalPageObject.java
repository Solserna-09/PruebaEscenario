package com.demo.guru99.PageObjects;

import org.openqa.selenium.By;

public class PaginaPrincipalPageObject extends LoginPageObject{

    By msjValidacion = By.xpath("//h3[text()='Login Successfully']");

    public By getMsjValidacion() {
        return msjValidacion;
    }
}
