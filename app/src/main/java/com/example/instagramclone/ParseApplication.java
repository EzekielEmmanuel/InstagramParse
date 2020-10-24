package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        //Register your parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("VU0rg8LnKmHgyfoKUd0fAYk4Si4eP5J5xA4iK7SB")
                .clientKey("gixB9X352450voVIQkRLMhrt2uj6WfSDcFtu66iK")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }

}
