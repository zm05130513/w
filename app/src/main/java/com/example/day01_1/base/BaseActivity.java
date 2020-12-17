package com.example.day01_1.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity<T extends BasePersenter> extends AppCompatActivity
implements BaseView{
    public T persenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutID());
        if(persenter==null){
          //  persenter==add();
            persenter.attachView(this);
        }
        initView();
        initData();
    }

    protected abstract void initData() ;

    protected abstract void initView() ;

    public abstract T add() ;

    protected abstract int getLayoutID();

  //  public abstract MainPersenterImpI
}
