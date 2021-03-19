package com.lab.java;

import java.util.HashMap;

public class WebAppPremium extends WebApp{
    public HashMap<String, Integer> userStatus;

    public void checkGrants(String token){
        String userToken = getAuthToken();
        System.out.println(String.format("User %s is a %s user", userToken, userStatus.get(userToken)==0 ? "regular" : "regular"));
    }
}