package com.bawei.lib_core.base;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bawei.lib_core.base.mvpbase.IBasePresenter;

public abstract class BaseActivity<P extends IBasePresenter> extends AppCompatActivity {
    private P presenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layoutid());
        presenter=initprestenter();
        initview();
        initdata();
    }

    protected abstract void initdata();

    protected abstract void initview();

    protected abstract P initprestenter();

    protected abstract int layoutid();
    public void showToast(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }
}
