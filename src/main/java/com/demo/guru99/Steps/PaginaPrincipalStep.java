package com.demo.guru99.Steps;

import com.demo.guru99.PageObjects.PaginaPrincipalPageObject;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class PaginaPrincipalStep {

    PaginaPrincipalPageObject paginaPrincipalPageObject = new PaginaPrincipalPageObject();

    @Step
    public void validarMensaje (){
        Assert.assertThat(paginaPrincipalPageObject.getDriver()
                .findElement(paginaPrincipalPageObject.getMsjValidacion()).isDisplayed(), Matchers.is(true));
    }
}
