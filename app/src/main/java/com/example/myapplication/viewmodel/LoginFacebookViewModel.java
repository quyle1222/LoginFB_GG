package com.example.myapplication.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.myapplication.facebookuserModel.FacebookUser;

import org.jetbrains.annotations.NotNull;

public class LoginFacebookViewModel extends AndroidViewModel {
    private FacebookUser user;

    public LoginFacebookViewModel(@NonNull @NotNull Application application) {
        super(application);
    }

    public FacebookUser getUser() {
        return user;
    }

    public void setUser(FacebookUser user) {
        this.user = user;
    }
}
