package com_country_city.country_city_java.countrycitygame.QestionsMatcher;

import android.content.Context;

import java.util.ArrayList;

import com_country_city.country_city_java.countrycitygame.Moduls.ItemQuestion;
import com_country_city.country_city_java.countrycitygame.R;

public class FlagQuestions {

    private ArrayList<ItemQuestion> list;
    private Context context;

    public FlagQuestions(java.util.ArrayList<ItemQuestion> listOne, Context context) {
        this.list = listOne;
        this.context = context;
    }

    public void addFlagQuestions(){
        list.add(new ItemQuestion(R.drawable.cook_islands, "", 3,
                context.getResources().getString(R.string.option_1_flag_1), context.getResources().getString(R.string.option_2_flag_1),
                context.getResources().getString(R.string.right_flag_1), context.getResources().getString(R.string.option_3_flag_1)));

        list.add(new ItemQuestion(R.drawable.cayman_islands, "", 2,
                context.getResources().getString(R.string.option_1_flag_2), context.getResources().getString(R.string.right_flag_2),
                context.getResources().getString(R.string.option_2_flag_2), context.getResources().getString(R.string.option_3_flag_2)));

        list.add(new ItemQuestion(R.drawable.brunei, "", 1,
                context.getResources().getString(R.string.right_flag_3), context.getResources().getString(R.string.option_1_flag_3),
                context.getResources().getString(R.string.option_2_flag_3), context.getResources().getString(R.string.option_3_flag_3)));

        list.add(new ItemQuestion(R.drawable.cyprus, "", 3,
                context.getResources().getString(R.string.option_1_flag_4), context.getResources().getString(R.string.option_2_flag_4),
                context.getResources().getString(R.string.right_flag_4), context.getResources().getString(R.string.option_3_flag_4)));

        list.add(new ItemQuestion(R.drawable.georgia, "", 3,
                context.getResources().getString(R.string.option_1_flag_5), context.getResources().getString(R.string.option_2_flag_5),
                context.getResources().getString(R.string.right_flag_5), context.getResources().getString(R.string.option_3_flag_5)));

        list.add(new ItemQuestion(R.drawable.haiti, "", 4,
                context.getResources().getString(R.string.option_1_flag_6), context.getResources().getString(R.string.option_2_flag_6),
                context.getResources().getString(R.string.option_3_flag_6), context.getResources().getString(R.string.right_flag_6)));

        list.add(new ItemQuestion(R.drawable.panama, "", 4,
                context.getResources().getString(R.string.option_1_flag_7), context.getResources().getString(R.string.option_2_flag_7),
                context.getResources().getString(R.string.option_3_flag_7), context.getResources().getString(R.string.right_flag_7)));

        list.add(new ItemQuestion(R.drawable.uganda, "", 2,
                context.getResources().getString(R.string.option_1_flag_8), context.getResources().getString(R.string.right_flag_8),
                context.getResources().getString(R.string.option_2_flag_8), context.getResources().getString(R.string.option_3_flag_8)));

        list.add(new ItemQuestion(R.drawable.saint_vincent_and_the_grenadines, "", 1,
                context.getResources().getString(R.string.right_flag_9), context.getResources().getString(R.string.option_1_flag_9),
                context.getResources().getString(R.string.option_2_flag_9), context.getResources().getString(R.string.option_3_flag_9)));

        list.add(new ItemQuestion(R.drawable.zambia, "", 1,
                context.getResources().getString(R.string.right_flag_10), context.getResources().getString(R.string.option_1_flag_10),
                context.getResources().getString(R.string.option_2_flag_10), context.getResources().getString(R.string.option_3_flag_10)));

        list.add(new ItemQuestion(R.drawable.saint_kitts_and_nevis, "", 4,
                context.getResources().getString(R.string.option_1_flag_11), context.getResources().getString(R.string.option_2_flag_11),
                context.getResources().getString(R.string.option_3_flag_11), context.getResources().getString(R.string.right_flag_11)));

        list.add(new ItemQuestion(R.drawable.syria, "", 3,
                context.getResources().getString(R.string.option_1_flag_12), context.getResources().getString(R.string.option_2_flag_12),
                context.getResources().getString(R.string.right_flag_12), context.getResources().getString(R.string.option_3_flag_12)));

        list.add(new ItemQuestion(R.drawable.mozambique, "", 3,
                context.getResources().getString(R.string.option_1_flag_13), context.getResources().getString(R.string.option_2_flag_13),
                context.getResources().getString(R.string.right_flag_13), context.getResources().getString(R.string.option_3_flag_13)));

        list.add(new ItemQuestion(R.drawable.qatar, "", 2,
                context.getResources().getString(R.string.option_1_flag_14), context.getResources().getString(R.string.right_flag_14),
                context.getResources().getString(R.string.option_2_flag_14), context.getResources().getString(R.string.option_3_flag_14)));

        list.add(new ItemQuestion(R.drawable.saint_lucia, "", 2,
                context.getResources().getString(R.string.option_1_flag_15), context.getResources().getString(R.string.right_flag_15),
                context.getResources().getString(R.string.option_2_flag_10), context.getResources().getString(R.string.option_3_flag_15)));
    }

}
