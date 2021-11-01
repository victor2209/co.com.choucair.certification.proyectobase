package co.com.choucair.certication.proyectobase.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/demo.feature",
        tags = "@ta1",
        glue = " co.com.choucair.certificacion.proyectobase.stepdefinitions",
        snippetType.CAMELCASE)

public class RunnerTags{
}
