package com.bawei.chenshuaishuai20191203.view.fragment;

import android.util.Log;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.bawei.chenshuaishuai20191203.R;
import com.bawei.chenshuaishuai20191203.base.BaseFragment;
import com.bawei.chenshuaishuai20191203.contract.IShopcontract;
import com.bawei.chenshuaishuai20191203.modle.bean.Week2Bean;
import com.bawei.chenshuaishuai20191203.presenter.I2ShopPresenter;
import com.bawei.chenshuaishuai20191203.view.adapter.Adapter;
import com.bawei.chenshuaishuai20191203.view.adapter.GrAdapter;
import com.bawei.chenshuaishuai20191203.view.adapter.GridAdapter;
import com.stx.xhb.androidx.XBanner;

import java.util.ArrayList;
import java.util.List;

public class OtherFragment extends BaseFragment implements IShopcontract.i2view {

    private I2ShopPresenter presenter;

    private ImageView imm;
    private LinearLayout li;
    private GridView gridview;
    private GridView grview;
   // private XBanner xbanner;
    //private ArrayList<String> list=new ArrayList<>();

    @Override
    protected void initview(View inflate) {
        imm = (ImageView) inflate.findViewById(R.id.imm);
        li = (LinearLayout)inflate.findViewById(R.id.li);
        gridview = (GridView)inflate. findViewById(R.id.gridview);
       // xbanner = (XBanner)inflate. findViewById(R.id.xbanner);
        grview = (GridView)inflate. findViewById(R.id.grview);
    }
    @Override
    protected int layoutid() {
        return R.layout.home_fragment_layout;
    }
    @Override
    protected void initdata() {
       if (hasnet(getActivity())){
           li.setVisibility(View.VISIBLE);
           imm.setVisibility(View.GONE);
       }else {
           li.setVisibility(View.GONE);
           imm.setVisibility(View.VISIBLE);
       }
        presenter = new I2ShopPresenter(this);
        if (hasnet(getActivity())){
            presenter.getHome("http://blog.zhaoliang5156.cn/api/mall/mallhome.json");
        }
    }
    @Override
    public void success(Week2Bean week2Bean) {
        List<Week2Bean.ListDataBean> listData = week2Bean.getListData();
        gridview.setAdapter(new GridAdapter(listData));
        List<Week2Bean.ShopGridDataBean> shopGridData = week2Bean.getShopGridData();
        grview.setAdapter(new GrAdapter(shopGridData));

        /*final List<Week2Bean.BannerDataBean> bannerData = week2Bean.getBannerData();


        Toast.makeText(getActivity(), bannerData + "", Toast.LENGTH_SHORT).show();

        xbanner.setmAdapter(new XBanner.XBannerAdapter() {
            @Override
            public void loadBanner(XBanner banner, Object model, View view, int position) {
                list.add(bannerData.get(position).getImageurl());
                banner.setData(list,null);
            }
        });*/
    }
    @Override
    public void failure(Throwable throwable) {

    }
}