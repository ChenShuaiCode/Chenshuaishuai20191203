package com.bawei.chenshuaishuai20191203.view.fragment;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;

import com.bawei.chenshuaishuai20191203.R;
import com.bawei.chenshuaishuai20191203.base.BaseFragment;
import com.bawei.chenshuaishuai20191203.contract.IShopcontract;
import com.bawei.chenshuaishuai20191203.modle.bean.Bean;
import com.bawei.chenshuaishuai20191203.presenter.IShopPresenter;
import com.bawei.chenshuaishuai20191203.utils.NetUtils;
import com.bawei.chenshuaishuai20191203.view.activity.MainActivity;
import com.bawei.chenshuaishuai20191203.view.adapter.Adapter;
import com.google.gson.Gson;

import java.util.List;

public class ShopingCartFragment extends BaseFragment implements IShopcontract.iview {

    private Button tiao;
    private GridView listView;
    private IShopPresenter presenter;

    @Override
    protected void initview(View inflate) {
        tiao = (Button)inflate. findViewById(R.id.tiao);
        listView = (GridView) inflate.findViewById(R.id.gridview);
        tiao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity mainActivity= (MainActivity) getActivity();
                mainActivity.jump();
            }
        });
    }
    @Override
    protected int layoutid() {
        return R.layout.shop_fragmetn_layout;
    }
    @Override
    protected void initdata() {
        presenter = new IShopPresenter(this);
        if (hasnet(getActivity())){
            presenter.getdata("http://blog.zhaoliang5156.cn/api/mall/mall.json");
        }
    }
    @Override
    public void success(Bean bean) {
        List<Bean.ShopGridDataBean> shopGridData = bean.getShopGridData();
        listView.setAdapter(new Adapter(shopGridData));



    }
    @Override
    public void failure(Throwable throwable) {
    }
}