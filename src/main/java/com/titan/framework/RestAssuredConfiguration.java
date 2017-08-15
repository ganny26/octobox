package com.titan.framework;

import io.restassured.RestAssured;

import org.testng.annotations.BeforeSuite;


/**
 * Created by serajam on 8/15/2017.
 */
public class RestAssuredConfiguration {

    @BeforeSuite(alwaysRun = true)
    public void config(){
        RestAssured.baseURI = "https://api.github.com/";
    }

}
