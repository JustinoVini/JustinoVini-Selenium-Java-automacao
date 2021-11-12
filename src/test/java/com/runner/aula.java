package com.runner;

import org.junit.FixMethodOrder;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@CucumberOptions(
    features = {"datafile/aula01/aula.feature"},
    glue = "steps/",
    monochrome = true
)
public class aula {
    
}
