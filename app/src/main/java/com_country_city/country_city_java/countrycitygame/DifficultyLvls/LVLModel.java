package com_country_city.country_city_java.countrycitygame.DifficultyLvls;

import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

import com_country_city.country_city_java.countrycitygame.Adapters.AdapterEasyLvl;
import com_country_city.country_city_java.countrycitygame.Adapters.AdapterMediumLvl;
import com_country_city.country_city_java.countrycitygame.Moduls.ItemLvl;

public class LVLModel {

    public RecyclerView recyclerViewLightLvls;
    public AdapterEasyLvl adapterLightLvl;

    public AdapterMediumLvl adapterMediumLvl;

    public ArrayList<ItemLvl> lvls;
    public FloatingActionButton floatingActionButtonBack;
    public String scoreOP, scoreT, scoreV, scoreB, scoreAD, scoreAL;

}
