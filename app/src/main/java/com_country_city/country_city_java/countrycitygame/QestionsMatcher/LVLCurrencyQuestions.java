package com_country_city.country_city_java.countrycitygame.QestionsMatcher;

import android.content.Context;

import java.util.ArrayList;

import com_country_city.country_city_java.countrycitygame.Moduls.ItemQuestion;
import com_country_city.country_city_java.countrycitygame.R;

public class LVLCurrencyQuestions {
    private ArrayList<ItemQuestion> list;
    private Context context;

    public LVLCurrencyQuestions(java.util.ArrayList<ItemQuestion> listOne, Context context) {
        this.list = listOne;
        this.context = context;
    }

    public void addQuestionsCurrency() {
        list.add(new ItemQuestion(0, context.getResources().getString(R.string.currency_lvl_question_1), 3,
                "₴", "₱",
                "$", "₨"));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.currency_lvl_question_2), 2,
                "₿", "¢",
                "₳", "Ð"));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.currency_lvl_question_3), 1,
                "€", "₴",
                "₵", "≋"));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.currency_lvl_question_4), 4,
                "₭", "₲",
                "៛", "£"));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.currency_lvl_question_5), 2,
                "₫", "¥",
                "﷼", "₲"));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.currency_lvl_question_6), 2,
                "₳", "₩",
                "₪", "₱"));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.currency_lvl_question_7), 1,
                "₽", "₦",
                "$", "₩"));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.currency_lvl_question_8), 1,
                "₹", "﷼",
                "Ł", "₳"));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.currency_lvl_question_9), 4,
                "₲", "$",
                "€", "¤"));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.currency_lvl_question_10), 3,
                "₨", "៛",
                "₱", "ƒ"));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.currency_lvl_question_11), 1,
                "₦", "௹",
                "৲", "₫"));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.currency_lvl_question_12), 4,
                "﷼", "৲",
                "¥", "ƒ"));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.currency_lvl_question_13), 2,
                "௹", "₮",
                "₪", "₩"));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.currency_lvl_question_14), 2,
                "₲", "৲",
                "៛", "¥"));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.currency_lvl_question_15), 1,
                "௹", "Ł",
                "₫", "$"));


    }
}
