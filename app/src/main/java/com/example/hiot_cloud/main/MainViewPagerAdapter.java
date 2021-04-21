package com.example.hiot_cloud.main;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

import com.example.hiot_cloud.utils.Constans;

/**
 * viewPager适配器
 */
public class MainViewPagerAdapter extends FragmentPagerAdapter {
    public MainViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment =null;
        switch (position) {
            case Constans.MAIN_VIEWPAGER_TDEX_MESSAGE:
                //创建消息Frament todo
                break;
            case Constans.MAIN_VIEWPAGER_TDEX_EQUIPMENT:
                //创建设备Frament
                break;
            case Constans.MAIN_VIEWPAGER_TDEX_SCENE:
                //创建场景Frament
                break;
            case Constans.MAIN_VIEWPAGER_TDEX_MINE:
                //创建我的Frament
                break;
            default:
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return Constans.MAIN_FRAGENT_COUNT;
    }
}
