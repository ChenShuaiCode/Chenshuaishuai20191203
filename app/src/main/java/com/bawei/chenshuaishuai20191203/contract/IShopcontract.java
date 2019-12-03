package com.bawei.chenshuaishuai20191203.contract;

import com.bawei.chenshuaishuai20191203.modle.bean.Bean;

public interface IShopcontract {
    interface imodle{
        void getdata(String url,ModleCallBack modleCallBack);
        interface ModleCallBack{
            void getmodle(Bean bean);
        }
    }
    interface  presenter{
        void suecc(Bean bean);
        void thow(Throwable throwable);
    }
    interface iview{
        void suecc(Bean bean);
    }


}
