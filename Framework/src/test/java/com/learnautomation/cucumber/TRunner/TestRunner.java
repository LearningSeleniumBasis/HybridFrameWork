package com.learnautomation.cucumber.TRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features", glue="com.learnautomation.cucumber", plugin= "html:Reports/cucumber-html-report")
public class TestRunner {

}
