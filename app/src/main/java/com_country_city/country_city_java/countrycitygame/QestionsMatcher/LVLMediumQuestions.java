package com_country_city.country_city_java.countrycitygame.QestionsMatcher;

import android.content.Context;

import java.util.ArrayList;

import com_country_city.country_city_java.countrycitygame.Moduls.ItemQuestion;
import com_country_city.country_city_java.countrycitygame.R;

public class LVLMediumQuestions{

    private ArrayList<ItemQuestion> list;
    private Context context;

    public LVLMediumQuestions(ArrayList<ItemQuestion> listOne, Context context) {
        this.list = listOne;
        this.context = context;
    }

    public void addQuestionsAndOptionsForLvl1() {
        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_61), 1,
                context.getResources().getString(R.string.medium_lvl_question_61_option_1), context.getResources().getString(R.string.medium_lvl_question_61_option_2),
                context.getResources().getString(R.string.medium_lvl_question_61_option_3), context.getResources().getString(R.string.medium_lvl_question_61_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_62), 2,
                context.getResources().getString(R.string.medium_lvl_question_62_option_1), context.getResources().getString(R.string.medium_lvl_question_62_option_2),
                context.getResources().getString(R.string.medium_lvl_question_62_option_3), context.getResources().getString(R.string.medium_lvl_question_62_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_63), 4,
                context.getResources().getString(R.string.medium_lvl_question_63_option_1), context.getResources().getString(R.string.medium_lvl_question_63_option_2),
                context.getResources().getString(R.string.medium_lvl_question_63_option_3), context.getResources().getString(R.string.medium_lvl_question_63_option_4)));

        list.add(new ItemQuestion(R.drawable.img_meal_question, context.getResources().getString(R.string.medium_lvl_question_64), 2,
                context.getResources().getString(R.string.medium_lvl_question_64_option_1), context.getResources().getString(R.string.medium_lvl_question_64_option_2),
                context.getResources().getString(R.string.medium_lvl_question_64_option_3), context.getResources().getString(R.string.medium_lvl_question_64_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_65), 3,
                context.getResources().getString(R.string.medium_lvl_question_65_option_1), context.getResources().getString(R.string.medium_lvl_question_65_option_2),
                context.getResources().getString(R.string.medium_lvl_question_65_option_3), context.getResources().getString(R.string.medium_lvl_question_65_option_4)));

        list.add(new ItemQuestion(R.drawable.img_belgium_flag_question, context.getResources().getString(R.string.medium_lvl_question_66), 1,
                context.getResources().getString(R.string.medium_lvl_question_66_option_1), context.getResources().getString(R.string.medium_lvl_question_66_option_2),
                context.getResources().getString(R.string.medium_lvl_question_66_option_3), context.getResources().getString(R.string.medium_lvl_question_66_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_67), 1,
                context.getResources().getString(R.string.medium_lvl_question_67_option_1), context.getResources().getString(R.string.medium_lvl_question_67_option_2),
                context.getResources().getString(R.string.medium_lvl_question_67_option_3), context.getResources().getString(R.string.medium_lvl_question_67_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_68), 4,
                context.getResources().getString(R.string.medium_lvl_question_68_option_1), context.getResources().getString(R.string.medium_lvl_question_68_option_2),
                context.getResources().getString(R.string.medium_lvl_question_68_option_3), context.getResources().getString(R.string.medium_lvl_question_68_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_69), 4,
                context.getResources().getString(R.string.medium_lvl_question_69_option_1), context.getResources().getString(R.string.medium_lvl_question_69_option_2),
                context.getResources().getString(R.string.medium_lvl_question_69_option_3), context.getResources().getString(R.string.medium_lvl_question_69_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_70), 4,
                context.getResources().getString(R.string.medium_lvl_question_70_option_1), context.getResources().getString(R.string.medium_lvl_question_70_option_2),
                context.getResources().getString(R.string.medium_lvl_question_70_option_3), context.getResources().getString(R.string.medium_lvl_question_70_option_4)));

    }

    public void addQuestionsAndOptionsForLvl2() {
        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_71), 4,
                context.getResources().getString(R.string.medium_lvl_question_71_option_1), context.getResources().getString(R.string.medium_lvl_question_71_option_2),
                context.getResources().getString(R.string.medium_lvl_question_71_option_3), context.getResources().getString(R.string.medium_lvl_question_71_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_72), 3,
                context.getResources().getString(R.string.medium_lvl_question_72_option_1), context.getResources().getString(R.string.medium_lvl_question_72_option_2),
                context.getResources().getString(R.string.medium_lvl_question_72_option_3), context.getResources().getString(R.string.medium_lvl_question_72_option_4)));

        list.add(new ItemQuestion(R.drawable.img_japaniese_question, context.getResources().getString(R.string.medium_lvl_question_73), 1,
                context.getResources().getString(R.string.medium_lvl_question_73_option_1), context.getResources().getString(R.string.medium_lvl_question_73_option_2),
                context.getResources().getString(R.string.medium_lvl_question_73_option_3), context.getResources().getString(R.string.medium_lvl_question_73_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_74), 3,
                context.getResources().getString(R.string.medium_lvl_question_74_option_1), context.getResources().getString(R.string.medium_lvl_question_74_option_2),
                context.getResources().getString(R.string.medium_lvl_question_74_option_3), context.getResources().getString(R.string.medium_lvl_question_74_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_75), 2,
                context.getResources().getString(R.string.medium_lvl_question_75_option_1), context.getResources().getString(R.string.medium_lvl_question_75_option_2),
                context.getResources().getString(R.string.medium_lvl_question_75_option_3), context.getResources().getString(R.string.medium_lvl_question_75_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_76), 1,
                context.getResources().getString(R.string.medium_lvl_question_76_option_1), context.getResources().getString(R.string.medium_lvl_question_76_option_2),
                context.getResources().getString(R.string.medium_lvl_question_76_option_3), context.getResources().getString(R.string.medium_lvl_question_76_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_77), 4,
                context.getResources().getString(R.string.medium_lvl_question_77_option_1), context.getResources().getString(R.string.medium_lvl_question_77_option_2),
                context.getResources().getString(R.string.medium_lvl_question_77_option_3), context.getResources().getString(R.string.medium_lvl_question_77_option_4)));

        list.add(new ItemQuestion(R.drawable.img_north_america_question, context.getResources().getString(R.string.medium_lvl_question_78), 3,
                context.getResources().getString(R.string.medium_lvl_question_78_option_1), context.getResources().getString(R.string.medium_lvl_question_78_option_2),
                context.getResources().getString(R.string.medium_lvl_question_78_option_3), context.getResources().getString(R.string.medium_lvl_question_78_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_79), 2,
                context.getResources().getString(R.string.medium_lvl_question_79_option_1), context.getResources().getString(R.string.medium_lvl_question_79_option_2),
                context.getResources().getString(R.string.medium_lvl_question_79_option_3), context.getResources().getString(R.string.medium_lvl_question_79_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_80), 3,
                context.getResources().getString(R.string.medium_lvl_question_80_option_1), context.getResources().getString(R.string.medium_lvl_question_80_option_2),
                context.getResources().getString(R.string.medium_lvl_question_80_option_3), context.getResources().getString(R.string.medium_lvl_question_80_option_4)));

    }

    public void addQuestionsAndOptionsForLvl3() {
        list.add(new ItemQuestion(R.drawable.img_street_question, context.getResources().getString(R.string.medium_lvl_question_81), 4,
                context.getResources().getString(R.string.medium_lvl_question_81_option_1), context.getResources().getString(R.string.medium_lvl_question_81_option_2),
                context.getResources().getString(R.string.medium_lvl_question_81_option_3), context.getResources().getString(R.string.medium_lvl_question_81_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_82), 2,
                context.getResources().getString(R.string.medium_lvl_question_82_option_1), context.getResources().getString(R.string.medium_lvl_question_82_option_2),
                context.getResources().getString(R.string.medium_lvl_question_82_option_3), context.getResources().getString(R.string.medium_lvl_question_82_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_83), 1,
                context.getResources().getString(R.string.medium_lvl_question_83_option_1), context.getResources().getString(R.string.medium_lvl_question_83_option_2),
                context.getResources().getString(R.string.medium_lvl_question_83_option_3), context.getResources().getString(R.string.medium_lvl_question_83_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_84), 4,
                context.getResources().getString(R.string.medium_lvl_question_84_option_1), context.getResources().getString(R.string.medium_lvl_question_84_option_2),
                context.getResources().getString(R.string.medium_lvl_question_84_option_3), context.getResources().getString(R.string.medium_lvl_question_84_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_85), 3,
                context.getResources().getString(R.string.medium_lvl_question_85_option_1), context.getResources().getString(R.string.medium_lvl_question_85_option_2),
                context.getResources().getString(R.string.medium_lvl_question_85_option_3), context.getResources().getString(R.string.medium_lvl_question_85_option_4)));

        list.add(new ItemQuestion(R.drawable.img_flag_usa_question, context.getResources().getString(R.string.medium_lvl_question_86), 4,
                context.getResources().getString(R.string.medium_lvl_question_86_option_1), context.getResources().getString(R.string.medium_lvl_question_86_option_2),
                context.getResources().getString(R.string.medium_lvl_question_86_option_3), context.getResources().getString(R.string.medium_lvl_question_86_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_87), 2,
                context.getResources().getString(R.string.medium_lvl_question_87_option_1), context.getResources().getString(R.string.medium_lvl_question_87_option_2),
                context.getResources().getString(R.string.medium_lvl_question_87_option_3), context.getResources().getString(R.string.medium_lvl_question_87_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_88), 3,
                context.getResources().getString(R.string.medium_lvl_question_88_option_1), context.getResources().getString(R.string.medium_lvl_question_88_option_2),
                context.getResources().getString(R.string.medium_lvl_question_88_option_3), context.getResources().getString(R.string.medium_lvl_question_88_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_89), 2,
                context.getResources().getString(R.string.medium_lvl_question_89_option_1), context.getResources().getString(R.string.medium_lvl_question_89_option_2),
                context.getResources().getString(R.string.medium_lvl_question_89_option_3), context.getResources().getString(R.string.medium_lvl_question_89_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_90), 4,
                context.getResources().getString(R.string.medium_lvl_question_90_option_1), context.getResources().getString(R.string.medium_lvl_question_90_option_2),
                context.getResources().getString(R.string.medium_lvl_question_90_option_3), context.getResources().getString(R.string.medium_lvl_question_90_option_4)));

    }

    public void addQuestionsAndOptionsForLvl4() {
        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_91), 3,
                context.getResources().getString(R.string.medium_lvl_question_91_option_1), context.getResources().getString(R.string.medium_lvl_question_91_option_2),
                context.getResources().getString(R.string.medium_lvl_question_91_option_3), context.getResources().getString(R.string.medium_lvl_question_91_option_4)));

        list.add(new ItemQuestion(R.drawable.img_turkey_instrument_question, context.getResources().getString(R.string.medium_lvl_question_92), 2,
                context.getResources().getString(R.string.medium_lvl_question_92_option_1), context.getResources().getString(R.string.medium_lvl_question_92_option_2),
                context.getResources().getString(R.string.medium_lvl_question_92_option_3), context.getResources().getString(R.string.medium_lvl_question_92_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_93), 1,
                context.getResources().getString(R.string.medium_lvl_question_93_option_1), context.getResources().getString(R.string.medium_lvl_question_93_option_2),
                context.getResources().getString(R.string.medium_lvl_question_93_option_3), context.getResources().getString(R.string.medium_lvl_question_93_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_94), 2,
                context.getResources().getString(R.string.medium_lvl_question_94_option_1), context.getResources().getString(R.string.medium_lvl_question_94_option_2),
                context.getResources().getString(R.string.medium_lvl_question_94_option_3), context.getResources().getString(R.string.medium_lvl_question_94_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_95), 4,
                context.getResources().getString(R.string.medium_lvl_question_95_option_1), context.getResources().getString(R.string.medium_lvl_question_95_option_2),
                context.getResources().getString(R.string.medium_lvl_question_95_option_3), context.getResources().getString(R.string.medium_lvl_question_95_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_96), 3,
                context.getResources().getString(R.string.medium_lvl_question_96_option_1), context.getResources().getString(R.string.medium_lvl_question_96_option_2),
                context.getResources().getString(R.string.medium_lvl_question_96_option_3), context.getResources().getString(R.string.medium_lvl_question_96_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_97), 1,
                context.getResources().getString(R.string.medium_lvl_question_97_option_1), context.getResources().getString(R.string.medium_lvl_question_97_option_2),
                context.getResources().getString(R.string.medium_lvl_question_97_option_3), context.getResources().getString(R.string.medium_lvl_question_97_option_4)));

        list.add(new ItemQuestion(R.drawable.img_new_zeelnd_question, context.getResources().getString(R.string.medium_lvl_question_98), 3,
                context.getResources().getString(R.string.medium_lvl_question_98_option_1), context.getResources().getString(R.string.medium_lvl_question_98_option_2),
                context.getResources().getString(R.string.medium_lvl_question_98_option_3), context.getResources().getString(R.string.medium_lvl_question_98_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_99), 1,
                context.getResources().getString(R.string.medium_lvl_question_99_option_1), context.getResources().getString(R.string.medium_lvl_question_99_option_2),
                context.getResources().getString(R.string.medium_lvl_question_99_option_3), context.getResources().getString(R.string.medium_lvl_question_99_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_100), 2,
                context.getResources().getString(R.string.medium_lvl_question_100_option_1), context.getResources().getString(R.string.medium_lvl_question_100_option_2),
                context.getResources().getString(R.string.medium_lvl_question_100_option_3), context.getResources().getString(R.string.medium_lvl_question_100_option_4)));

    }

    public void addQuestionsAndOptionsForLvl5() {
        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_101), 4,
                context.getResources().getString(R.string.medium_lvl_question_101_option_1), context.getResources().getString(R.string.medium_lvl_question_101_option_2),
                context.getResources().getString(R.string.medium_lvl_question_101_option_3), context.getResources().getString(R.string.medium_lvl_question_101_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_102), 1,
                context.getResources().getString(R.string.medium_lvl_question_102_option_1), context.getResources().getString(R.string.medium_lvl_question_102_option_2),
                context.getResources().getString(R.string.medium_lvl_question_102_option_3), context.getResources().getString(R.string.medium_lvl_question_102_option_4)));

        list.add(new ItemQuestion(R.drawable.img_map_north_a_question, context.getResources().getString(R.string.medium_lvl_question_103), 2,
                context.getResources().getString(R.string.medium_lvl_question_103_option_1), context.getResources().getString(R.string.medium_lvl_question_103_option_2),
                context.getResources().getString(R.string.medium_lvl_question_103_option_3), context.getResources().getString(R.string.medium_lvl_question_103_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_104), 4,
                context.getResources().getString(R.string.medium_lvl_question_104_option_1), context.getResources().getString(R.string.medium_lvl_question_104_option_2),
                context.getResources().getString(R.string.medium_lvl_question_104_option_3), context.getResources().getString(R.string.medium_lvl_question_104_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_105), 3,
                context.getResources().getString(R.string.medium_lvl_question_105_option_1), context.getResources().getString(R.string.medium_lvl_question_105_option_2),
                context.getResources().getString(R.string.medium_lvl_question_105_option_3), context.getResources().getString(R.string.medium_lvl_question_105_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_106), 1,
                context.getResources().getString(R.string.medium_lvl_question_106_option_1), context.getResources().getString(R.string.medium_lvl_question_106_option_2),
                context.getResources().getString(R.string.medium_lvl_question_106_option_3), context.getResources().getString(R.string.medium_lvl_question_106_option_4)));

        list.add(new ItemQuestion(R.drawable.img_yak_question, context.getResources().getString(R.string.medium_lvl_question_107), 4,
                context.getResources().getString(R.string.medium_lvl_question_107_option_1), context.getResources().getString(R.string.medium_lvl_question_107_option_2),
                context.getResources().getString(R.string.medium_lvl_question_107_option_3), context.getResources().getString(R.string.medium_lvl_question_107_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_108), 3,
                context.getResources().getString(R.string.medium_lvl_question_108_option_1), context.getResources().getString(R.string.medium_lvl_question_108_option_2),
                context.getResources().getString(R.string.medium_lvl_question_108_option_3), context.getResources().getString(R.string.medium_lvl_question_108_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_109), 1,
                context.getResources().getString(R.string.medium_lvl_question_109_option_1), context.getResources().getString(R.string.medium_lvl_question_109_option_2),
                context.getResources().getString(R.string.medium_lvl_question_109_option_3), context.getResources().getString(R.string.medium_lvl_question_109_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_110), 2,
                context.getResources().getString(R.string.medium_lvl_question_110_option_1), context.getResources().getString(R.string.medium_lvl_question_110_option_2),
                context.getResources().getString(R.string.medium_lvl_question_110_option_3), context.getResources().getString(R.string.medium_lvl_question_110_option_4)));

    }

    public void addQuestionsAndOptionsForLvl6() {
        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_111), 4,
                context.getResources().getString(R.string.medium_lvl_question_111_option_1), context.getResources().getString(R.string.medium_lvl_question_111_option_2),
                context.getResources().getString(R.string.medium_lvl_question_111_option_3), context.getResources().getString(R.string.medium_lvl_question_111_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_112), 3,
                context.getResources().getString(R.string.medium_lvl_question_112_option_1), context.getResources().getString(R.string.medium_lvl_question_112_option_2),
                context.getResources().getString(R.string.medium_lvl_question_112_option_3), context.getResources().getString(R.string.medium_lvl_question_112_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_113), 1,
                context.getResources().getString(R.string.medium_lvl_question_113_option_1), context.getResources().getString(R.string.medium_lvl_question_113_option_2),
                context.getResources().getString(R.string.medium_lvl_question_113_option_3), context.getResources().getString(R.string.medium_lvl_question_113_option_4)));

        list.add(new ItemQuestion(R.drawable.img_junisef_question, context.getResources().getString(R.string.medium_lvl_question_114), 2,
                context.getResources().getString(R.string.medium_lvl_question_114_option_1), context.getResources().getString(R.string.medium_lvl_question_114_option_2),
                context.getResources().getString(R.string.medium_lvl_question_114_option_3), context.getResources().getString(R.string.medium_lvl_question_114_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_115), 3,
                context.getResources().getString(R.string.medium_lvl_question_115_option_1), context.getResources().getString(R.string.medium_lvl_question_115_option_2),
                context.getResources().getString(R.string.medium_lvl_question_115_option_3), context.getResources().getString(R.string.medium_lvl_question_115_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_116), 4,
                context.getResources().getString(R.string.medium_lvl_question_116_option_1), context.getResources().getString(R.string.medium_lvl_question_116_option_2),
                context.getResources().getString(R.string.medium_lvl_question_116_option_3), context.getResources().getString(R.string.medium_lvl_question_116_option_4)));

        list.add(new ItemQuestion(R.drawable.img_yak_question, context.getResources().getString(R.string.medium_lvl_question_117), 2,
                context.getResources().getString(R.string.medium_lvl_question_117_option_1), context.getResources().getString(R.string.medium_lvl_question_117_option_2),
                context.getResources().getString(R.string.medium_lvl_question_117_option_3), context.getResources().getString(R.string.medium_lvl_question_117_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_118), 4,
                context.getResources().getString(R.string.medium_lvl_question_118_option_1), context.getResources().getString(R.string.medium_lvl_question_118_option_2),
                context.getResources().getString(R.string.medium_lvl_question_118_option_3), context.getResources().getString(R.string.medium_lvl_question_118_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_119), 2,
                context.getResources().getString(R.string.medium_lvl_question_119_option_1), context.getResources().getString(R.string.medium_lvl_question_119_option_2),
                context.getResources().getString(R.string.medium_lvl_question_119_option_3), context.getResources().getString(R.string.medium_lvl_question_119_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.medium_lvl_question_120), 1,
                context.getResources().getString(R.string.medium_lvl_question_120_option_1), context.getResources().getString(R.string.medium_lvl_question_120_option_2),
                context.getResources().getString(R.string.medium_lvl_question_120_option_3), context.getResources().getString(R.string.medium_lvl_question_120_option_4)));

    }

}
