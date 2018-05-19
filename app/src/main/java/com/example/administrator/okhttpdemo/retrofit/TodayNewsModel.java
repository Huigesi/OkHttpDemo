package com.example.administrator.okhttpdemo.retrofit;

import android.util.Log;

import com.example.administrator.okhttpdemo.BookBean;
import com.example.administrator.okhttpdemo.NewsBean;
import com.example.administrator.okhttpdemo.NewsBean2;
import com.example.administrator.okhttpdemo.http.Api;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Administrator on 2018/5/19.
 */

public class TodayNewsModel implements ITodayNewsModel{

    @Override
    public void loadNews(String category, final OnLoadTodayNewsListener onLoadListener) {
        RetrofitHelper retrofitHelper=new RetrofitHelper(Api.TODAY_NEWS_HOST);
        retrofitHelper.getTodayNewsList(category).enqueue(new Callback<TodayNewsBean>() {
            @Override
            public void onResponse(Call<TodayNewsBean> call, Response<TodayNewsBean> response) {
                Log.i("Response<TodayNewsBean>", "onResponse: "+response.body().getData().get(0).getContent().toString());
                onLoadListener.success(response.body());
            }

            @Override
            public void onFailure(Call<TodayNewsBean> call, Throwable t) {
                onLoadListener.failure(t);
            }
        });
       /* retrofitHelper.getBook(category).enqueue(new Callback<BookBean>() {
            @Override
            public void onResponse(Call<BookBean> call, Response<BookBean> response) {
                Log.i("Response<BookBean>", "onResponse: "+response.body());
            }

            @Override
            public void onFailure(Call<BookBean> call, Throwable t) {

            }
        });*/
       /* retrofitHelper.getNews().enqueue(new Callback<NewsBean2>() {
            @Override
            public void onResponse(Call<NewsBean2> call, Response<NewsBean2> response) {
                Log.i("Response<NewsBean>", "onResponse: "+response.body().getT1348647909107().get(0).getTitle());
            }

            @Override
            public void onFailure(Call<NewsBean2> call, Throwable t) {

            }
        });*/

    }
}
