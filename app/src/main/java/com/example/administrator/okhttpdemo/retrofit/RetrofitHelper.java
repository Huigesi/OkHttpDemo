package com.example.administrator.okhttpdemo.retrofit;

import android.util.Log;

import com.example.administrator.okhttpdemo.BookBean;
import com.example.administrator.okhttpdemo.NewsBean;
import com.example.administrator.okhttpdemo.NewsBean2;
import com.example.administrator.okhttpdemo.http.Api;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2018/5/10.
 */

public class RetrofitHelper {
    private static volatile OkHttpClient OkHttpClient;
    private RetrofitService retrofitService;

    public RetrofitHelper(String host) {
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(host)
                .client(getOkHttpClient())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        retrofitService = retrofit.create(RetrofitService.class);

    }
    public Call<TodayNewsBean> getTodayNewsList(String category){
        return retrofitService.getTodayNews(category);
    }
    public Call<BookBean> getBook(String name){
        return retrofitService.gerSearchBack(name,null,0,1);
    }
    public Call<NewsBean2> getNews(){
        return retrofitService.getNews("headline" , Api.HEADLINE_ID, 0);
    }


    /*public static void sendRetro(String host){
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(host)
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().create()))
                .build();
        final RetrofitService retrofitService = retrofit.create(RetrofitService.class);
        Call<BookBean> call = retrofitService.gerSearchBack("金瓶梅", null, 0, 1);
        call.enqueue(new Callback<BookBean>() {
            @Override
            public void onResponse(Call<BookBean> call, Response<BookBean> response) {
                for(int i=0;i<response.body().getBooks().get(0).getAuthor().size();i++){
                    Log.i("response", "onResponse"+i+":"+response.body().getBooks().get(0).getAuthor().get(i));
                }
            }
            @Override
            public void onFailure(Call<BookBean> call, Throwable t) {
                t.getCause().printStackTrace();
            }
        });
    }*/


    public  OkHttpClient getOkHttpClient() {
        if (OkHttpClient == null) {
            synchronized (RetrofitHelper.class) {
                if (OkHttpClient == null) {

                    OkHttpClient = new OkHttpClient.Builder()
                            .retryOnConnectionFailure(true)
                            .connectTimeout(30, TimeUnit.SECONDS)
                            .build();

                }
            }
        }
        return OkHttpClient;
    }
}
