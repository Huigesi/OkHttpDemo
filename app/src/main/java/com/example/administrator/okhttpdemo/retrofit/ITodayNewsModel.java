package com.example.administrator.okhttpdemo.retrofit;

/**
 * Created by Administrator on 2018/5/19.
 */

public interface ITodayNewsModel {
    void loadNews(String category,OnLoadTodayNewsListener onLoadListener);
}
