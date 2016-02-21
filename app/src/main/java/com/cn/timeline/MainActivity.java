package com.cn.timeline;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TimeLine mTimeLine;
    private ArrayList<String> timeList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTimeLine = (TimeLine) findViewById(R.id.time_line);
        timeList.add("2016年2月19日 上午1:31:47 快件离开【西安雁塔集散中心】,正发往 【杭州上城集散中心】");
        timeList.add("2016年2月19日 上午1:15:31 快件到达 【西安雁塔集散中心】");
        timeList.add("2016年2月17日 上午3:26:21 快件离开【乌鲁木齐集散中心】,正发往 【西安雁塔集散中心】");
        timeList.add("2016年2月16日 下午5:35:16 快件到达 【乌鲁木齐集散中心】");
        timeList.add("2016年2月16日 下午4:03:22 快件离开【乌鲁木齐天山区大湾营业点】,正发往 【乌鲁木齐集散中心】");
        timeList.add("2016年2月16日 上午12:12:36 顺丰速运 已收取快件");

//        timeList.add("1");
//        timeList.add("1");
//        timeList.add("1");
//        timeList.add("1");
//        timeList.add("1");
//        timeList.add("1");
//        timeList.add("1");
//        timeList.add("1");






        TextView tv;
        mTimeLine.addEvent(timeList);

    }


}
