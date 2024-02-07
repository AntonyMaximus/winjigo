package com.winjigo.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "com.winjigo.stepdefinitions")
public class TestRunner {
    // Empty as JUnit will only reference the annotations
}
