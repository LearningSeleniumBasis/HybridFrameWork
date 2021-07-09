package com.learnautomation.cucumber.TRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features", glue="com.learnautomation.cucumber", plugin= "html:Reports/cucumber-html-report", tags="@SmokeTest",
                 monochrome=true,
                 strict=true) /* features takes the path of the Feature files
                                 glue takes the file path where our step definition are written
                                 format= {"pretty", "html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"} to generate different types of reporting
                                 monochrome=true display the console output in proper readable format
                                 strict= true will run the feature but it checks if any step is not defined in step def file
                                 dryRun= true will not run the feature but will check that the mapping between feature file and step defination file are correct
                                                                                                     */
public class TestRunner {

}
