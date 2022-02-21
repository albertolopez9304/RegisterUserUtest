package co.com.certification.utest.tasks;

import co.com.certification.utest.model.UserData;
import co.com.certification.utest.userinterface.PageBasicData;
import co.com.certification.utest.userinterface.UtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class RegisterUserPage implements Task {

    private final UserData userData;

    public RegisterUserPage(UserData userData) {
        this.userData = userData;
    }

    public static RegisterUserPage withData(UserData userData) {
        return Tasks.instrumented(RegisterUserPage.class, userData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestPage.JOIN_TODAY),
                Enter.theValue(userData.getFirtsName()).into(PageBasicData.FIRST_NAME),
                Enter.theValue(userData.getLastName()).into(PageBasicData.LAST_NAME),
                Enter.theValue(userData.getEmail()).into(PageBasicData.EMAIL),
                SelectFromOptions.byVisibleText(userData.getMonth()).from(PageBasicData.MONTH),
                SelectFromOptions.byVisibleText(userData.getDay()).from(PageBasicData.DAY),
                SelectFromOptions.byVisibleText(userData.getYear()).from(PageBasicData.YEAR),
                Click.on(PageBasicData.NEXT_LOCATION)
        );
    }
}
