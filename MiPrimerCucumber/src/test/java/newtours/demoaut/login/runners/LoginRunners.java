package newtours.demoaut.login.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
@RunWith (Cucumber.class)
@CucumberOptions(features="src/test/resources/com/newtours/demoaut/login/com.newtours.demoaut.login.feature", glue="newtour.demoaut.login.stepdefinition", snippets=SnippetType.CAMELCASE)
public class LoginRunners {

}
