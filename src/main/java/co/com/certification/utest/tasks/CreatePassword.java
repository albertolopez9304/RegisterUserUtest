package co.com.certification.utest.tasks;

import co.com.certification.utest.model.UserData;
import co.com.certification.utest.userinterface.CreatePasswordPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CreatePassword implements Task {

    private final UserData userData;

    public CreatePassword(UserData userData) {
        this.userData = userData;
    }

    public static CreatePassword withData(UserData userData) {
        return Tasks.instrumented(CreatePassword.class, userData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(userData.getPassword()).into(CreatePasswordPage.CREATEPASSWORD),
                Enter.theValue(userData.getPassword()).into(CreatePasswordPage.CONFIRMPASSWORD),
                Click.on(CreatePasswordPage.TERMO_OF_USE_UTEST),
                Click.on(CreatePasswordPage.TERMO_OF_PRIVACY),
                Click.on(CreatePasswordPage.COMPLETE_SETUP)
        );

    }
}
