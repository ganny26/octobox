package com.titan.framework;

import io.restassured.RestAssured;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;


import static io.restassured.RestAssured.given;


/**
 * Created by serajam on 8/15/2017.
 */
public class RestAssuredConfiguration {

    @BeforeSuite(alwaysRun = true)
    public void config(){
        RestAssured.baseURI = "https://api.github.com/";
    }


    public RequestSpecification getRequestSpecification(){
        return given().contentType(ContentType.JSON);
    }


    public Response getResponse(RequestSpecification requestSpecification,String endpoint, int status){
        Response response = requestSpecification.get(endpoint);
        Assert.assertEquals(response.getStatusCode(),status);
        response.then().log().all();
        return response;
    }


}
