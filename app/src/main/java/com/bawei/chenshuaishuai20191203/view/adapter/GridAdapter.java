package com.bawei.chenshuaishuai20191203.view.adapter;

import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bawei.chenshuaishuai20191203.R;
import com.bawei.chenshuaishuai20191203.modle.bean.Bean;
import com.bawei.chenshuaishuai20191203.modle.bean.Week2Bean;
import com.bawei.chenshuaishuai20191203.utils.NetUtils;

import java.util.List;

public class GridAdapter extends BaseAdapter {
    private List<Week2Bean.ListDataBean> list;

    public GridAdapter(List<Week2Bean.ListDataBean> list) {
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHodler viewHodler;
        convertView=View.inflate(parent.getContext(),R.layout.gridadapter,null);
        viewHodler=new ViewHodler();
        viewHodler.imaa=convertView.findViewById(R.id.im);
        viewHodler.text_1=convertView.findViewById(R.id.text_1);
        convertView.setTag(viewHodler);
        NetUtils.getInstance().getphoto(list.get(position).getImageurl(),viewHodler.imaa);
        viewHodler.text_1.setText(list.get(position).getTitle());
        return convertView;
    }
    class ViewHodler{
        ImageView imaa;
        TextView text_1;
    }
}
