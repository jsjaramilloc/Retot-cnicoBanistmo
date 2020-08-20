package pa.com.banistmo.certificacion.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchServiceUserinterface extends PageObject
{
    public static final Target SELECT_SERVICES = Target.the("Menu that contains the services of Tocumen Airport")
            .located(By.xpath("//a[contains(text(),'SERVICIOS')]"));
  public static final Target SELECT_INFORMATION = Target.the("Menu that contains the traveler information")
        .located(By.xpath("//a[contains(text(), 'Información del Viajero')]"));
  public static final Target SELECT_LOST_ITEMS= Target.the("Menu that contains the lost items information")
        .located(By.xpath("//a[@href='/index.php/servicios/informacion-del-viajero/objetos-extraviados']"));
    public static final Target OPEN_LOST_ITEMS_PDF= Target.the("")
            .located(By.xpath("//img[@src='/images/servicio-del-aereopuertos/pdf.jpg']"));
    public static final Target CONFIRM_PDF= Target.the("Confirmation of the LostItem PDF")
            .located(By.xpath("//embed[@src='http://www.tocumenpanama.aero/images/objetos-extraviados/politicas-objetos-extraviados.pdf']"));
}
