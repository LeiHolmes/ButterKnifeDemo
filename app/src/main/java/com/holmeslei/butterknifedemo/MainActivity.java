package com.holmeslei.butterknifedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_text1)
    TextView tvText1;
    @BindView(R.id.tv_text2)
    TextView tvText2;
    @BindView(R.id.tv_text3)
    TextView tvText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.bt_button1, R.id.bt_button2, R.id.bt_button3})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bt_button1:
                tvText1.setText("按钮1被按下了");
                break;
            case R.id.bt_button2:
                tvText2.setText("按钮2被按下了");
                break;
            case R.id.bt_button3:
                tvText3.setText("按钮3被按下了");
                break;
        }
    }
}
