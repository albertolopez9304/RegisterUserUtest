package co.com.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreatePasswordPage {
    public static final Target CREATEPASSWORD = Target.the("Create_Password").located(By.id("password"));
    public static final Target CONFIRMPASSWORD = Target.the("Confirm_Password").located(By.id("confirmPassword"));
    public static final Target TERMO_OF_USE_UTEST = Target.the("Termo_Of_Use").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target TERMO_OF_PRIVACY = Target.the("Termo_Of_Privacy").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target COMPLETE_SETUP = Target.the("Complete_Setup").located(By.id("laddaBtn"));
    public static final Target WELCOME = Target.the("Complete_Setup").located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));
}
