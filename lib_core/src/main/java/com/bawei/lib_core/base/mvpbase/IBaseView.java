package com.bawei.lib_core.base.mvpbase;

public interface IBaseView {
    void showLoading();
    void hideLoading();
    void failure(Throwable error);
}
