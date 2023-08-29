package org.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Calculator.feature",
        glue = "Steps",
        plugin = {"json:target/cucumber-report/cucumber.json"})
public class Runner {
    public static WebDriver driver;

    @BeforeClass
    public static void start(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
    }

    @AfterClass
    public static void end(){
        driver.quit();
    }
}
