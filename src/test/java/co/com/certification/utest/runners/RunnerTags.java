package co.com.certification.utest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/certificationUtest.feature",
                              tags = "@stories",
                              glue = "co.com.certification.utest.stepdefinitions",
                              snippets = SnippetType.CAMELCASE)
public class RunnerTags {
}
