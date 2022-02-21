package co.com.certification.utest.tasks;

import co.com.certification.utest.model.UserData;
import co.com.certification.utest.userinterface.RegisterDevicePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;
import org.openqa.selenium.Keys;

public class RegisterDevice implements Task {

    private final UserData userData;

    public RegisterDevice(UserData userData) {
        this.userData = userData;
    }

    public static RegisterDevice withData(UserData userData){
        return Tasks.instrumented(RegisterDevice.class, userData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RegisterDevicePage.COMPUTER),
                Type.theValue(userData.getComputer()).into(RegisterDevicePage.SELECT_COMPUTER).thenHit(Keys.ENTER),
                Click.on(RegisterDevicePage.VERSION),
                Type.theValue(userData.getVersion()).into(RegisterDevicePage.SELECT_VERSION).thenHit(Keys.ENTER),
                Click.on(RegisterDevicePage.LANGUAGE),
                Type.theValue(userData.getLanguage()).into(RegisterDevicePage.SELECT_LANGUAGE).thenHit(Keys.ENTER),
                Click.on(RegisterDevicePage.MOBILE),
                Type.theValue(userData.getMobile()).into(RegisterDevicePage.SELECT_MOBILE).thenHit(Keys.ENTER),
                Click.on(RegisterDevicePage.MODEL),
                Type.theValue(userData.getModelMobile()).into(RegisterDevicePage.SELECT_MODEL).thenHit(Keys.ENTER),
                Click.on(RegisterDevicePage.SYSTEM),
                Type.theValue(userData.getOperatingSystem()).into(RegisterDevicePage.SELECT_SYSTEM).thenHit(Keys.ENTER),
                Click.on(RegisterDevicePage.LAST_STEP)
        );

    }
}
