package com.brite_erp.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions( plugin = {
        "json:target/cucumber.json",
        "html:target/cucumber/"},
        features ="src/test/resources/discuss/discuss.feature",
        glue = "com/brite_erp/step_definitions/", dryRun = false)
public class DiscussRunner {

}