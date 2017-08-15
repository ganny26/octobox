package com.titan.test;

import com.titan.endpoints.APIEndPoints;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

/**
 * Created by serajam on 8/15/2017.
 */
public class GitHubAPITest {



    @Test(groups = "Github")
    public void validateUser(){
        given().get(APIEndPoints.GET_GITHUB_USERS).then().statusCode(200).log().all();
    }

    @Test(groups = "Github")
    public void validateFollowers(){
        given().get(APIEndPoints.GET_GITHUB_FOLLOWERS).then().statusCode(200).log().all();
    }
}
