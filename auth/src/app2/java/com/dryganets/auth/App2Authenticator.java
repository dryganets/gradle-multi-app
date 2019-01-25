package com.dryganets.auth;

public class App2Authenticator implements Authenticator {

    private static final String VALID_USERNAME = "app2";
    private static final String VALID_PASSWORD = "app2";

    public AuthToken login(String username, String password) {
        if (VALID_USERNAME.equals(username) && VALID_PASSWORD.equals(password)) {
            return new AuthToken("app2-token");
        }

        return null;
    }
}