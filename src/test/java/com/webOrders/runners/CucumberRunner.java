package com.webOrders.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/resources/features",
      glue="com/webOrders/step_definitions",
     tags = "@view_all_orders",
        dryRun=false


)


public class CucumberRunner {
}
