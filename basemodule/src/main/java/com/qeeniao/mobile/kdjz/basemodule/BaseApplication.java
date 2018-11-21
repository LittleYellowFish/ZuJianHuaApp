package com.qeeniao.mobile.kdjz.basemodule;

import android.app.Application;

/**
 * @auther leyu
 * @date 2018/11/20 16:28
 * @desc
 */

public class BaseApplication extends Application {
    public static BaseApplication application;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;

        //todo 初始化，比如第三方库的初始化
    }
}
