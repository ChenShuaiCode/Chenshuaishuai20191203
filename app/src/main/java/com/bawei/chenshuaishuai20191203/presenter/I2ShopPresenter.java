package com.bawei.chenshuaishuai20191203.presenter;

import com.bawei.chenshuaishuai20191203.contract.IShopcontract;
import com.bawei.chenshuaishuai20191203.modle.I2ShowModle;
import com.bawei.chenshuaishuai20191203.modle.IShowModle;
import com.bawei.chenshuaishuai20191203.modle.bean.Bean;
import com.bawei.chenshuaishuai20191203.modle.bean.Week2Bean;

public class I2ShopPresenter implements IShopcontract.i2presenter {
    private I2ShowModle modle;
    private IShopcontract.i2view i2view;

    public I2ShopPresenter(IShopcontract.i2view i2view) {
        this.i2view = i2view;
    }

    @Override
    public void getHome(String url) {
        modle=new I2ShowModle();
        modle.getHome(url, new IShopcontract.i2model.MoCallBack() {
            @Override
            public void success(Week2Bean week2Bean) {
                i2view.success(week2Bean);
            }

            @Override
            public void failure(Throwable throwable) {
                i2view.failure(throwable);
            }
        });
    }
    /*private IShowModle modle;
    private IShopcontract.iview iview;

    public I2ShopPresenter(IShopcontract.iview iview) {
        this.iview = iview;
    }

    @Override
    public void getdata(String url) {
        modle=new IShowModle();
        modle.getdata(url, new IShopcontract.imodle.ModleCallBack() {
            @Override
            public void success(Bean bean) {
                iview.success(bean);
            }

            @Override
            public void failure(Throwable throwable) {
                iview.failure(throwable);

            }
        });

    }*/
}
