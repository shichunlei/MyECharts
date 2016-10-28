package com.chingtech.echarts.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.io.Serializable;

/**
 * Created by leo on 2016/10/28.
 */
public class BaseActivity extends AppCompatActivity {
    /** 上下文 */
    public Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    /**
     * 接收前一个页面传递的String值
     *
     * @param key
     * @return
     */
    public String getStringExtra(String key) {
        Intent receive = getIntent();
        String flag = "";

        flag = receive.getStringExtra(key);

        return flag;
    }

    /**
     * 接收前一个页面传递的Integer值
     *
     * @param key
     * @return
     */
    public Integer getIntExtra(String key) {
        Intent receive = getIntent();
        int flag = 0;

        flag = receive.getIntExtra(key, 0);

        return flag;
    }

    /**
     * 接收前一个页面传递的Boolean值
     *
     * @param key
     * @return
     */
    public boolean getBooleanExtra(String key) {
        Intent receive = getIntent();
        boolean flag = false;

        flag = receive.getBooleanExtra(key, false);

        return flag;
    }

    /**
     * 接收前一个页面传递的Float值
     *
     * @param key
     * @return
     */
    public Float getFloatExtra(String key) {
        Intent receive = getIntent();
        Float flag = 0f;

        flag = receive.getFloatExtra(key, 0f);

        return flag;
    }

    /**
     * 接收前一个页面传递的Long值
     *
     * @param key
     * @return
     */
    public Long getLongExtra(String key) {
        Intent receive = getIntent();
        Long flag = 0L;

        flag = receive.getLongExtra(key, 0L);

        return flag;
    }

    /**
     * 接收前一个页面传递的Double值
     *
     * @param key
     * @return
     */
    public Double getDoubleExtra(String key) {
        Intent receive = getIntent();
        Double flag = 0.0;

        flag = receive.getDoubleExtra(key, 0.0);

        return flag;
    }

    /**
     * 通过类名启动Activity，是否结束本页面
     *
     * @param pClass
     * @param i
     */
    public void openActivity(Class<?> pClass, int i) {
        showActivity(pClass, null, null, null, false, i);
    }

    /**
     * 通过类名启动Activity，是否结束本页面
     *
     * @param pClass
     * @param isfinish
     */
    public void openActivity(Class<?> pClass, boolean isfinish) {
        showActivity(pClass, null, null, null, isfinish, 0);
    }

    /**
     * 通过类名启动Activity，并且携带数据
     *
     * @param pClass
     * @param key
     * @param value
     */
    public void openActivity(Class<?> pClass, String key, Serializable value) {
        showActivity(pClass, null, key, value, false, 0);
    }

    /**
     * 通过类名启动Activity，并且携带单个数据
     *
     * @param pClass
     * @param key
     * @param value
     * @param isfinish
     */
    public void openActivity(Class<?> pClass, String key, Serializable value, boolean isfinish) {
        showActivity(pClass, null, key, value, isfinish, 0);
    }

    /**
     * 通过类名启动Activity，并且携带单个数据
     *
     * @param pClass
     * @param key
     * @param value
     * @param i
     */
    public void openActivity(Class<?> pClass, String key, Serializable value, int i) {
        showActivity(pClass, null, key, value, false, i);
    }

    /**
     * 通过类名启动Activity，并且含有Bundle数据
     *
     * @param pClass
     * @param pBundle
     * @param isfinish
     */
    public void openActivity(Class<?> pClass, Bundle pBundle, boolean isfinish) {
        showActivity(pClass, pBundle, null, null, isfinish, 0);
    }

    /**
     * 通过类名启动Activity，并且含有Bundle数据
     *
     * @param pClass
     * @param pBundle
     * @param i
     */
    public void openActivity(Class<?> pClass, Bundle pBundle, int i) {
        showActivity(pClass, pBundle, null, null, false, i);
    }

    public void showActivity(Class<?> pClass, Bundle bundle, String key, Serializable value,
                             boolean isfinish, int i) {

        Intent intent = new Intent(context, pClass);

        if (null != key) {
            intent.putExtra(key, value);
        }

        if (null != bundle) {
            intent.putExtras(bundle);
        }

        if (i == 0) {
            startActivity(intent);
        } else {
            startActivityForResult(intent, i);
        }

        if (isfinish) {
            this.finish();
        }
    }

    /**
     * Toast提示
     *
     * @param text
     */
    public void showToast(String text) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }

    /**
     * Toast提示
     *
     * @param resid
     */
    public void showToast(int resid) {
        Toast.makeText(context, getString(resid), Toast.LENGTH_SHORT).show();
    }
}
