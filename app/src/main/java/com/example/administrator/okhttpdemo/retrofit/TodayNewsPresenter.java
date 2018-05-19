package com.example.administrator.okhttpdemo.retrofit;

/**
 * Created by Administrator on 2018/5/19.
 */

public class TodayNewsPresenter implements ITodayNewsPresenter,OnLoadTodayNewsListener{
    private ITodayNewsModel iTodayNewsModel;
    private ITodayNewsView iTodayNewsView;

    public TodayNewsPresenter(ITodayNewsView iTodayNewsView) {
        this.iTodayNewsView = iTodayNewsView;
        this.iTodayNewsModel=new TodayNewsModel();
    }

    @Override
    public void loadTodayNews(String category) {
        iTodayNewsView.showDialog();
        iTodayNewsModel.loadNews(category,this);
    }

    @Override
    public void success(TodayNewsBean todayNewsBean) {
        iTodayNewsView.hideDialog();
        iTodayNewsView.showNews(todayNewsBean);
    }

    @Override
    public void failure(Throwable throwable) {
        iTodayNewsView.hideDialog();
        iTodayNewsView.showErrorMsg(throwable);
    }
}
