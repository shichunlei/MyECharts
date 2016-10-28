package com.chingtech.echarts.activity;

import android.os.Bundle;
import android.webkit.WebView;

import com.chingtech.echarts.R;
import com.chingtech.echarts.base.BaseActivity;

/**
 * 柱状图 某地区蒸发量和降水量
 *
 * Created by leo on 2016/10/28.
 */
public class BarChartActivity extends BaseActivity{

    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart);

        webview = (WebView) findViewById(R.id.webview);

        webview.getSettings().setAllowFileAccess(true);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("file:///android_asset/echarts/myechart1.html");
        webview.loadUrl("javascript:createBarChart();");
    }
}
