package com.dryganets.auth;

public interface Authenticator {
    AuthToken login(String username, String password);
}
