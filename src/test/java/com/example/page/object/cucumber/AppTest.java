package com.example.page.object.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "json:target/cucumber.json"}) //@CucumberOptions(plugin = {"pretty", "html:target/cucumber"})

public class AppTest 
   
{
    
}
