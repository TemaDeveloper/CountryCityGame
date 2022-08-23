package com_country_city.country_city_java.countrycitygame.DifficultyLvls;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

import com_country_city.country_city_java.countrycitygame.Adapters.AdapterLightLvl;
import com_country_city.country_city_java.countrycitygame.Main.MainActivity;
import com_country_city.country_city_java.countrycitygame.Moduls.ItemLvl;
import com_country_city.country_city_java.countrycitygame.R;

public class LightLvlsActivity extends AppCompatActivity implements buildRecyclerView {

    private RecyclerView recyclerViewLightLvls;
    private AdapterLightLvl adapterLightLvl;
    private ArrayList<ItemLvl> lvls;
    private FloatingActionButton floatingActionButtonBack;

    private String scoreOP, scoreT, scoreV, scoreB, scoreAD, scoreAL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light_lvls);

        init();
        floatingActionButtonBack.setOnClickListener(value -> startActivity(new Intent(getApplicationContext(), MainActivity.class)));
    }

    private void init() {
        recyclerViewLightLvls = findViewById(R.id.recyclerView_light_lvls);
        floatingActionButtonBack = findViewById(R.id.fab_back);
        buildRecyclerView();
        setNewArrayList();
        buildArrayList();
        setNewAdapter();

    }


    @Override
    public void buildArrayList() {

        SharedPreferences sharedPreferencesScore = getSharedPreferences("SP_SCORE", MODE_PRIVATE);
        scoreOP = sharedPreferencesScore.getString("SCORE_ORDINARY_PERSON", "");
        scoreT = sharedPreferencesScore.getString("SCORE_TEACHER", "");
        scoreV = sharedPreferencesScore.getString("SCORE_VOYAGER", "");
        scoreB = sharedPreferencesScore.getString("SCORE_BUSINESSMAN", "");
        scoreAD = sharedPreferencesScore.getString("SCORE_ADVENTURER", "");
        scoreAL = sharedPreferencesScore.getString("SCORE_ALIEN", "");

        String zeroOutOfTen = "0 / 10";

        if (scoreOP.equals("")) {
            scoreOP = zeroOutOfTen;
            scoreT = zeroOutOfTen;
            scoreV = zeroOutOfTen;
            scoreB = zeroOutOfTen;
            scoreAD = zeroOutOfTen;
            scoreAL = zeroOutOfTen;
        } else if (scoreT.equals("")) {
            scoreT = zeroOutOfTen;
            scoreV = zeroOutOfTen;
            scoreB = zeroOutOfTen;
            scoreAD = zeroOutOfTen;
            scoreAL = zeroOutOfTen;
        } else if (scoreV.equals("")) {
            scoreV = zeroOutOfTen;
            scoreB = zeroOutOfTen;
            scoreAD = zeroOutOfTen;
            scoreAL = zeroOutOfTen;
        } else if (scoreB.equals("")) {
            scoreB = zeroOutOfTen;
            scoreAD = zeroOutOfTen;
            scoreAL = zeroOutOfTen;
        } else if (scoreAD.equals("")) {
            scoreAD = zeroOutOfTen;
            scoreAL = zeroOutOfTen;
        } else if (scoreAL.equals("")) {
            scoreAL = zeroOutOfTen;
        }

        lvls.add(new ItemLvl(R.drawable.img_ordinary_person_to_sholders, "Ordinary Person", scoreOP));
        lvls.add(new ItemLvl(R.drawable.img_teacher_to_sholders, "Teacher", scoreT));
        lvls.add(new ItemLvl(R.drawable.img_voyager_to_sholders, "Voyager", scoreV));
        lvls.add(new ItemLvl(R.drawable.img_businesman_to_sholders, "Businessman", scoreB));
        lvls.add(new ItemLvl(R.drawable.img_knighter_to_sholders, "Adventurer", scoreAD));
        lvls.add(new ItemLvl(R.drawable.img_alien_to_sholders, "Alien", scoreAL));


    }

    @Override
    public void buildRecyclerView() {
        recyclerViewLightLvls.setHasFixedSize(true);
        recyclerViewLightLvls.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void setNewArrayList() {
        lvls = new ArrayList<>();
    }

    @Override
    public void setNewAdapter() {
        adapterLightLvl = new AdapterLightLvl(getApplicationContext(), lvls);
        recyclerViewLightLvls.setAdapter(adapterLightLvl);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}