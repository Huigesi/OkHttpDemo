package com.example.administrator.okhttpdemo.retrofit;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.administrator.okhttpdemo.JsonUtil;
import com.example.administrator.okhttpdemo.R;
import com.example.administrator.okhttpdemo.http.Api;

import java.util.TimerTask;

public class ActivityShowActivity extends Activity implements ITodayNewsView, View.OnClickListener {

    private TextView tvShow;
    private TodayNewsPresenter todayNewsPresenter;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        initView();

        tvShow = (TextView) findViewById(R.id.tv_show);
        todayNewsPresenter = new TodayNewsPresenter(this);


    }

    @Override
    public void showNews(final TodayNewsBean todayNewsBean) {
        runOnUiThread(new TimerTask() {
            @Override
            public void run() {
                tvShow.setText(todayNewsBean.getData().get(0).getContent());
            }
        });
    }

    @Override
    public void showDialog() {

    }

    @Override
    public void hideDialog() {

    }

    @Override
    public void showErrorMsg(Throwable throwable) {

    }

    private void initView() {
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                todayNewsPresenter.loadTodayNews(Api.TODAY_NEWS_VIDEO);
                break;
        }
    }
}
