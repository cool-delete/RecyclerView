package com.lovejazzie.lreanrv;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


public class MainActivity extends Activity {


    private RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        rv = new RecyclerView(this);
        setContentView(rv);//这个Activity的内容布局

        rv.setLayoutManager(new GridLayoutManager(this,4,LinearLayoutManager.HORIZONTAL,false));//表格布局默认垂直 二参数表示多少列
        rv.setAdapter(new MyAdapter());



/*
          rv.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
          第三个参数表示绘制从那边开始 true从左边 false右边
*/

        }

}

