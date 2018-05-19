package com.example.administrator.okhttpdemo.retrofit;

/**
 * Created by Administrator on 2018/5/19.
 */

public interface OnLoadTodayNewsListener {
     void success(TodayNewsBean todayNewsBean);
    void failure(Throwable throwable);
}
