package com.titan.endpoints;

/**
 * Created by serajam on 8/15/2017.
 */
public class APIEndPoints {
    public static String AUTH_TOKEN = "d81702d168798249c14532affbe8cda98206b7d9";
    public static String GET_GITHUB_USERS = "user?access_token="+AUTH_TOKEN;
    public static String GET_GITHUB_FOLLOWERS= "user/followers?access_token="+AUTH_TOKEN;
    public static String GET_GITHUB_FOLLOWING = "user/following?access_token="+AUTH_TOKEN;
}
