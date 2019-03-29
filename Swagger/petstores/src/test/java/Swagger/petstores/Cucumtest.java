package Swagger.petstores;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Resources",glue="StepDefinition")
public class Cucumtest {

}
