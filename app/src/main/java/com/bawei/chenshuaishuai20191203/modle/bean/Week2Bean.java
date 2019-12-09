package com.bawei.chenshuaishuai20191203.modle.bean;

import java.util.List;

public class Week2Bean {

    /**
     * code : 200
     * bannerData : [{"imageurl":"http://blog.zhaoliang5156.cn/api/images/banner1201.jpg"},{"imageurl":"http://blog.zhaoliang5156.cn/api/images/banner1202.jpg"},{"imageurl":"http://blog.zhaoliang5156.cn/api/images/banner1203.jpg"}]
     * listData : [{"title":"honor 9x","price":"锟�1999","time":"12鏈�12鏃�12鐐�","imageurl":"http://blog.zhaoliang5156.cn/api/images/honor9x.png"},{"title":"Apple 11","price":"锟�4999","time":"12鏈�12鏃�12鐐�","imageurl":"http://blog.zhaoliang5156.cn/api/images/apple11.png"},{"title":"OPPO ace","price":"锟�2999","time":"12鏈�12鏃�12鐐�","imageurl":"http://blog.zhaoliang5156.cn/api/images/oppo%20ace.png"}]
     * shopGridData : [{"title":"honor20","price":"锟�2099","imageurl":"http://blog.zhaoliang5156.cn/api/images/honor20.jpg"},{"title":"Mate 30 Pro 5G鎼浇楹掗簾990 5G SoC鏃楄埌鑺墖, 鏀寔5G鍙屾ā, 5G鏃朵唬, 涓\u20ac姝ュ埌浣�","price":"锟�6899","imageurl":"http://blog.zhaoliang5156.cn/api/images/mate30.jpg"},{"title":"OPPO Reno2锛岃秴娓呰棰戦槻鎶栵紝5鍊嶆贩鍚堝厜鍙橈紝杩愬姩鐘舵\u20ac佷篃鑳芥媿鍑虹ǔ瀹氳棰戙\u20ac�6.5鑻卞鎶ょ溂鍏ㄦ櫙灞忥紝浣庝寒鏃犻闂洿鎶ょ溂銆�","price":"锟�3999","imageurl":"http://blog.zhaoliang5156.cn/api/images/oppoReno2.jpg"},{"title":"vivonex3","price":"锟�1580","imageurl":"http://blog.zhaoliang5156.cn/api/images/vivonex3.jpg"}]
     */

    private String code;
    private List<BannerDataBean> bannerData;
    private List<ListDataBean> listData;
    private List<ShopGridDataBean> shopGridData;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<BannerDataBean> getBannerData() {
        return bannerData;
    }

    public void setBannerData(List<BannerDataBean> bannerData) {
        this.bannerData = bannerData;
    }

    public List<ListDataBean> getListData() {
        return listData;
    }

    public void setListData(List<ListDataBean> listData) {
        this.listData = listData;
    }

    public List<ShopGridDataBean> getShopGridData() {
        return shopGridData;
    }

    public void setShopGridData(List<ShopGridDataBean> shopGridData) {
        this.shopGridData = shopGridData;
    }

    public static class BannerDataBean {
        /**
         * imageurl : http://blog.zhaoliang5156.cn/api/images/banner1201.jpg
         */

        private String imageurl;

        public String getImageurl() {
            return imageurl;
        }

        public void setImageurl(String imageurl) {
            this.imageurl = imageurl;
        }
    }

    public static class ListDataBean {
        /**
         * title : honor 9x
         * price : 锟�1999
         * time : 12鏈�12鏃�12鐐�
         * imageurl : http://blog.zhaoliang5156.cn/api/images/honor9x.png
         */

        private String title;
        private String price;
        private String time;
        private String imageurl;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getImageurl() {
            return imageurl;
        }

        public void setImageurl(String imageurl) {
            this.imageurl = imageurl;
        }
    }

    public static class ShopGridDataBean {
        /**
         * title : honor20
         * price : 锟�2099
         * imageurl : http://blog.zhaoliang5156.cn/api/images/honor20.jpg
         */

        private String title;
        private String price;
        private String imageurl;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getImageurl() {
            return imageurl;
        }

        public void setImageurl(String imageurl) {
            this.imageurl = imageurl;
        }
    }
}
