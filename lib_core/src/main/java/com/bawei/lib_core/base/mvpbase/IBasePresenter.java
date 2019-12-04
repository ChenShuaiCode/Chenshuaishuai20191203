package com.bawei.lib_core.base.mvpbase;

import java.lang.ref.WeakReference;

public abstract class IBasePresenter<M extends IBaseModel,V extends IBaseView> {

    protected M model;
    private WeakReference<V> weakReference;
    public IBasePresenter(V v){
        weakReference=new WeakReference<>(v);
        model=initModel();
    }

    protected abstract M initModel();

    public void detach(){
        if (weakReference!=null){
            weakReference.clear();
        }
    }
    public V getView(){
        return weakReference.get();
    }
}