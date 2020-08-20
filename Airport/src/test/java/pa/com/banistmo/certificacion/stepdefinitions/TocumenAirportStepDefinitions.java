package pa.com.banistmo.certificacion.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import pa.com.banistmo.certificacion.questions.Answer;
import pa.com.banistmo.certificacion.tasks.OpenUp;
import pa.com.banistmo.certificacion.tasks.Search;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class TocumenAirportStepDefinitions
{
    @Before
    public void setStage()
    {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Joseline");
    }
    @Given("^than Joseline wants to search a lost item$")
    public void thanJoselineWantsToSearchALostItem()
    {
        theActorInTheSpotlight().attemptsTo(OpenUp.thePage());
    }

    @When("^she search the menu Services$")
    public void sheSearchTheMenuServices()
    {
        theActorInTheSpotlight().attemptsTo(Search.the());
    }

    @Then("^she finds the document (.*)$")
    public void sheFindsTheDocumentPolíticasDeObjetosExtraviados(String question)
    {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}
