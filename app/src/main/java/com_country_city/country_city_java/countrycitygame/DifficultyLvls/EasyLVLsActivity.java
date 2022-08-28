package com_country_city.country_city_java.countrycitygame.DifficultyLvls;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;

import com_country_city.country_city_java.countrycitygame.Adapters.AdapterEasyLvl;
import com_country_city.country_city_java.countrycitygame.Main.MainActivity;
import com_country_city.country_city_java.countrycitygame.Moduls.ItemLvl;
import com_country_city.country_city_java.countrycitygame.R;

public class EasyLVLsActivity extends AppCompatActivity implements buildRecyclerView {

    /*private RecyclerView recyclerViewLightLvls;
    private AdapterEasyLvl adapterLightLvl;
    private ArrayList<ItemLvl> lvls;
    private FloatingActionButton floatingActionButtonBack;

    private String scoreOP, scoreT, scoreV, scoreB, scoreAD, scoreAL;*/

    private LVLModel lvlModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_lvls);

        init();
        lvlModel.floatingActionButtonBack.setOnClickListener(value -> startActivity(new Intent(getApplicationContext(), MainActivity.class)));
    }

    private void init() {

        lvlModel = new LVLModel();

        lvlModel.recyclerViewLightLvls = findViewById(R.id.recyclerView_light_lvls);
        lvlModel.floatingActionButtonBack = findViewById(R.id.fab_back);
        buildRecyclerView();
        setNewArrayList();
        buildArrayList();
        setNewAdapter();

    }


    @Override
    public void buildArrayList() {

        SharedPreferences sharedPreferencesScore = getSharedPreferences("SP_SCORE", MODE_PRIVATE);
        lvlModel.scoreOP = sharedPreferencesScore.getString("SCORE_ORDINARY_PERSON", "");
        lvlModel.scoreT = sharedPreferencesScore.getString("SCORE_TEACHER", "");
        lvlModel.scoreV = sharedPreferencesScore.getString("SCORE_VOYAGER", "");
        lvlModel.scoreB = sharedPreferencesScore.getString("SCORE_BUSINESSMAN", "");
        lvlModel.scoreAD = sharedPreferencesScore.getString("SCORE_ADVENTURER", "");
        lvlModel.scoreAL = sharedPreferencesScore.getString("SCORE_ALIEN", "");

        String zeroOutOfTen = "0 / 10";

        if (lvlModel.scoreOP.equals("")) {
            lvlModel.scoreOP = zeroOutOfTen;
            lvlModel.scoreT = zeroOutOfTen;
            lvlModel.scoreV = zeroOutOfTen;
            lvlModel.scoreB = zeroOutOfTen;
            lvlModel.scoreAD = zeroOutOfTen;
            lvlModel.scoreAL = zeroOutOfTen;
        } else if (lvlModel.scoreT.equals("")) {
            lvlModel.scoreT = zeroOutOfTen;
            lvlModel.scoreV = zeroOutOfTen;
            lvlModel.scoreB = zeroOutOfTen;
            lvlModel.scoreAD = zeroOutOfTen;
            lvlModel.scoreAL = zeroOutOfTen;
        } else if (lvlModel.scoreV.equals("")) {
            lvlModel.scoreV = zeroOutOfTen;
            lvlModel.scoreB = zeroOutOfTen;
            lvlModel.scoreAD = zeroOutOfTen;
            lvlModel.scoreAL = zeroOutOfTen;
        } else if (lvlModel.scoreB.equals("")) {
            lvlModel.scoreB = zeroOutOfTen;
            lvlModel.scoreAD = zeroOutOfTen;
            lvlModel.scoreAL = zeroOutOfTen;
        } else if (lvlModel.scoreAD.equals("")) {
            lvlModel.scoreAD = zeroOutOfTen;
            lvlModel.scoreAL = zeroOutOfTen;
        } else if (lvlModel.scoreAL.equals("")) {
            lvlModel.scoreAL = zeroOutOfTen;
        }

        lvlModel.lvls.add(new ItemLvl(R.drawable.img_ordinary_person_to_sholders, "Ordinary Person", lvlModel.scoreOP));
        lvlModel.lvls.add(new ItemLvl(R.drawable.img_teacher_to_sholders, "Teacher", lvlModel.scoreT));
        lvlModel.lvls.add(new ItemLvl(R.drawable.img_voyager_to_sholders, "Voyager", lvlModel.scoreV));
        lvlModel.lvls.add(new ItemLvl(R.drawable.img_businesman_to_sholders, "Businessman", lvlModel.scoreB));
        lvlModel.lvls.add(new ItemLvl(R.drawable.img_knighter_to_sholders, "Adventurer", lvlModel.scoreAD));
        lvlModel.lvls.add(new ItemLvl(R.drawable.img_alien_to_sholders, "Alien", lvlModel.scoreAL));


    }

    @Override
    public void buildRecyclerView() {
        lvlModel.recyclerViewLightLvls.setHasFixedSize(true);
        lvlModel.recyclerViewLightLvls.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void setNewArrayList() {
        lvlModel.lvls = new ArrayList<>();
    }

    @Override
    public void setNewAdapter() {
        lvlModel.adapterLightLvl = new AdapterEasyLvl(getApplicationContext(), lvlModel.lvls);
        lvlModel.recyclerViewLightLvls.setAdapter(lvlModel.adapterLightLvl);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}