package com.brite_erp.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions( plugin = {
        "json:target/cucumber.json",
        "html:target/default-cucumber-report"},
<<<<<<< HEAD
        features ="src/test/resources/discuss/",
        glue = "com/brite_erp/step_definitions/", dryRun = false)
=======
        features ="src/test/resources/discuss",
        glue = "com/brite_erp/step_definitions/", dryRun = false
        ,  tags = "@mina")

>>>>>>> master
public class DiscussRunner {

}

//test 6:53
