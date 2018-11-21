package com.qeeniao.mobile.kdjz.modulesapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.github.mzule.activityrouter.router.Routers;

/**
 * @auther leyu
 * @date 2018/11/20 17:07
 * @desc
 */

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Routers.open(MainActivity.this,"like://search");
                ARouter.getInstance().build("/search/MainActivity").navigation();

            }
        });
    }
}
