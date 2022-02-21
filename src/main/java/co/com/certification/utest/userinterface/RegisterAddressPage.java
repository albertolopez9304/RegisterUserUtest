package co.com.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterAddressPage {
    public static final Target CITY = Target.the("Enter City").located(By.id("city"));
    public static final Target POSTAL_CODE = Target.the("Enter PostalCode").located(By.id("zip"));
    public static final Target COUNTRY = Target.the("Enter PostalCode").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));
    public static final Target ENTER_COUNTRY = Target.the("Enter PostalCode").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target NEXT_DEVICES = Target.the("Enter NextDevice").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));
}
