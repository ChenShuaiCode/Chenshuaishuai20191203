package com.bawei.chenshuaishuai20191203.presenter;

import com.bawei.chenshuaishuai20191203.contract.IShopcontract;
import com.bawei.chenshuaishuai20191203.modle.IShowModle;
import com.bawei.chenshuaishuai20191203.modle.bean.Bean;

public class IShopPresenter implements IShopcontract.presenter {
    private IShowModle modle;
    private IShopcontract.iview iview;

    public IShopPresenter(IShopcontract.iview iview) {
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

    }
}
