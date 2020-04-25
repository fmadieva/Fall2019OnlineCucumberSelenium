package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/vytrack/step_definitions",
        features = "@target/rerun.txt",
        plugin = {
                "html:target/failed-default-report",
                "json:target/failed_report.json",

        }
)


public class FailedRunner {
}


//instead of adding plugin, FailedRunner class generates list of failed scenarios
//tags are not needed, we have to run everything listed in feature file
//dryrun is not needed, steps are already implemented