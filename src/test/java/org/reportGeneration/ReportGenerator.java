package org.reportGeneration;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.util.Collections;

public class ReportGenerator {
    public static void main(String[] args) {
        generateReport();
    }

    public static void generateReport() {
        File reportOutputDirectory = new File("target/cucumber-html-report");
        File cucumberReportFile = new File("target/cucumber-report/cucumber.json");

        Configuration configuration = new Configuration(reportOutputDirectory, "Your Project Name");
        configuration.setBuildNumber("1");

        ReportBuilder reportBuilder = new ReportBuilder(Collections.singletonList(String.valueOf(cucumberReportFile)), configuration);
        reportBuilder.generateReports();
    }
}
