package com_country_city.country_city_java.countrycitygame.Main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import com_country_city.country_city_java.countrycitygame.Moduls.ItemLvl;
import com_country_city.country_city_java.countrycitygame.R;

public class FinishActivity extends AppCompatActivity {

    private MaterialButton btnGoToMenuFromFinish;
    private TextView textScore;
    private String score, lvlTitle;

    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        initFields();

        score = getIntent().getStringExtra("scoreIntent");
        lvlTitle = getIntent().getStringExtra("lvlTitle");

        textScore.setText(score + " / 10");

        btnGoToMenuFromFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveScore();
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });

    }

    private void initFields(){
        btnGoToMenuFromFinish = findViewById(R.id.btn_go_to_menu_from_finish);
        textScore = findViewById(R.id.text_score);
        sharedPreferences = getSharedPreferences("SP_SCORE", MODE_PRIVATE);
    }

    private void saveScore(){
        SharedPreferences.Editor editorSP = sharedPreferences.edit();
        //put data in shared pref
        switch(lvlTitle){
            case "1.Ordinary Person":
                editorSP.putString("SCORE_ORDINARY_PERSON", score + " / 10");
                break;
            case "2.Teacher":
                editorSP.putString("SCORE_TEACHER", score + " / 10");
                break;
            case "3.Voyager":
                editorSP.putString("SCORE_VOYAGER", score + " / 10");
                break;
            case "4.Businessman":
                editorSP.putString("SCORE_BUSINESSMAN", score + " / 10");
                break;
            case "5.Adventurer":
                editorSP.putString("SCORE_ADVENTURER", score + " / 10");
                break;
            case "6.Alien":
                editorSP.putString("SCORE_ALIEN", score + " / 10");
                break;
        }
        editorSP.apply();




    }

}