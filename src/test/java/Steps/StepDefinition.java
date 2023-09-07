package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.base.Reusables;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.pages.Home;
import org.runner.Runner;

import java.io.IOException;

public class StepDefinition extends Reusables {
    public static WebDriver driver = Runner.driver;
    public static Home home = new Home(driver);

    @Given("Launch the Borrowing Calculator application")
    public void launch_the_borrowing_calculator_application() {
        maximize(driver);
        url(driver, "https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/");
    }

    @When("Click Application type as a single person")
    public void clickApplicationTypeAsASinglePerson() {
        implicitWait(driver, 15);
        click(home.getSingle());
    }

    @When("Select Dependants as {string}")
    public void select_dependants_as(String dependants) {
        implicitWait(driver, 15);
        selectText(home.getDependants(), dependants);
    }

    @When("Click Property you would like to buy as Home to live in")
    public void click_property_you_would_like_to_buy_as_home_to_live_in() {
        implicitWait(driver, 15);
        click(home.getHomeToLive());
    }


    @And("Enters ${string} in annual income field")
    public void enters_$_In_Annual_Income_Field(String annualIncome) {
        sendkeys(home.getAnnualIncome(), annualIncome);

        System.out.println(annualIncome);
    }

    @When("Enter ${string} in other income field")
    public void enter_$_in_other_income_field(String otherIncome) {
        sendkeys(home.getOtherIncomex(), otherIncome);
    }

    @When("Enter ${string} in other living expenses field")
    public void enter_$_in_other_living_expenses_field(String livingExpenses) {
        sendkeys(home.getLivingExpenses(), livingExpenses);
    }

    @When("Enter ${string} in current home loan repayments field")
    public void enter_$_in_current_home_loan_repayments_field(String homeLoans) {
        sendkeys(home.getHomeLoans(), homeLoans);
    }

    @When("Enter ${string} in other loan repayments field")
    public void enter_$_in_other_loan_repayments_field(String otherLoans) {
        sendkeys(home.getOtherLoans(), otherLoans);
    }

    @When("Enter ${string} in other monthly commitments field")
    public void enter_$_in_other_monthly_commitments_field(String monthlyCommitments) {
        sendkeys(home.getOtherMonthlyCommitments(), monthlyCommitments);
    }

    @When("Enter ${string} in total credit card limits field")
    public void enter_$_in_total_credit_card_limits_field(String creditLimit) throws IOException {
        sendkeys(home.getTotalCreditCardLimits(), creditLimit);
        taksScreenShot(driver,"Details entered");
    }

    @When("Click on the calculate button")
    public void click_on_the_calculate_button() {
        click(home.getCalculatorBtn());
    }

    @Then("Verify the borrowing estimate as ${string}")
    public void verify_the_borrowing_estimate_as_$(String expectedResult) throws InterruptedException, IOException {
        Thread.sleep(6000);
        String result = getElementText(home.getBorrowResult());
        String finalResult = result.replace("$", "");
        Assert.assertEquals(expectedResult, finalResult);
        taksScreenShot(driver,"Verified Result");

    }

    @Then("Click the start over button then the borrowing estimate value as ${string}")
    public void clickTheStartOverButtonThenTheBorrowingEstimateValueAs$(String estimateValue) throws IOException, InterruptedException {
        click(home.getStartOver());
        Thread.sleep(6000);
        String result = getElementText(home.getBorrowResult());
        String value = result.replace("$", "");
        Assert.assertEquals(estimateValue, value);
        taksScreenShot(driver,"Cleared image");

    }
}
