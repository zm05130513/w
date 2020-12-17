package com.example.day01_1.persenter;

import com.example.day01_1.base.BasePersenter;
import com.example.day01_1.contract.MainContract;
import com.example.day01_1.model.MainModelImp;
import com.example.day01_1.model.UserBean;
import com.example.day01_1.utils.net.INetCallBack;

public class MainPersenterImpI extends BasePersenter
implements MainContract.IMainModel {
    private MainContract.IMainModel mainModel;
    private MainContract.IMainView iMainView;
    public MainPersenterImpI(MainContract.IMainView iMainView) {
        this.mainModel = new MainModelImp((MainContract.ImainPersenter) this);
        this.iMainView = iMainView;
    }

    public void login(String name, String password) {
        mainModel.getLonginData("", new INetCallBack<UserBean>() {
            @Override
            public void onSuccess(UserBean userBean) {
                iMainView.getData(userBean);
            }

            @Override
            public void onFail(String err) {

            }

        });
    }

    public void loginResult(String result) {
//做判单的

    }

    @Override
    public <T> void getLonginData(String url, INetCallBack<T> callBack) {

    }
}
