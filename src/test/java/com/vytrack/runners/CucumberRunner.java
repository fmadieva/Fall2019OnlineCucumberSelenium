package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/vytrack/step_definitions",
        features = "src/test/resources/features",
        dryRun = false,
        strict = false,
        tags = "@activities",
        plugin = {
                "html:target/default-report",
                "json:target/cucumber.json"
        }

)
public class CucumberRunner {


}


// //@RunWith => comes from Junit. It allows to have custom test configuration
////cucumber has it's own flow to run test - during runtime turns into executable test
////@CucumberOptions => stands for parameterization for test execution
// 2 mandatory options for CucumberOptions: glue and features:
////glue => trigger of cucumber test. Runner class needs to know where are step definition and feature file
////path to step definition, right click on step_definitions - copy from source root
////features => specifies path to the feature files right click on features - copy from content root




//our framework creates json file, some plugin takes jason file and generates a nice HTML report
//json looks like plain text, has "properties,values" , arrays,Strings,integers,
//json object vs java object
//json object has only properties no method; java object has both properties and methods
//We add json plugin => "json:target/cucumber.json" => to let it generate by our framework