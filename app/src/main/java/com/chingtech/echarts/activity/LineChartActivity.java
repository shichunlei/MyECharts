package com.chingtech.echarts.activity;

import android.os.Bundle;
import android.webkit.WebView;

import com.chingtech.echarts.R;
import com.chingtech.echarts.base.BaseActivity;

/**
 * 折线图 雨量流量关系图
 *
 * Created by leo on 2016/10/28.
 */
public class LineChartActivity extends BaseActivity{

    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_chart);

        webview = (WebView) findViewById(R.id.webview);

        webview.getSettings().setAllowFileAccess(true);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("file:///android_asset/echarts/line_chart.html");
        webview.loadUrl("javascript:createLineChart();");
    }
}
