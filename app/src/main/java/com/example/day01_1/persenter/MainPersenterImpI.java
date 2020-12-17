package com.example.day01_1.persenter;

import com.example.day01_1.base.BasePersenter;
import com.example.day01_1.contract.MainContract;
import com.example.day01_1.model.MainModelImp;
import com.example.day01_1.model.UserBean;
import com.example.day01_1.utils.net.INetCallBack;

public class MainPersenterImpI extends BasePersenter<MainContract.IMainView>
        implements MainContract.IMainModel {
    private MainContract.IMainModel mainModel;

    public MainPersenterImpI(MainContract.IMainView iMainView) {
       // this.mainModel = new MainModelImp()
        this.mainModel=new MainModelImp(this);
    }

    public void login(String name, String password) {
        mainModel.getLonginData("", new INetCallBack<UserBean>() {
            @Override
            public void onSuccess(UserBean userBean) {
                iview.getData(userBean);
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
