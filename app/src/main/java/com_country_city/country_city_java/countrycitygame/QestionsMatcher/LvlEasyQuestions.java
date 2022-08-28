package com_country_city.country_city_java.countrycitygame.QestionsMatcher;

import android.content.Context;

import java.util.ArrayList;
import java.util.Random;

import com_country_city.country_city_java.countrycitygame.Moduls.ItemQuestion;
import com_country_city.country_city_java.countrycitygame.R;

public class LvlEasyQuestions {

    private ArrayList<ItemQuestion> list;
    private Context context;

    public LvlEasyQuestions(ArrayList<ItemQuestion> listOne, Context context) {
        this.list = listOne;
        this.context = context;
    }

    public void addQuestionsAndOptionsForLvl1() {
        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_1), 3,
                context.getResources().getString(R.string.easy_lvl_question_1_option_1), context.getResources().getString(R.string.easy_lvl_question_1_option_2),
                context.getResources().getString(R.string.easy_lvl_question_1_option_3), context.getResources().getString(R.string.easy_lvl_question_1_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_2), 2,
                context.getResources().getString(R.string.easy_lvl_question_2_option_1), context.getResources().getString(R.string.easy_lvl_question_2_option_2),
                context.getResources().getString(R.string.easy_lvl_question_2_option_3), context.getResources().getString(R.string.easy_lvl_question_2_option_4)));

        list.add(new ItemQuestion(R.drawable.img_compas_question, context.getResources().getString(R.string.easy_lvl_question_3), 1,
                context.getResources().getString(R.string.easy_lvl_question_3_option_1), context.getResources().getString(R.string.easy_lvl_question_3_option_2),
                context.getResources().getString(R.string.easy_lvl_question_3_option_3), context.getResources().getString(R.string.easy_lvl_question_3_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_4), 4,
                context.getResources().getString(R.string.easy_lvl_question_4_option_1), context.getResources().getString(R.string.easy_lvl_question_4_option_2),
                context.getResources().getString(R.string.easy_lvl_question_4_option_3), context.getResources().getString(R.string.easy_lvl_question_4_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_5), 2,
                context.getResources().getString(R.string.easy_lvl_question_5_option_1), context.getResources().getString(R.string.easy_lvl_question_5_option_2),
                context.getResources().getString(R.string.easy_lvl_question_5_option_3), context.getResources().getString(R.string.easy_lvl_question_5_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_6), 2,
                context.getResources().getString(R.string.easy_lvl_question_6_option_1), context.getResources().getString(R.string.easy_lvl_question_6_option_2),
                context.getResources().getString(R.string.easy_lvl_question_6_option_3), context.getResources().getString(R.string.easy_lvl_question_6_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_7), 1,
                context.getResources().getString(R.string.easy_lvl_question_7_option_1), context.getResources().getString(R.string.easy_lvl_question_7_option_2),
                context.getResources().getString(R.string.easy_lvl_question_7_option_3), context.getResources().getString(R.string.easy_lvl_question_7_option_4)));

        list.add(new ItemQuestion(R.drawable.img_australia_question, context.getResources().getString(R.string.easy_lvl_question_8), 1,
                context.getResources().getString(R.string.easy_lvl_question_8_option_1), context.getResources().getString(R.string.easy_lvl_question_8_option_2),
                context.getResources().getString(R.string.easy_lvl_question_8_option_3), context.getResources().getString(R.string.easy_lvl_question_8_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_9), 4,
                context.getResources().getString(R.string.easy_lvl_question_9_option_1), context.getResources().getString(R.string.easy_lvl_question_9_option_2),
                context.getResources().getString(R.string.easy_lvl_question_9_option_3), context.getResources().getString(R.string.easy_lvl_question_9_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_10), 3,
                context.getResources().getString(R.string.easy_lvl_question_10_option_1), context.getResources().getString(R.string.easy_lvl_question_10_option_2),
                context.getResources().getString(R.string.easy_lvl_question_10_option_3), context.getResources().getString(R.string.easy_lvl_question_10_option_4)));

    }


    public void addQuestionsAndOptionsForLvl2() {
        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_11), 3,
                context.getResources().getString(R.string.easy_lvl_question_11_option_1), context.getResources().getString(R.string.easy_lvl_question_11_option_2),
                context.getResources().getString(R.string.easy_lvl_question_11_option_3), context.getResources().getString(R.string.easy_lvl_question_11_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_12), 2,
                context.getResources().getString(R.string.easy_lvl_question_12_option_1), context.getResources().getString(R.string.easy_lvl_question_12_option_2),
                context.getResources().getString(R.string.easy_lvl_question_12_option_3), context.getResources().getString(R.string.easy_lvl_question_12_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_13), 2,
                context.getResources().getString(R.string.easy_lvl_question_13_option_1), context.getResources().getString(R.string.easy_lvl_question_13_option_2),
                context.getResources().getString(R.string.easy_lvl_question_13_option_3), context.getResources().getString(R.string.easy_lvl_question_13_option_4)));

        list.add(new ItemQuestion(R.drawable.img_litening, context.getResources().getString(R.string.easy_lvl_question_14), 4,
                context.getResources().getString(R.string.easy_lvl_question_14_option_1), context.getResources().getString(R.string.easy_lvl_question_14_option_2),
                context.getResources().getString(R.string.easy_lvl_question_14_option_3), context.getResources().getString(R.string.easy_lvl_question_14_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_15), 2,
                context.getResources().getString(R.string.easy_lvl_question_15_option_1), context.getResources().getString(R.string.easy_lvl_question_15_option_2),
                context.getResources().getString(R.string.easy_lvl_question_15_option_3), context.getResources().getString(R.string.easy_lvl_question_15_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_16), 4,
                context.getResources().getString(R.string.easy_lvl_question_16_option_1), context.getResources().getString(R.string.easy_lvl_question_16_option_2),
                context.getResources().getString(R.string.easy_lvl_question_16_option_3), context.getResources().getString(R.string.easy_lvl_question_16_option_4)));

        list.add(new ItemQuestion(R.drawable.img_sign_africa, context.getResources().getString(R.string.easy_lvl_question_17), 1,
                context.getResources().getString(R.string.easy_lvl_question_17_option_1), context.getResources().getString(R.string.easy_lvl_question_17_option_2),
                context.getResources().getString(R.string.easy_lvl_question_17_option_3), context.getResources().getString(R.string.easy_lvl_question_17_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_18), 4,
                context.getResources().getString(R.string.easy_lvl_question_18_option_1), context.getResources().getString(R.string.easy_lvl_question_18_option_2),
                context.getResources().getString(R.string.easy_lvl_question_18_option_3), context.getResources().getString(R.string.easy_lvl_question_18_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_19), 3,
                context.getResources().getString(R.string.easy_lvl_question_19_option_1), context.getResources().getString(R.string.easy_lvl_question_19_option_2),
                context.getResources().getString(R.string.easy_lvl_question_19_option_3), context.getResources().getString(R.string.easy_lvl_question_19_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_20), 2,
                context.getResources().getString(R.string.easy_lvl_question_20_option_1), context.getResources().getString(R.string.easy_lvl_question_20_option_2),
                context.getResources().getString(R.string.easy_lvl_question_20_option_3), context.getResources().getString(R.string.easy_lvl_question_20_option_4)));
    }

    public void addQuestionsAndOptionsForLvl3() {

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_21), 3,
                context.getResources().getString(R.string.easy_lvl_question_21_option_1), context.getResources().getString(R.string.easy_lvl_question_21_option_2),
                context.getResources().getString(R.string.easy_lvl_question_21_option_3), context.getResources().getString(R.string.easy_lvl_question_21_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_22), 1,
                context.getResources().getString(R.string.easy_lvl_question_22_option_1), context.getResources().getString(R.string.easy_lvl_question_22_option_2),
                context.getResources().getString(R.string.easy_lvl_question_22_option_3), context.getResources().getString(R.string.easy_lvl_question_22_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_23), 3,
                context.getResources().getString(R.string.easy_lvl_question_23_option_1), context.getResources().getString(R.string.easy_lvl_question_23_option_2),
                context.getResources().getString(R.string.easy_lvl_question_23_option_3), context.getResources().getString(R.string.easy_lvl_question_23_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_24), 4,
                context.getResources().getString(R.string.easy_lvl_question_24_option_1), context.getResources().getString(R.string.easy_lvl_question_24_option_2),
                context.getResources().getString(R.string.easy_lvl_question_24_option_3), context.getResources().getString(R.string.easy_lvl_question_24_option_4)));

        list.add(new ItemQuestion(R.drawable.img_forest, context.getResources().getString(R.string.easy_lvl_question_25), 2,
                context.getResources().getString(R.string.easy_lvl_question_25_option_1), context.getResources().getString(R.string.easy_lvl_question_25_option_2),
                context.getResources().getString(R.string.easy_lvl_question_25_option_3), context.getResources().getString(R.string.easy_lvl_question_25_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_26), 3,
                context.getResources().getString(R.string.easy_lvl_question_26_option_1), context.getResources().getString(R.string.easy_lvl_question_26_option_2),
                context.getResources().getString(R.string.easy_lvl_question_26_option_3), context.getResources().getString(R.string.easy_lvl_question_26_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_27), 2,
                context.getResources().getString(R.string.easy_lvl_question_27_option_1), context.getResources().getString(R.string.easy_lvl_question_27_option_2),
                context.getResources().getString(R.string.easy_lvl_question_27_option_3), context.getResources().getString(R.string.easy_lvl_question_27_option_4)));

        list.add(new ItemQuestion(R.drawable.img_columb, context.getResources().getString(R.string.easy_lvl_question_28), 4,
                context.getResources().getString(R.string.easy_lvl_question_28_option_1), context.getResources().getString(R.string.easy_lvl_question_28_option_2),
                context.getResources().getString(R.string.easy_lvl_question_28_option_3), context.getResources().getString(R.string.easy_lvl_question_28_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_29), 2,
                context.getResources().getString(R.string.easy_lvl_question_29_option_1), context.getResources().getString(R.string.easy_lvl_question_29_option_2),
                context.getResources().getString(R.string.easy_lvl_question_29_option_3), context.getResources().getString(R.string.easy_lvl_question_29_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_20), 1,
                context.getResources().getString(R.string.easy_lvl_question_30_option_1), context.getResources().getString(R.string.easy_lvl_question_30_option_2),
                context.getResources().getString(R.string.easy_lvl_question_30_option_3), context.getResources().getString(R.string.easy_lvl_question_30_option_4)));

    }

    public void addQuestionsAndOptionsForLvl4() {

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_31), 1,
                context.getResources().getString(R.string.easy_lvl_question_31_option_1), context.getResources().getString(R.string.easy_lvl_question_31_option_2),
                context.getResources().getString(R.string.easy_lvl_question_31_option_3), context.getResources().getString(R.string.easy_lvl_question_31_option_4)));

        list.add(new ItemQuestion(R.drawable.img_japan_flag, context.getResources().getString(R.string.easy_lvl_question_32), 3,
                context.getResources().getString(R.string.easy_lvl_question_32_option_1), context.getResources().getString(R.string.easy_lvl_question_32_option_2),
                context.getResources().getString(R.string.easy_lvl_question_32_option_3), context.getResources().getString(R.string.easy_lvl_question_32_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_33), 4,
                context.getResources().getString(R.string.easy_lvl_question_33_option_1), context.getResources().getString(R.string.easy_lvl_question_33_option_2),
                context.getResources().getString(R.string.easy_lvl_question_33_option_3), context.getResources().getString(R.string.easy_lvl_question_33_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_34), 2,
                context.getResources().getString(R.string.easy_lvl_question_34_option_1), context.getResources().getString(R.string.easy_lvl_question_34_option_2),
                context.getResources().getString(R.string.easy_lvl_question_34_option_3), context.getResources().getString(R.string.easy_lvl_question_34_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_35), 2,
                context.getResources().getString(R.string.easy_lvl_question_35_option_1), context.getResources().getString(R.string.easy_lvl_question_35_option_2),
                context.getResources().getString(R.string.easy_lvl_question_35_option_3), context.getResources().getString(R.string.easy_lvl_question_35_option_4)));

        list.add(new ItemQuestion(R.drawable.img_map_north_america, context.getResources().getString(R.string.easy_lvl_question_36), 1,
                context.getResources().getString(R.string.easy_lvl_question_36_option_1), context.getResources().getString(R.string.easy_lvl_question_36_option_2),
                context.getResources().getString(R.string.easy_lvl_question_36_option_3), context.getResources().getString(R.string.easy_lvl_question_36_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_37), 3,
                context.getResources().getString(R.string.easy_lvl_question_37_option_1), context.getResources().getString(R.string.easy_lvl_question_37_option_2),
                context.getResources().getString(R.string.easy_lvl_question_37_option_3), context.getResources().getString(R.string.easy_lvl_question_37_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_38), 1,
                context.getResources().getString(R.string.easy_lvl_question_38_option_1), context.getResources().getString(R.string.easy_lvl_question_38_option_2),
                context.getResources().getString(R.string.easy_lvl_question_38_option_3), context.getResources().getString(R.string.easy_lvl_question_38_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_39), 4,
                context.getResources().getString(R.string.easy_lvl_question_39_option_1), context.getResources().getString(R.string.easy_lvl_question_39_option_2),
                context.getResources().getString(R.string.easy_lvl_question_39_option_3), context.getResources().getString(R.string.easy_lvl_question_39_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_40), 3,
                context.getResources().getString(R.string.easy_lvl_question_40_option_1), context.getResources().getString(R.string.easy_lvl_question_40_option_2),
                context.getResources().getString(R.string.easy_lvl_question_40_option_3), context.getResources().getString(R.string.easy_lvl_question_40_option_4)));

    }

    public void addQuestionsAndOptionsForLvl5() {

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_41), 2,
                context.getResources().getString(R.string.easy_lvl_question_41_option_1), context.getResources().getString(R.string.easy_lvl_question_41_option_2),
                context.getResources().getString(R.string.easy_lvl_question_41_option_3), context.getResources().getString(R.string.easy_lvl_question_41_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_42), 3,
                context.getResources().getString(R.string.easy_lvl_question_42_option_1), context.getResources().getString(R.string.easy_lvl_question_42_option_2),
                context.getResources().getString(R.string.easy_lvl_question_42_option_3), context.getResources().getString(R.string.easy_lvl_question_42_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_43), 2,
                context.getResources().getString(R.string.easy_lvl_question_43_option_1), context.getResources().getString(R.string.easy_lvl_question_43_option_2),
                context.getResources().getString(R.string.easy_lvl_question_43_option_3), context.getResources().getString(R.string.easy_lvl_question_43_option_4)));

        list.add(new ItemQuestion(R.drawable.img_blowing_up, context.getResources().getString(R.string.easy_lvl_question_44), 4,
                context.getResources().getString(R.string.easy_lvl_question_44_option_1), context.getResources().getString(R.string.easy_lvl_question_44_option_2),
                context.getResources().getString(R.string.easy_lvl_question_44_option_3), context.getResources().getString(R.string.easy_lvl_question_44_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_45), 1,
                context.getResources().getString(R.string.easy_lvl_question_45_option_1), context.getResources().getString(R.string.easy_lvl_question_45_option_2),
                context.getResources().getString(R.string.easy_lvl_question_45_option_3), context.getResources().getString(R.string.easy_lvl_question_45_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_46), 2,
                context.getResources().getString(R.string.easy_lvl_question_46_option_1), context.getResources().getString(R.string.easy_lvl_question_46_option_2),
                context.getResources().getString(R.string.easy_lvl_question_46_option_3), context.getResources().getString(R.string.easy_lvl_question_46_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_47), 3,
                context.getResources().getString(R.string.easy_lvl_question_47_option_1), context.getResources().getString(R.string.easy_lvl_question_47_option_2),
                context.getResources().getString(R.string.easy_lvl_question_47_option_3), context.getResources().getString(R.string.easy_lvl_question_47_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_48), 4,
                context.getResources().getString(R.string.easy_lvl_question_48_option_1), context.getResources().getString(R.string.easy_lvl_question_48_option_2),
                context.getResources().getString(R.string.easy_lvl_question_48_option_3), context.getResources().getString(R.string.easy_lvl_question_48_option_4)));

        list.add(new ItemQuestion(R.drawable.img_pizanskay, context.getResources().getString(R.string.easy_lvl_question_49), 2,
                context.getResources().getString(R.string.easy_lvl_question_49_option_1), context.getResources().getString(R.string.easy_lvl_question_49_option_2),
                context.getResources().getString(R.string.easy_lvl_question_49_option_3), context.getResources().getString(R.string.easy_lvl_question_49_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_50), 3,
                context.getResources().getString(R.string.easy_lvl_question_50_option_1), context.getResources().getString(R.string.easy_lvl_question_50_option_2),
                context.getResources().getString(R.string.easy_lvl_question_50_option_3), context.getResources().getString(R.string.easy_lvl_question_50_option_4)));

    }

    public void addQuestionsAndOptionsForLvl6() {

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_51), 4,
                context.getResources().getString(R.string.easy_lvl_question_51_option_1), context.getResources().getString(R.string.easy_lvl_question_51_option_2),
                context.getResources().getString(R.string.easy_lvl_question_51_option_3), context.getResources().getString(R.string.easy_lvl_question_51_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_52), 1,
                context.getResources().getString(R.string.easy_lvl_question_52_option_1), context.getResources().getString(R.string.easy_lvl_question_52_option_2),
                context.getResources().getString(R.string.easy_lvl_question_52_option_3), context.getResources().getString(R.string.easy_lvl_question_52_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_53), 2,
                context.getResources().getString(R.string.easy_lvl_question_53_option_1), context.getResources().getString(R.string.easy_lvl_question_53_option_2),
                context.getResources().getString(R.string.easy_lvl_question_53_option_3), context.getResources().getString(R.string.easy_lvl_question_53_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_54), 4,
                context.getResources().getString(R.string.easy_lvl_question_54_option_1), context.getResources().getString(R.string.easy_lvl_question_54_option_2),
                context.getResources().getString(R.string.easy_lvl_question_54_option_3), context.getResources().getString(R.string.easy_lvl_question_54_option_4)));

        list.add(new ItemQuestion(R.drawable.img_penguins, context.getResources().getString(R.string.easy_lvl_question_55), 2,
                context.getResources().getString(R.string.easy_lvl_question_55_option_1), context.getResources().getString(R.string.easy_lvl_question_55_option_2),
                context.getResources().getString(R.string.easy_lvl_question_55_option_3), context.getResources().getString(R.string.easy_lvl_question_55_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_56), 3,
                context.getResources().getString(R.string.easy_lvl_question_56_option_1), context.getResources().getString(R.string.easy_lvl_question_56_option_2),
                context.getResources().getString(R.string.easy_lvl_question_56_option_3), context.getResources().getString(R.string.easy_lvl_question_56_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_57), 1,
                context.getResources().getString(R.string.easy_lvl_question_57_option_1), context.getResources().getString(R.string.easy_lvl_question_57_option_2),
                context.getResources().getString(R.string.easy_lvl_question_57_option_3), context.getResources().getString(R.string.easy_lvl_question_57_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_58), 1,
                context.getResources().getString(R.string.easy_lvl_question_58_option_1), context.getResources().getString(R.string.easy_lvl_question_58_option_2),
                context.getResources().getString(R.string.easy_lvl_question_58_option_3), context.getResources().getString(R.string.easy_lvl_question_58_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.easy_lvl_question_59), 2,
                context.getResources().getString(R.string.easy_lvl_question_59_option_1), context.getResources().getString(R.string.easy_lvl_question_59_option_2),
                context.getResources().getString(R.string.easy_lvl_question_59_option_3), context.getResources().getString(R.string.easy_lvl_question_59_option_4)));

        list.add(new ItemQuestion(R.drawable.img_shoe, context.getResources().getString(R.string.easy_lvl_question_60), 4,
                context.getResources().getString(R.string.easy_lvl_question_60_option_1), context.getResources().getString(R.string.easy_lvl_question_60_option_2),
                context.getResources().getString(R.string.easy_lvl_question_60_option_3), context.getResources().getString(R.string.easy_lvl_question_60_option_4)));

    }


}
