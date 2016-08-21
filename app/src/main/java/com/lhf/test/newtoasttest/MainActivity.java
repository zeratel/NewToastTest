package com.lhf.test.newtoasttest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private ToastUtil mToastUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToastUtil = new ToastUtil(MainActivity.this,View.inflate(MainActivity.this,R.layout.toast,null),1000);
//        mToastUtil.Short(MainActivity.this,"自定义message字体、背景色")
//                .setToastColor(Color.WHITE, getResources().getColor(R.color.colorAccent));
//        mToastUtil.Short(MainActivity.this,"自定义message字体、背景色")
//                .setToastColor(Color.WHITE, R.drawable.toast);

        findViewById(R.id.bt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                mToastUtil.show();
                ToastUtil2.shortText(MainActivity.this,"LHF自定义Toast");
            }
        });

    }
}
