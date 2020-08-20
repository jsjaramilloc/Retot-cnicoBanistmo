package pa.com.banistmo.certificacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/tocumen_airport.feature",
        tags = "@tag1",
        glue = "pa.com.banistmo.certificacion.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags
{

}
