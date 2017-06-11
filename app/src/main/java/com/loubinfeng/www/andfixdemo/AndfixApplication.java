package com.loubinfeng.www.andfixdemo;

import android.app.Application;

import com.loubinfeng.www.andfixdemo.andfix.AndFixManager;

/**
 * Created by loubinfeng on 2017/6/10.
 */

public class AndfixApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initAndfix();
    }

    /**
     * init andfix
     */
    private void initAndfix(){
        AndFixManager.getAndFixManager().initAndFix(this);
    }
}
