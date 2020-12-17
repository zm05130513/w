package com.example.day01_1.base;

public class BasePersenter<V extends BaseView> {
    public V iview;
    public void attachView(V v){
        iview=v;
    }
}
