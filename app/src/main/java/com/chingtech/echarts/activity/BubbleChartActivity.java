package com.chingtech.echarts.activity;

import android.os.Bundle;
import android.webkit.WebView;

import com.chingtech.echarts.R;
import com.chingtech.echarts.base.BaseActivity;

/**
 * 气泡图 1990与2015年各个国家人均寿命与GDP
 *
 * Created by leo on 2016/10/28.
 */
public class BubbleChartActivity extends BaseActivity{

    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bubble_chart);

        webview = (WebView) findViewById(R.id.webview);

        webview.getSettings().setAllowFileAccess(true);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("file:///android_asset/echarts/myechart2.html");
        webview.loadUrl("javascript:createBubbleChart();");
    }
}
