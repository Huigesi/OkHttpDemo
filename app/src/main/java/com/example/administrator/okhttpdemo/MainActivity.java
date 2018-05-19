package com.example.administrator.okhttpdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.administrator.okhttpdemo.http.Api;
import com.example.administrator.okhttpdemo.retrofit.RetrofitHelper;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {
    private String url="https://www.sojson.com/open/api/weather/json.shtml?city=北京";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // getDataAsunc();
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                //RetrofitHelper.sendRetro(Api.BOOK_HOST);
            }
        });
       thread.start();
    }
    public void getDataAsunc(){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder()
                .url(url)
                .build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Toast.makeText(MainActivity.this,"获取数据失败",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()) {
                        //Log.i("response",response.body().string());
                    String s=response.body().string();

                }
            }
        });
    }
}
