package com.chingtech.echarts.activity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Button;

import com.chingtech.echarts.R;
import com.chingtech.echarts.base.BaseActivity;

/**
 * Created by leo on 2016/10/28.
 */
public class MapChartActivity extends BaseActivity {

    private WebView webview;

    private Button text1, text2, text3, text4, text5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);// 隐藏标题
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);// 设置全屏
        setContentView(R.layout.activity_map_chart);

        webview = (WebView) findViewById(R.id.webview);
        text1 = (Button) findViewById(R.id.tv_guanxinbing);
        text2 = (Button) findViewById(R.id.tv_gaoxueya);
        text3 = (Button) findViewById(R.id.tv_tangniaobing);
        text4 = (Button) findViewById(R.id.tv_huxi);
        text5 = (Button)findViewById(R.id.tv_all);

        webview.getSettings().setAllowFileAccess(true);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("file:///android_asset/echarts/myechart.html");

        text1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                webview.loadUrl("javascript:clickMe(guanxinbing, 2);");
            }
        });

        text2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                webview.loadUrl("javascript:clickMe(gaoxueya, 0);");
            }
        });

        text3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                webview.loadUrl("javascript:clickMe(tangniaobing, 1);");
            }
        });

        text4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                webview.loadUrl("javascript:clickMe(huxijibing, 3);");
            }
        });

        text5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                webview.loadUrl("javascript:clickMe();");
            }
        });
    }
}
