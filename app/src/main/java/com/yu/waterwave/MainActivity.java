package com.yu.waterwave;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private WaterWaveView mWaterWaveView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWaterWaveView = (WaterWaveView) findViewById(R.id.waterWaveView);
        mWaterWaveView.setFillWaveSourceShapeRadius(DisplayUtil.dip2px(MainActivity.this,40));
    }
}
