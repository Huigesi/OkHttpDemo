package com.example.administrator.okhttpdemo.retrofit;

import com.example.administrator.okhttpdemo.BookBean;
import com.example.administrator.okhttpdemo.NewsBean;
import com.example.administrator.okhttpdemo.NewsBean2;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Administrator on 2018/5/10.
 */

public interface RetrofitService {
    //https://api.douban.com/v2/book/search?q=%E9%87%91%E7%93%B6%E6%A2%85
    @GET("book/search")
    Call<BookBean> gerSearchBack(@Query("q") String name,
                                 @Query("tag") String tag,
                                 @Query("start")int start,
                                 @Query("count")int count);
    //http://is.snssdk.com/api/news/feed/v51/?category=news_entertainment
    @GET("api/news/feed/v51/")
    Call<TodayNewsBean> getTodayNews(@Query("category") String category
                                );

    @GET("nc/article/{type}/{id}/{startPage}-20.html")
    Call<NewsBean2> getNews(@Path("type") String type,
                            @Path("id") String id,
                            @Path("startPage") int startPage);

}
