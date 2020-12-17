package com.example.day01_1.model;

import com.example.day01_1.contract.MainContract;
import com.example.day01_1.utils.net.INetCallBack;
import com.example.day01_1.utils.net.RetrofitUtils;

public class MainModelImp implements MainContract.IMainModel {
    private MainContract.ImainPersenter persenter;

    public MainModelImp(MainContract.ImainPersenter persenter) {

        this.persenter = persenter;
    }

    @Override
    public <T> void getLonginData(String url, INetCallBack<T> callBack) {
        persenter.loginResult("登陆成功了");
        RetrofitUtils.getInstance().get(url, callBack);
    }
}
