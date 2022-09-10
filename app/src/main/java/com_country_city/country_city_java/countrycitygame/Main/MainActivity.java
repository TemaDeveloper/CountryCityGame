package com_country_city.country_city_java.countrycitygame.Main;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com_country_city.country_city_java.countrycitygame.DifficultyLvls.EasyLVLsActivity;
import com_country_city.country_city_java.countrycitygame.DifficultyLvls.InsaneLVLsActivity;
import com_country_city.country_city_java.countrycitygame.DifficultyLvls.MediumLVLsActivity;
import com_country_city.country_city_java.countrycitygame.New_LVLs.FlagsActivity;
import com_country_city.country_city_java.countrycitygame.New_LVLs.CountryCapitalLVLActivity;
import com_country_city.country_city_java.countrycitygame.New_LVLs.CurrencyLVLActivity;
import com_country_city.country_city_java.countrycitygame.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView cardViewEasyLvls, cardViewMediumLvls, cardViewInsaneLVLs,
            cardViewCurrency,
            cardDemon1, cardDemon2, cardFlags;

    private LinearLayout linLockOfMediumLVL, linLockOfInsaneLVL;

    private TextView textCurrencyScore,
                    textMedium, textMediumDescription, textInsane, textInsaneDescription,
                    textScoreDemon1, textScoreDemon2, textScoreFlags;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        SharedPreferences sharedPreferences = getSharedPreferences("SP_SCORE", MODE_PRIVATE);
        String scoreAlienForEasyLVL = sharedPreferences.getString("SCORE_ALIEN", "");
        String scoreAlienForMediumLVL = sharedPreferences.getString("MEDIUM_SCORE_ALIEN", "");
        String scoreCurrency = sharedPreferences.getString("CURRENCY", "");

        String scoreFlags = sharedPreferences.getString("FLAGS", "");
        String scoreDemon1 = sharedPreferences.getString("COUNTRY_CAPITAL_DEMON_1", "");
        String scoreDemon2 = sharedPreferences.getString("COUNTRY_CAPITAL_DEMON_2", "");

        if(scoreFlags.equals("")){
            textScoreFlags.setText("0 / 15");
        }else textScoreFlags.setText(scoreFlags);

        if(scoreDemon2.equals("")){
            textScoreDemon2.setText("0 / 15");
        }else textScoreDemon2.setText(scoreDemon2);

        if(scoreDemon1.equals("")){
            textScoreDemon1.setText("0 / 15");
        }else textScoreDemon1.setText(scoreDemon1);

        if(scoreCurrency.equals("")){
            textCurrencyScore.setText("0 / 15");
        }else textCurrencyScore.setText(scoreCurrency);


        if(!scoreAlienForEasyLVL.equals("")){
            cardViewMediumLvls.setEnabled(true);
            linLockOfMediumLVL.setVisibility(View.GONE);
            textMedium.setVisibility(View.VISIBLE);
            textMediumDescription.setVisibility(View.VISIBLE);
        }else{
            cardViewMediumLvls.setEnabled(false);
            linLockOfMediumLVL.setVisibility(View.VISIBLE);
            textMedium.setVisibility(View.INVISIBLE);
            textMediumDescription.setVisibility(View.INVISIBLE);
        }

        if(!scoreAlienForMediumLVL.equals("")){
            cardViewInsaneLVLs.setEnabled(true);
            linLockOfInsaneLVL.setVisibility(View.GONE);
            textInsane.setVisibility(View.VISIBLE);
            textInsaneDescription.setVisibility(View.VISIBLE);
        }else{
            cardViewInsaneLVLs.setEnabled(false);
            linLockOfInsaneLVL.setVisibility(View.VISIBLE);
            textInsane.setVisibility(View.INVISIBLE);
            textInsaneDescription.setVisibility(View.INVISIBLE);
        }

    }

    private void init() {
        cardViewCurrency = findViewById(R.id.card_view_currency_LVL);
        textCurrencyScore = findViewById(R.id.text_currency_score);
        textScoreFlags = findViewById(R.id.text_score_flags);

        cardDemon1 = findViewById(R.id.card_demon_1);
        cardDemon2 = findViewById(R.id.card_demon_2);
        cardFlags = findViewById(R.id.card_view_flags_LVL);

        textScoreDemon1 = findViewById(R.id.text_country_capital_score_1);
        textScoreDemon2 = findViewById(R.id.text_country_capital_score_2);

        textMedium = findViewById(R.id.text_medium);
        textInsane = findViewById(R.id.text_insane);
        textInsaneDescription = findViewById(R.id.text_insane_description);
        textMediumDescription = findViewById(R.id.text_medium_description);

        cardViewEasyLvls = findViewById(R.id.card_view_light_lvls);
        cardViewInsaneLVLs = findViewById(R.id.card_view_insane_lvls);
        linLockOfInsaneLVL = findViewById(R.id.lin_lock_of_insane_lvl);
        cardViewMediumLvls = findViewById(R.id.card_view_medium_lvls);
        linLockOfMediumLVL = findViewById(R.id.lin_lock_of_medium_lvl);

        cardViewEasyLvls.setOnClickListener(this);
        cardViewMediumLvls.setOnClickListener(this);
        cardViewInsaneLVLs.setOnClickListener(this);
        cardViewCurrency.setOnClickListener(this);
        cardDemon1.setOnClickListener(this);
        cardDemon2.setOnClickListener(this);
        cardFlags.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.card_view_flags_LVL:
                startActivity(new Intent(getApplicationContext(), FlagsActivity.class));
                break;
            case R.id.card_demon_2:
                Intent intentDemon2 = new Intent(getApplicationContext(), CountryCapitalLVLActivity.class);
                intentDemon2.putExtra("CAPITALS_DEMON", "COUNTRY_CAPITAL_DEMON_2");
                startActivity(intentDemon2);
                break;
            case R.id.card_demon_1:
                Intent intentDemon1 = new Intent(getApplicationContext(), CountryCapitalLVLActivity.class);
                intentDemon1.putExtra("CAPITALS_DEMON", "COUNTRY_CAPITAL_DEMON_1");
                startActivity(intentDemon1);
                break;
            case R.id.card_view_currency_LVL:
                startActivity(new Intent(getApplicationContext(), CurrencyLVLActivity.class));
                break;
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