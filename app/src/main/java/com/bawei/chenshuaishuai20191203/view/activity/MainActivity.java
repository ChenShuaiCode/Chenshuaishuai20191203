package com.bawei.chenshuaishuai20191203.view.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.RadioGroup;

import com.bawei.chenshuaishuai20191203.R;
import com.bawei.chenshuaishuai20191203.base.BaseActivity;
import com.bawei.chenshuaishuai20191203.view.fragment.HomeFragment;
import com.bawei.chenshuaishuai20191203.view.fragment.ShopFragment;

import java.util.ArrayList;

public class MainActivity extends BaseActivity {

    private ViewPager viewPager;
    private RadioGroup radioGroup;
    private ArrayList<Fragment> list;

    @Override
    protected void initdata() {
        list=new ArrayList<>();
        list.add(new HomeFragment());
        list.add(new ShopFragment());

        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @NonNull
            @Override
            public Fragment getItem(int position) {
                return list.get(position);
            }
            @Override
            public int getCount() {
                return list.size();
            }
        });

    }

    @Override
    protected void initview() {
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }
            @Override
            public void onPageSelected(int position) {
                switch (position%list.size()){
                    case 0:
                        radioGroup.check(R.id.btn_1);
                        break;
                    case 1:
                        radioGroup.check(R.id.btn_2);
                        break;
                }
            }
            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.btn_1:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.btn_2:
                        viewPager.setCurrentItem(1);
                        break;
                }
            }
        });
    }
    @Override
    protected int layoutid() {
        return R.layout.activity_main;
    }
    public void jump(){
        viewPager.setCurrentItem(0);
    }
}