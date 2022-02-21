package co.com.certification.utest.stepdefinitions;

import co.com.certification.utest.model.UserData;
import co.com.certification.utest.questions.Answer;
import co.com.certification.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class CertificationStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Luis will register on the Utest page$")
    public void luisWillRegisterOnTheUtestPage() {
        OnStage.theActorCalled("Luis").attemptsTo(OpenUp.thePage());

    }
    @When("^He completes the form on the page$")
    public void heCompletesTheFormOnThePage(List<UserData> userData) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                RegisterUserPage.withData(userData.get(0)),
                RegisterAddress.withData(userData.get(0)),
                RegisterDevice.withData(userData.get(0)),
                CreatePassword.withData(userData.get(0))
        );
    }
    @Then("^He verifies the record with the message (.*)$")
    public void HeVerifiesTheRecordWithTheMessage(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(message)));
    }
}
