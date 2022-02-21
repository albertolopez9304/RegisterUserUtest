package co.com.certification.utest.tasks;

import co.com.certification.utest.model.UserData;
import co.com.certification.utest.userinterface.RegisterAddressPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.type.Type;
import org.openqa.selenium.Keys;


public class RegisterAddress implements Task {

    private final UserData userData;

    public RegisterAddress(UserData userData) {
        this.userData = userData;
    }

    public static RegisterAddress withData(UserData userData) {
        return Tasks.instrumented(RegisterAddress.class, userData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(userData.getCity()).into(RegisterAddressPage.CITY),
                Hit.the(Keys.ARROW_DOWN, Keys.ENTER).into(RegisterAddressPage.CITY),
                Enter.theValue(userData.getPostalCode()).into(RegisterAddressPage.POSTAL_CODE),
                Click.on(RegisterAddressPage.COUNTRY),
                Type.theValue(userData.getCountry()).into(RegisterAddressPage.ENTER_COUNTRY).thenHit(Keys.ENTER),
                Click.on(RegisterAddressPage.NEXT_DEVICES)
        );


    }
}
