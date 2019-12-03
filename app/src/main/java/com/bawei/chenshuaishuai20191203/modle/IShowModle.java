package com.bawei.chenshuaishuai20191203.modle;

import com.bawei.chenshuaishuai20191203.contract.IShopcontract;
import com.bawei.chenshuaishuai20191203.modle.bean.Bean;
import com.bawei.chenshuaishuai20191203.utils.NetUtils;
import com.google.gson.Gson;

public class IShowModle implements IShopcontract.imodle {
    @Override
    public void getdata(String url, final ModleCallBack modleCallBack) {
        ////
        NetUtils.getInstance().getjson(url, new NetUtils.MyCallBack() {
            @Override
            public void getjson(String json) {
                Bean bean = new Gson().fromJson(json, Bean.class);
                modleCallBack.success(bean);
            }
        });
    }
}
