package org.swag.stepdefinition;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//resources//Feature",
glue = "org.swag.stepdefinition",
plugin = {"html:target","json:target/cucumber.json"},
tags = "@Sai")


public class TestRunner {

}