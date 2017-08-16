package com.titan.test;

import com.titan.endpoints.APIEndPoints;
import com.titan.framework.RestAssuredConfiguration;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

/**
 * Created by serajam on 8/15/2017.
 */
public class GitHubAPITest {



    @Test(groups = "Github")
    public void validateLogin(){
        RequestSpecification requestSpecification = new RestAssuredConfiguration().getRequestSpecification();
       // given().spec(requestSpecification).get(APIEndPoints.GET_GITHUB_USERS).then().statusCode(200).log().all();
        Response response =  given().spec(requestSpecification).get(APIEndPoints.GET_GITHUB_USERS);
        Assert.assertEquals(response.path("login"),"ganny26");
        Assert.assertEquals(response.path("name"),"Selvaganesh");
    }

    @Test(groups = "Github")
    public void validateUser(){
        RequestSpecification requestSpecification = new RestAssuredConfiguration().getRequestSpecification();
        Response response =  given().spec(requestSpecification).get(APIEndPoints.GET_GITHUB_USERS);
        Assert.assertEquals(response.path("login"),"ganny26");

    }

    @Test(groups = "Github")
    public void validateName(){
        RequestSpecification requestSpecification = new RestAssuredConfiguration().getRequestSpecification();
        Response response =  given().spec(requestSpecification).get(APIEndPoints.GET_GITHUB_USERS);
        Assert.assertEquals(response.path("name"),"Selvaganesh");
    }

    @Test(groups = "Github")
    public void validateEmail(){
        RequestSpecification requestSpecification = new RestAssuredConfiguration().getRequestSpecification();
        Response response =  given().spec(requestSpecification).get(APIEndPoints.GET_GITHUB_USERS);
        Assert.assertEquals(response.path("email"),"selvaganeshrajam@gmail.com");
    }

    @Test(groups = "Github")
    public void validateBlog(){
        RequestSpecification requestSpecification = new RestAssuredConfiguration().getRequestSpecification();
        // given().spec(requestSpecification).get(APIEndPoints.GET_GITHUB_USERS).then().statusCode(200).log().all();
        Response response =  given().spec(requestSpecification).get(APIEndPoints.GET_GITHUB_USERS);
        Assert.assertEquals(response.path("blog"),"Bengaluru");
    }

    @Test(groups = "Github")
    public void validateLocation(){
        RequestSpecification requestSpecification = new RestAssuredConfiguration().getRequestSpecification();
        // given().spec(requestSpecification).get(APIEndPoints.GET_GITHUB_USERS).then().statusCode(200).log().all();
        Response response =  given().spec(requestSpecification).get(APIEndPoints.GET_GITHUB_USERS);
        Assert.assertEquals(response.path("location"),"https://serajam.herokuapp.com");
    }



}
