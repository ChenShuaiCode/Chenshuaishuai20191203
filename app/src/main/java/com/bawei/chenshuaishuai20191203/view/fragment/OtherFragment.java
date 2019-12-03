package com.bawei.chenshuaishuai20191203.view.fragment;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bawei.chenshuaishuai20191203.R;
import com.bawei.chenshuaishuai20191203.base.BaseFragment;

public class OtherFragment extends BaseFragment {

    private ImageView imm;
    private TextView tt;

    @Override
    protected void initview(View inflate) {
        imm = (ImageView) inflate.findViewById(R.id.imm);
        tt = (TextView) inflate.findViewById(R.id.tt);
    }
    @Override
    protected int layoutid() {
        return R.layout.home_fragment_layout;
    }
    @Override
    protected void initdata() {
       if (hasnet(getActivity())){
           tt.setVisibility(View.VISIBLE);
           imm.setVisibility(View.GONE);
       }else {
           tt.setVisibility(View.GONE);
           imm.setVisibility(View.VISIBLE);
       }
    }
}