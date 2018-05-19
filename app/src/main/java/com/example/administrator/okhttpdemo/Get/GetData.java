package com.example.administrator.okhttpdemo.Get;

import android.os.Handler;
import android.util.Log;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Administrator on 2018/4/19.
 */

public class GetData {
    private String url="https://www.sojson.com/open/api/weather/json.shtml?city=";

    //get a Url
    private Handler handler;

    public void getDataSync(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    OkHttpClient client=new OkHttpClient();
                    Request request = new Request.Builder().url("http://www.baidu.com").build();
                    Response response = client.newCall(request).execute();
                    if (response.isSuccessful()){

                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }).start();

    }
    public void getDataAsunc(){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder()
                .url(url)
                .build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()) {
                    Log.i("response",response.toString());
                }
            }
        });
    }
}
