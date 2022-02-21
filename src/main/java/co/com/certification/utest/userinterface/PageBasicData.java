package co.com.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageBasicData {
    public static final Target FIRST_NAME = Target.the("Enter firstname").located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("Enter lastname").located(By.id("lastName"));
    public static final Target EMAIL = Target.the("Enter email").located(By.id("email"));
    public static final Target MONTH = Target.the("select Month").located(By.id("birthMonth"));
    public static final Target DAY = Target.the("select day").located(By.id("birthDay"));
    public static final Target YEAR = Target.the("select year").located(By.id("birthYear"));
    public static final Target NEXT_LOCATION = Target.the("Click next location")
                        .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
}
