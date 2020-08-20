package pa.com.banistmo.certificacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import pa.com.banistmo.certificacion.userinterface.TocumenWebUserinterface;

public class OpenUp implements Task
{
    private TocumenWebUserinterface TocumenWebUserinterface;

    public static OpenUp thePage()
    {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(Open.browserOn(TocumenWebUserinterface));
    }
}
