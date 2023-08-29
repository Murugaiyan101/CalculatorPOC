package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

    public WebDriver driver;
    public Home(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//label[normalize-space(.)='Single']")
    private WebElement single;

    @FindBy(xpath = "//select[@title='Number of dependants']")
    private WebElement dependants;

    @FindBy(xpath = "//label[normalize-space(.)='Home to live in']")
    private WebElement homeToLive;

    @FindBy(xpath = "//label[text()='Your annual income (before tax)']//parent::div//div//child::input")
    private WebElement annualIncome;

    @FindBy(xpath = "//label[text()='Your annual other income (optional)']//parent::div//div//child::input")
    private WebElement otherIncomex;

    @FindBy(xpath = "//input[@id='expenses']")
    private WebElement livingExpenses;

    @FindBy(xpath = "//input[@id='homeloans']")
    private WebElement homeLoans;

    @FindBy(xpath = "//input[@id='otherloans']")
    private WebElement otherLoans;

    @FindBy(xpath = "//label[.='Other monthly commitments']//following-sibling::div//input")
    private WebElement otherMonthlyCommitments;

    @FindBy(xpath = "//label[.='Total credit card limits']//following-sibling::div//input")
    private WebElement totalCreditCardLimits;

    public WebElement getSingle() {
        return single;
    }

    public WebElement getDependants() {
        return dependants;
    }

    public WebElement getHomeToLive() {
        return homeToLive;
    }

    public WebElement getAnnualIncome() {
        return annualIncome;
    }

    public WebElement getOtherIncomex() {
        return otherIncomex;
    }

    public WebElement getLivingExpenses() {
        return livingExpenses;
    }

    public WebElement getHomeLoans() {
        return homeLoans;
    }

    public WebElement getOtherLoans() {
        return otherLoans;
    }

    public WebElement getOtherMonthlyCommitments() {
        return otherMonthlyCommitments;
    }

    public WebElement getTotalCreditCardLimits() {
        return totalCreditCardLimits;
    }

    public WebElement getCalculatorBtn() {
        return calculatorBtn;
    }

    public WebElement getBorrowResult() {
        return borrowResult;
    }

    public WebElement getStartOver() {
        return startOver;
    }

    @FindBy(xpath = "//button[@id='btnBorrowCalculater']")
    private WebElement calculatorBtn;

    @FindBy(xpath = "//span[@id='borrowResultTextAmount']")
    private WebElement borrowResult;

    @FindBy(xpath = "//button[@aria-label='Start over']")
    private WebElement startOver;
}
