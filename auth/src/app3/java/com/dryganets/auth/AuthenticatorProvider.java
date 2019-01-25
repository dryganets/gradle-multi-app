package com.dryganets.auth;

import javax.inject.Provider;

public class AuthenticatorProvider implements Provider<Authenticator> {

    @Override
    public Authenticator get() {
        return new App3Authenticator();
    }
}
