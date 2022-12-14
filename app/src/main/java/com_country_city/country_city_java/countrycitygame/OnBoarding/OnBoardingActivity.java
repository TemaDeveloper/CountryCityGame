package com_country_city.country_city_java.countrycitygame.OnBoarding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.airbnb.lottie.utils.Utils;
import com.google.android.material.tabs.TabLayout;

import com_country_city.country_city_java.countrycitygame.Main.HideSystemBars;
import com_country_city.country_city_java.countrycitygame.Main.MainActivity;
import com_country_city.country_city_java.countrycitygame.R;

public class OnBoardingActivity extends AppCompatActivity{

    private MyPagerAdapter mFragmentAdapter;
    private ViewPager mViewPager;
    private TabLayout mTabLayout;
    private ConstraintLayout constraintLayoutTop;

    private TextView textSkip;
    private SharedPreferences mSharedPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding);

        mFragmentAdapter = new MyPagerAdapter(getSupportFragmentManager());
        mViewPager = findViewById(R.id.view_pager_onBoarding);
        constraintLayoutTop = findViewById(R.id.cons_top);
        textSkip = findViewById(R.id.text_skip);
        mViewPager.setAdapter(mFragmentAdapter);

        // link the tabLayout and the viewpager together
        mTabLayout = findViewById(R.id.tabs_on_boarding);
        mTabLayout.setupWithViewPager(mViewPager);

        mSharedPref = getSharedPreferences("SP_ONBOARDING", MODE_PRIVATE);
        boolean isFirstTime = mSharedPref.getBoolean("firstTime", true);

        if(isFirstTime){
            SharedPreferences.Editor editor = mSharedPref.edit();
            editor.putBoolean("firstTime", false);
            editor.commit();
        }else
            startActivity(new Intent(getApplicationContext(), MainActivity.class));

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (position == 0) {
                    constraintLayoutTop.setVisibility(View.VISIBLE);
                } else if (position == 1) {
                    constraintLayoutTop.setVisibility(View.VISIBLE);
                } else {
                    constraintLayoutTop.setVisibility(View.GONE);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        textSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });

    }


    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager supportFragmentManager) {
            super(supportFragmentManager);
        }

        // Returns the fragment to display for that page
        @Override
        public Fragment getItem(int position) {
            switch(position) {
                case 0:
                    return new StepOneFragment();

                case 1:
                    return new StepTwoFragment();

                case 2:
                    return new StepThreeFragment();

                default:
                    return null;
            }
        }

        // Will be displayed as the tab's label
        @Override
        public CharSequence getPageTitle(int position) {
            return "";
        }

        // Returns total number of pages
        @Override
        public int getCount() {
            return 3;
        }

    }
}