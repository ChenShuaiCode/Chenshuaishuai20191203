package com.bawei.chenshuaishuai20191203.contract;

import com.bawei.chenshuaishuai20191203.modle.bean.Bean;
import com.bawei.chenshuaishuai20191203.modle.bean.Week2Bean;

public interface IShopcontract {
    interface imodle{
        void getdata(String url,ModleCallBack modleCallBack);
        interface ModleCallBack{
            void success(Bean bean);
            void failure(Throwable throwable);
        }
    }
    interface i2model{
        void getHome(String url,MoCallBack moCallBack);
        interface  MoCallBack{
            void success(Week2Bean week2Bean);
            void failure(Throwable throwable);
        }
    }


    interface iview{
        void success(Bean bean);
        void failure(Throwable throwable);
    }
    interface i2view{
        void success(Week2Bean week2Bean);
        void failure(Throwable throwable);
    }

    interface  presenter{
        void getdata(String bean);
    }
    interface  i2presenter{
        void getHome(String bean);
    }



}
