package com.bawei.chenshuaishuai20191203.contract;

import com.bawei.chenshuaishuai20191203.modle.bean.Bean;

public interface IShopcontract {
    interface imodle{
        void getdata(String url,ModleCallBack modleCallBack);
        interface ModleCallBack{
            void success(Bean bean);
        }
    }


    interface iview{
        void success(Bean bean);
        void failure(Throwable throwable);
    }

    interface  presenter{
        void getdata(String bean);
    }


}
