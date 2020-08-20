package pa.com.banistmo.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pa.com.banistmo.certificacion.userinterface.SearchServiceUserinterface;

public class Answer implements Question<Boolean>
{
    public Answer(String question)
    {
        this.question = question;
    }

    private String question;
    public static Question<Boolean> toThe(String question)
    {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor)
    {
        boolean result;
        String confirmation = Text.of(SearchServiceUserinterface.CONFIRM_PDF).viewedBy(actor).asString();
        if (question.equals(confirmation))
        {
            result= true;
        }
        else
        {
            result = false;
        }
        return result;
    }
}
