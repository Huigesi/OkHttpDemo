package com.example.administrator.okhttpdemo.retrofit;

/**
 * Created by Administrator on 2018/5/19.
 */

public interface ITodayNewsView {
    void showNews(TodayNewsBean todayNewsBean);
    void showDialog();
    void hideDialog();

    void showErrorMsg(Throwable throwable);
}
