package com.qeeniao.mobile.kdjz.search;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.github.mzule.activityrouter.annotation.Router;
import com.qeeniao.mobile.kdjz.basemodule.BaseApplication;

/**
 * @auther leyu
 * @date 2018/11/20 15:42
 * @desc
 */
//@Router("search")
@Route(path = "/search/MainActivity")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_activity_main);

//        Context context=BaseApplication.application;
    }
}
