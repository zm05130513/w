package com.example.day01_1.view;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import com.example.day01_1.R;
import com.example.day01_1.base.BaseActivity;
import com.example.day01_1.contract.MainContract;
import com.example.day01_1.model.UserBean;
import com.example.day01_1.persenter.MainPersenterImpI;

public class LoginActivity extends BaseActivity<MainPersenterImpI>
implements MainContract.IMainView {
    private EditText editTextTextPersonName;
    private EditText editTextTextPassWord;

    @Override
    protected void initData() {
        persenter.login(getUserName(),getPassword());
    }

    @Override
    protected void initView() {
        editTextTextPersonName=findViewById(R.id.editTextTextPersonName);
        editTextTextPassWord=findViewById(R.id.editTextTextPassword);
    }

    @Override
    protected int getLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    public MainPersenterImpI add() {
        return new MainPersenterImpI(this);
    }
    public void loginButtin(View view) {
        if (!TextUtils.isEmpty(getUserName()) && !TextUtils.isEmpty(getPassword())) {
            persenter.login(getUserName(), getPassword());
        }
    }

    @Override
    public String getUserName() {
        return editTextTextPersonName.getText().toString();
    }

    @Override
    public String getPassword() {
        return editTextTextPassWord.getText().toString();
    }

    @Override
    public void getData(UserBean string) {

    }
}
