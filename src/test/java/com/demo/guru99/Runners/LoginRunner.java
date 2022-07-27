package com.demo.guru99.Runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/login.feature",
                 tags = "@exitoso",
                 glue = "com.demo.guru99.StepDefinitions",
                  snippets = SnippetType.CAMELCASE

)
public class LoginRunner {

}
