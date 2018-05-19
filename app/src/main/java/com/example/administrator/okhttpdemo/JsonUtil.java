package com.example.administrator.okhttpdemo;

import com.google.gson.Gson;

/**
 * Created by Administrator on 2018/5/19.
 */

public class JsonUtil {
    public static TodayNewsContentBean getTodayNewsContentBean(String content){
        Gson gson=new Gson();
        TodayNewsContentBean bean = gson.fromJson(content, TodayNewsContentBean.class);
        return bean;
    }
}
