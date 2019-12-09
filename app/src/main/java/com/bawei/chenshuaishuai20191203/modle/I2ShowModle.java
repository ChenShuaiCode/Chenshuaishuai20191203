package com.bawei.chenshuaishuai20191203.modle;

import com.bawei.chenshuaishuai20191203.contract.IShopcontract;
import com.bawei.chenshuaishuai20191203.modle.bean.Bean;
import com.bawei.chenshuaishuai20191203.modle.bean.Week2Bean;
import com.bawei.chenshuaishuai20191203.utils.NetUtils;
import com.google.gson.Gson;

public class I2ShowModle implements IShopcontract.i2model {
    @Override
    public void getHome(String url, final MoCallBack moCallBack) {
        NetUtils.getInstance().getjson(url, new NetUtils.MyCallBack() {
            @Override
            public void getjson(String json) {
                Week2Bean week2Bean = new Gson().fromJson(json, Week2Bean.class);
                moCallBack.success(week2Bean);
            }
        });
    }
    /*@Override
    public void getdata(String url, final ModleCallBack modleCallBack) {
        ////
        NetUtils.getInstance().getjson(url, new NetUtils.MyCallBack() {
            @Override
            public void getjson(String json) {
                Bean bean = new Gson().fromJson(json, Bean.class);
                modleCallBack.success(bean);
            }
        });
    }*/
}
