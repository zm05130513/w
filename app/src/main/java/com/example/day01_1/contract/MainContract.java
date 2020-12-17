package com.example.day01_1.contract;

import com.example.day01_1.base.BaseView;
import com.example.day01_1.model.UserBean;
import com.example.day01_1.utils.net.INetCallBack;

public class MainContract {
    public interface IMainModel{
        <T> void getLonginData(String url, INetCallBack<T> callBack);
    }
    public interface ImainPersenter{
        
        void login(String name,String password);
        void loginResult(String result);
    }
    public interface IMainView extends BaseView {
        String getUserName();
        String getPassword();
        void getData(UserBean string);
    }
}
