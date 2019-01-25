package com.dryganets.auth;

public class App1Authenticator implements Authenticator {

    private static final String VALID_USERNAME = "app1";
    private static final String VALID_PASSWORD = "app1";

    public AuthToken login(String username, String password) {
        if (VALID_USERNAME.equals(username) && VALID_PASSWORD.equals(password)) {

            return new AuthToken("app1-token");
        }

        return null;
    }
}
