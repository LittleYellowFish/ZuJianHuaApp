package com.qeeniao.mobile.kdjz.modulesapplication;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * @auther leyu
 * @date 2018/11/20 17:25
 * @desc
 */

public class ErrorStackActivity extends AppCompatActivity {
    public static Intent makeIntent(Context context, Uri uri, Throwable e) {
        Intent intent = new Intent(context, ErrorStackActivity.class);
        intent.putExtra("uri", uri);
        intent.putExtra("error", e);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Throwable e = (Throwable) getIntent().getSerializableExtra("error");
        Uri uri = getIntent().getParcelableExtra("uri");

        TextView textView = new TextView(this);
        textView.setText(String.format("Error on open uri %s\n", uri));
        textView.append(Log.getStackTraceString(e));
        textView.setGravity(Gravity.START);
        setContentView(textView, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
    }
}
