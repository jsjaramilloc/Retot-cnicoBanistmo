package pa.com.banistmo.certificacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import pa.com.banistmo.certificacion.userinterface.SearchServiceUserinterface;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class Search implements Task
{
    public static Search the()
    {
        return Tasks.instrumented(Search.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
                WaitUntil.the(SearchServiceUserinterface.SELECT_SERVICES,isClickable()).forNoMoreThan(10).seconds(),
                Click.on(SearchServiceUserinterface.SELECT_SERVICES),
                Click.on(SearchServiceUserinterface.SELECT_INFORMATION),
                Click.on(SearchServiceUserinterface.SELECT_LOST_ITEMS),
                Click.on(SearchServiceUserinterface.OPEN_LOST_ITEMS_PDF)
        );
    }
}
