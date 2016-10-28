package com.chingtech.echarts;

import android.os.Bundle;
import android.view.View;

import com.chingtech.echarts.activity.BarChartActivity;
import com.chingtech.echarts.activity.BubbleChartActivity;
import com.chingtech.echarts.activity.LineChartActivity;
import com.chingtech.echarts.activity.MapChartActivity;
import com.chingtech.echarts.activity.RadarChartActivity;
import com.chingtech.echarts.base.BaseActivity;

/**
 * Created by leo on 2016/10/28.
 */
public class MainActivity extends BaseActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_map_chart:
                openActivity(MapChartActivity.class, false);
                break;
            case R.id.btn_radar_chart:
                openActivity(RadarChartActivity.class, false);
                break;
            case R.id.btn_bar_chart:
                openActivity(BarChartActivity.class, false);
                break;
            case R.id.btn_line_chart:
                openActivity(LineChartActivity.class, false);
                break;
            case R.id.btn_bubble_chart:
                openActivity(BubbleChartActivity.class, false);
                break;
        }
    }
}
