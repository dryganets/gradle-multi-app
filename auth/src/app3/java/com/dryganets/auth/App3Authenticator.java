package com.dryganets.auth;

public class App3Authenticator implements Authenticator {

    private static final String VALID_USERNAME = "app3";
    private static final String VALID_PASSWORD = "app3";

    public AuthToken login(String username, String password) {
        if (VALID_USERNAME.equals(username) && VALID_PASSWORD.equals(password)) {
            return new AuthToken("app3-token");
        }
        return null;
    }
}