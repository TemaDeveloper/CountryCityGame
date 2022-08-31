package com_country_city.country_city_java.countrycitygame.Main;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com_country_city.country_city_java.countrycitygame.DifficultyLvls.EasyLVLsActivity;
import com_country_city.country_city_java.countrycitygame.DifficultyLvls.InsaneLVLsActivity;
import com_country_city.country_city_java.countrycitygame.DifficultyLvls.MediumLVLsActivity;
import com_country_city.country_city_java.countrycitygame.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView cardViewEasyLvls, cardViewMediumLvls, cardViewInsaneLVLs;
    private ImageView imgLockOfMediumLVL, imgLockOfInsaneLVL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        SharedPreferences sharedPreferences = getSharedPreferences("SP_SCORE", MODE_PRIVATE);
        String scoreAlienForEasyLVL = sharedPreferences.getString("SCORE_ALIEN", "");
        String scoreAlienForMediumLVL = sharedPreferences.getString("MEDIUM_SCORE_ALIEN", "");

        if(!scoreAlienForEasyLVL.equals("")){
            cardViewMediumLvls.setEnabled(true);
            imgLockOfMediumLVL.setVisibility(View.GONE);
        }else{
            cardViewMediumLvls.setEnabled(false);
            imgLockOfMediumLVL.setVisibility(View.VISIBLE);
        }

        if(!scoreAlienForMediumLVL.equals("")){
            cardViewInsaneLVLs.setEnabled(true);
            imgLockOfInsaneLVL.setVisibility(View.GONE);
        }else{
            cardViewInsaneLVLs.setEnabled(false);
            imgLockOfInsaneLVL.setVisibility(View.VISIBLE);
        }

    }

    private void init() {

        cardViewEasyLvls = findViewById(R.id.card_view_light_lvls);
        cardViewInsaneLVLs = findViewById(R.id.card_view_insane_lvls);
        imgLockOfInsaneLVL = findViewById(R.id.img_lock_of_insane_lvl);
        cardViewMediumLvls = findViewById(R.id.card_view_medium_lvls);
        imgLockOfMediumLVL = findViewById(R.id.img_lock_of_medium_lvl);

        cardViewEasyLvls.setOnClickListener(this);
        cardViewMediumLvls.setOnClickListener(this);
        cardViewInsaneLVLs.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.card_view_light_lvls:
                startActivity(new Intent(getApplicationContext(), EasyLVLsActivity.class));
                break;
            case R.id.card_view_medium_lvls:
                startActivity(new Intent(getApplicationContext(), MediumLVLsActivity.class));
                break;
            case R.id.card_view_insane_lvls:
                startActivity(new Intent(getApplicationContext(), InsaneLVLsActivity.class));
                break;
        }
    }
}