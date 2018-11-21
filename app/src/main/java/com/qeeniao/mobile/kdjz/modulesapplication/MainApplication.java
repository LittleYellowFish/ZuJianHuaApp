package com.qeeniao.mobile.kdjz.modulesapplication;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import com.alibaba.android.arouter.launcher.ARouter;
import com.github.mzule.activityrouter.annotation.Modules;
import com.github.mzule.activityrouter.router.RouterCallback;
import com.github.mzule.activityrouter.router.RouterCallbackProvider;
import com.github.mzule.activityrouter.router.SimpleRouterCallback;
import com.qeeniao.mobile.kdjz.basemodule.BaseApplication;

/**
 * @auther leyu
 * @date 2018/11/20 17:05
 * @desc
 */
@Modules({"app","search"})
public class MainApplication extends BaseApplication implements RouterCallbackProvider {
    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(application);
    }

    @Override
    public RouterCallback provideRouterCallback() {
        return new SimpleRouterCallback() {
            @Override
            public boolean beforeOpen(Context context, Uri uri) {
//                if (uri.toString().startsWith("mzule://")) {
//                    context.startActivity(new Intent(context, MainActivity.class));
//                    return true;
//                }
                return false;
            }

            @Override
            public void notFound(Context context, Uri uri) {
                context.startActivity(new Intent(context, NotFoundActivity.class));
            }

            @Override
            public void error(Context context, Uri uri, Throwable e) {
                context.startActivity(ErrorStackActivity.makeIntent(context, uri, e));
            }
        };
    }
}
