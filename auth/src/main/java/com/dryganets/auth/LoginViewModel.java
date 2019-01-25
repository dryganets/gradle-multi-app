package com.dryganets.auth;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.os.Handler;

public class LoginViewModel extends ViewModel {
    private AuthenticatorProvider authenticatorProvider;
    private MutableLiveData<AuthToken> token;

    public MutableLiveData<String> errorPassword = new MutableLiveData<>();
    public MutableLiveData<String> username = new MutableLiveData<>();
    public MutableLiveData<String> password = new MutableLiveData<>();
    public MutableLiveData<Boolean> busy = new MutableLiveData<>();

    public MutableLiveData<Boolean> getBusy() {
        return busy;
    }

    public MutableLiveData<AuthToken> getToken() {
        if (token == null) {
            token = new MutableLiveData<>();
        }
        return token;
    }

    public LoginViewModel() {
        authenticatorProvider = new AuthenticatorProvider();
    }

    public void onLoginClicked() {

        getBusy().setValue(true);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                AuthToken token = authenticatorProvider.get().login(username.getValue(), password.getValue());
                if (token != null) {
                    getToken().setValue(token);
                } else {
                    errorPassword.setValue("Username and Password don't match");
                }

                busy.setValue(false);
            }
        }, 3000);
    }

}
