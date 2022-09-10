package com_country_city.country_city_java.countrycitygame.OnBoarding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

import com_country_city.country_city_java.countrycitygame.OnBoarding.OnBoardingActivity;
import com_country_city.country_city_java.countrycitygame.R;

public class SplashScreenActivity extends AppCompatActivity {

    private TextView textTitleCreator, textGQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        initFields();

        Animation animationAlphaForImg = new AlphaAnimation(0.0f, 1.0f);
        animationAlphaForImg.setDuration(2000);

        Animation animationAlphaForText = new AlphaAnimation(1.0f, 0.0f);
        animationAlphaForText.setDuration(2000);
        textTitleCreator.startAnimation(animationAlphaForText);

        animationAlphaForText.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                textGQ.setVisibility(View.VISIBLE);
                textTitleCreator.setVisibility(View.GONE);
                textGQ.startAnimation(animationAlphaForImg);
                animationAlphaForImg.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        textGQ.startAnimation(animationAlphaForText);
                        new Handler().postDelayed(new Runnable(){
                            @Override
                            public void run() {
                                /* Create an Intent that will start the Menu-Activity. */
                                startActivity(new Intent(getApplicationContext(), OnBoardingActivity.class));
                                finish();
                            }
                        }, 2000);

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }

    private void initFields(){
        textTitleCreator = findViewById(R.id.text_creator_name_title);
        textGQ = findViewById(R.id.text_GQ);
    }

}