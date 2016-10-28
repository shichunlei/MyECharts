package com.chingtech.echarts.activity;

import android.os.Bundle;
import android.webkit.WebView;

import com.chingtech.echarts.R;
import com.chingtech.echarts.base.BaseActivity;

/**
 * 雷达图
 *
 * Created by leo on 2016/10/28.
 */
public class RadarChartActivity extends BaseActivity{

    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radar_chart);

        webview = (WebView) findViewById(R.id.webview);

        webview.getSettings().setAllowFileAccess(true);
        webview.getSettings().setJavaScriptEnabled(true);
//        webview.loadUrl("file:///android_asset/echarts/radar_chart.html");
        webview.loadUrl("file:///android_asset/echarts/custom_radar_chart.html");
        webview.loadUrl("javascript:createRadarChart();");
    }
}
