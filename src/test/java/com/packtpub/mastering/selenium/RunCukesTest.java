package com.packtpub.mastering.selenium;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Ripon on 11/26/2015.
 */
@RunWith(Cucumber.class)
@CucumberOptions (plugin = {"pretty", "html:target/cucumber-htmlreport","json:target/cucumber-report.json"})

public class RunCukesTest {
}