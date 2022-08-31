package com_country_city.country_city_java.countrycitygame.QestionsMatcher;

import android.content.Context;

import java.util.ArrayList;

import com_country_city.country_city_java.countrycitygame.Moduls.ItemQuestion;
import com_country_city.country_city_java.countrycitygame.R;

public class LVLInsaneQuestions {

    private ArrayList<ItemQuestion> list;
    private Context context;

    public LVLInsaneQuestions(ArrayList<ItemQuestion> listOne, Context context) {
        this.list = listOne;
        this.context = context;
    }

    public void addQuestionsAndOptionsForLvl1() {
        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_121), 3,
                context.getResources().getString(R.string.insane_lvl_question_121_option_1), context.getResources().getString(R.string.insane_lvl_question_121_option_2),
                context.getResources().getString(R.string.insane_lvl_question_121_option_3), context.getResources().getString(R.string.insane_lvl_question_121_option_4)));

        list.add(new ItemQuestion(R.drawable.img_venecia_question, context.getResources().getString(R.string.insane_lvl_question_122), 2,
                context.getResources().getString(R.string.insane_lvl_question_122_option_1), context.getResources().getString(R.string.insane_lvl_question_122_option_2),
                context.getResources().getString(R.string.insane_lvl_question_122_option_3), context.getResources().getString(R.string.insane_lvl_question_122_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_123), 4,
                context.getResources().getString(R.string.insane_lvl_question_123_option_1), context.getResources().getString(R.string.insane_lvl_question_123_option_2),
                context.getResources().getString(R.string.insane_lvl_question_123_option_3), context.getResources().getString(R.string.insane_lvl_question_123_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_124), 3,
                context.getResources().getString(R.string.insane_lvl_question_124_option_1), context.getResources().getString(R.string.insane_lvl_question_124_option_2),
                context.getResources().getString(R.string.insane_lvl_question_124_option_3), context.getResources().getString(R.string.insane_lvl_question_124_option_4)));

        list.add(new ItemQuestion(R.drawable.img_palase_question, context.getResources().getString(R.string.insane_lvl_question_125), 2,
                context.getResources().getString(R.string.insane_lvl_question_125_option_1), context.getResources().getString(R.string.insane_lvl_question_125_option_2),
                context.getResources().getString(R.string.insane_lvl_question_125_option_3), context.getResources().getString(R.string.insane_lvl_question_125_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_126), 1,
                context.getResources().getString(R.string.insane_lvl_question_126_option_1), context.getResources().getString(R.string.insane_lvl_question_126_option_2),
                context.getResources().getString(R.string.insane_lvl_question_126_option_3), context.getResources().getString(R.string.insane_lvl_question_126_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_127), 4,
                context.getResources().getString(R.string.insane_lvl_question_127_option_1), context.getResources().getString(R.string.insane_lvl_question_127_option_2),
                context.getResources().getString(R.string.insane_lvl_question_127_option_3), context.getResources().getString(R.string.insane_lvl_question_127_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_128), 1,
                context.getResources().getString(R.string.insane_lvl_question_128_option_1), context.getResources().getString(R.string.insane_lvl_question_128_option_2),
                context.getResources().getString(R.string.insane_lvl_question_128_option_3), context.getResources().getString(R.string.insane_lvl_question_128_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_129), 2,
                context.getResources().getString(R.string.insane_lvl_question_129_option_1), context.getResources().getString(R.string.insane_lvl_question_129_option_2),
                context.getResources().getString(R.string.insane_lvl_question_129_option_3), context.getResources().getString(R.string.insane_lvl_question_129_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_130), 4,
                context.getResources().getString(R.string.insane_lvl_question_130_option_1), context.getResources().getString(R.string.insane_lvl_question_130_option_2),
                context.getResources().getString(R.string.insane_lvl_question_130_option_3), context.getResources().getString(R.string.insane_lvl_question_130_option_4)));

    }


    public void addQuestionsAndOptionsForLvl2() {
        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_131), 3,
                context.getResources().getString(R.string.insane_lvl_question_131_option_1), context.getResources().getString(R.string.insane_lvl_question_131_option_2),
                context.getResources().getString(R.string.insane_lvl_question_131_option_3), context.getResources().getString(R.string.insane_lvl_question_131_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_132), 2,
                context.getResources().getString(R.string.insane_lvl_question_132_option_1), context.getResources().getString(R.string.insane_lvl_question_132_option_2),
                context.getResources().getString(R.string.insane_lvl_question_132_option_3), context.getResources().getString(R.string.insane_lvl_question_132_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_133), 1,
                context.getResources().getString(R.string.insane_lvl_question_133_option_1), context.getResources().getString(R.string.insane_lvl_question_133_option_2),
                context.getResources().getString(R.string.insane_lvl_question_133_option_3), context.getResources().getString(R.string.insane_lvl_question_133_option_4)));

        list.add(new ItemQuestion(R.drawable.img_brazil_question, context.getResources().getString(R.string.insane_lvl_question_134), 4,
                context.getResources().getString(R.string.insane_lvl_question_134_option_1), context.getResources().getString(R.string.insane_lvl_question_134_option_2),
                context.getResources().getString(R.string.insane_lvl_question_134_option_3), context.getResources().getString(R.string.insane_lvl_question_134_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_135), 2,
                context.getResources().getString(R.string.insane_lvl_question_135_option_1), context.getResources().getString(R.string.insane_lvl_question_135_option_2),
                context.getResources().getString(R.string.insane_lvl_question_135_option_3), context.getResources().getString(R.string.insane_lvl_question_135_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_136), 3,
                context.getResources().getString(R.string.insane_lvl_question_136_option_1), context.getResources().getString(R.string.insane_lvl_question_136_option_2),
                context.getResources().getString(R.string.insane_lvl_question_136_option_3), context.getResources().getString(R.string.insane_lvl_question_136_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_137), 2,
                context.getResources().getString(R.string.insane_lvl_question_137_option_1), context.getResources().getString(R.string.insane_lvl_question_137_option_2),
                context.getResources().getString(R.string.insane_lvl_question_137_option_3), context.getResources().getString(R.string.insane_lvl_question_137_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_138), 1,
                context.getResources().getString(R.string.insane_lvl_question_138_option_1), context.getResources().getString(R.string.insane_lvl_question_138_option_2),
                context.getResources().getString(R.string.insane_lvl_question_138_option_3), context.getResources().getString(R.string.insane_lvl_question_138_option_4)));

        list.add(new ItemQuestion(R.drawable.img_rio_question, context.getResources().getString(R.string.insane_lvl_question_139), 2,
                context.getResources().getString(R.string.insane_lvl_question_139_option_1), context.getResources().getString(R.string.insane_lvl_question_139_option_2),
                context.getResources().getString(R.string.insane_lvl_question_139_option_3), context.getResources().getString(R.string.insane_lvl_question_139_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_140), 3,
                context.getResources().getString(R.string.insane_lvl_question_140_option_1), context.getResources().getString(R.string.insane_lvl_question_140_option_2),
                context.getResources().getString(R.string.insane_lvl_question_140_option_3), context.getResources().getString(R.string.insane_lvl_question_140_option_4)));

    }

    public void addQuestionsAndOptionsForLvl3() {
        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_141), 3,
                context.getResources().getString(R.string.insane_lvl_question_141_option_1), context.getResources().getString(R.string.insane_lvl_question_141_option_2),
                context.getResources().getString(R.string.insane_lvl_question_141_option_3), context.getResources().getString(R.string.insane_lvl_question_141_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_142), 1,
                context.getResources().getString(R.string.insane_lvl_question_142_option_1), context.getResources().getString(R.string.insane_lvl_question_142_option_2),
                context.getResources().getString(R.string.insane_lvl_question_142_option_3), context.getResources().getString(R.string.insane_lvl_question_142_option_4)));

        list.add(new ItemQuestion(R.drawable.img_bridge_question, context.getResources().getString(R.string.insane_lvl_question_143), 3,
                context.getResources().getString(R.string.insane_lvl_question_143_option_1), context.getResources().getString(R.string.insane_lvl_question_143_option_2),
                context.getResources().getString(R.string.insane_lvl_question_143_option_3), context.getResources().getString(R.string.insane_lvl_question_143_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_144), 4,
                context.getResources().getString(R.string.insane_lvl_question_144_option_1), context.getResources().getString(R.string.insane_lvl_question_144_option_2),
                context.getResources().getString(R.string.insane_lvl_question_144_option_3), context.getResources().getString(R.string.insane_lvl_question_144_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_145), 2,
                context.getResources().getString(R.string.insane_lvl_question_145_option_1), context.getResources().getString(R.string.insane_lvl_question_145_option_2),
                context.getResources().getString(R.string.insane_lvl_question_145_option_3), context.getResources().getString(R.string.insane_lvl_question_145_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_146), 3,
                context.getResources().getString(R.string.insane_lvl_question_146_option_1), context.getResources().getString(R.string.insane_lvl_question_146_option_2),
                context.getResources().getString(R.string.insane_lvl_question_146_option_3), context.getResources().getString(R.string.insane_lvl_question_146_option_4)));

        list.add(new ItemQuestion(R.drawable.img_dumb_question, context.getResources().getString(R.string.insane_lvl_question_147), 2,
                context.getResources().getString(R.string.insane_lvl_question_147_option_1), context.getResources().getString(R.string.insane_lvl_question_147_option_2),
                context.getResources().getString(R.string.insane_lvl_question_147_option_3), context.getResources().getString(R.string.insane_lvl_question_147_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_148), 3,
                context.getResources().getString(R.string.insane_lvl_question_148_option_1), context.getResources().getString(R.string.insane_lvl_question_148_option_2),
                context.getResources().getString(R.string.insane_lvl_question_148_option_3), context.getResources().getString(R.string.insane_lvl_question_148_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_149), 1,
                context.getResources().getString(R.string.insane_lvl_question_149_option_1), context.getResources().getString(R.string.insane_lvl_question_149_option_2),
                context.getResources().getString(R.string.insane_lvl_question_149_option_3), context.getResources().getString(R.string.insane_lvl_question_149_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_150), 4,
                context.getResources().getString(R.string.insane_lvl_question_150_option_1), context.getResources().getString(R.string.insane_lvl_question_150_option_2),
                context.getResources().getString(R.string.insane_lvl_question_150_option_3), context.getResources().getString(R.string.insane_lvl_question_150_option_4)));

    }

    public void addQuestionsAndOptionsForLvl4() {
        list.add(new ItemQuestion(R.drawable.img_container_ship_question, context.getResources().getString(R.string.insane_lvl_question_151), 4,
                context.getResources().getString(R.string.insane_lvl_question_151_option_1), context.getResources().getString(R.string.insane_lvl_question_151_option_2),
                context.getResources().getString(R.string.insane_lvl_question_151_option_3), context.getResources().getString(R.string.insane_lvl_question_151_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_152), 1,
                context.getResources().getString(R.string.insane_lvl_question_152_option_1), context.getResources().getString(R.string.insane_lvl_question_152_option_2),
                context.getResources().getString(R.string.insane_lvl_question_152_option_3), context.getResources().getString(R.string.insane_lvl_question_152_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_153), 4,
                context.getResources().getString(R.string.insane_lvl_question_153_option_1), context.getResources().getString(R.string.insane_lvl_question_153_option_2),
                context.getResources().getString(R.string.insane_lvl_question_153_option_3), context.getResources().getString(R.string.insane_lvl_question_153_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_154), 2,
                context.getResources().getString(R.string.insane_lvl_question_154_option_1), context.getResources().getString(R.string.insane_lvl_question_154_option_2),
                context.getResources().getString(R.string.insane_lvl_question_154_option_3), context.getResources().getString(R.string.insane_lvl_question_154_option_4)));

        list.add(new ItemQuestion(R.drawable.img_sun_battery_question, context.getResources().getString(R.string.insane_lvl_question_155), 4,
                context.getResources().getString(R.string.insane_lvl_question_155_option_1), context.getResources().getString(R.string.insane_lvl_question_155_option_2),
                context.getResources().getString(R.string.insane_lvl_question_155_option_3), context.getResources().getString(R.string.insane_lvl_question_155_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_156), 3,
                context.getResources().getString(R.string.insane_lvl_question_156_option_1), context.getResources().getString(R.string.insane_lvl_question_156_option_2),
                context.getResources().getString(R.string.insane_lvl_question_156_option_3), context.getResources().getString(R.string.insane_lvl_question_156_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_157), 1,
                context.getResources().getString(R.string.insane_lvl_question_157_option_1), context.getResources().getString(R.string.insane_lvl_question_157_option_2),
                context.getResources().getString(R.string.insane_lvl_question_157_option_3), context.getResources().getString(R.string.insane_lvl_question_157_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_158), 3,
                context.getResources().getString(R.string.insane_lvl_question_158_option_1), context.getResources().getString(R.string.insane_lvl_question_158_option_2),
                context.getResources().getString(R.string.insane_lvl_question_158_option_3), context.getResources().getString(R.string.insane_lvl_question_158_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_159), 1,
                context.getResources().getString(R.string.insane_lvl_question_159_option_1), context.getResources().getString(R.string.insane_lvl_question_159_option_2),
                context.getResources().getString(R.string.insane_lvl_question_159_option_3), context.getResources().getString(R.string.insane_lvl_question_159_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_160), 4,
                context.getResources().getString(R.string.insane_lvl_question_160_option_1), context.getResources().getString(R.string.insane_lvl_question_160_option_2),
                context.getResources().getString(R.string.insane_lvl_question_160_option_3), context.getResources().getString(R.string.insane_lvl_question_160_option_4)));

    }

    public void addQuestionsAndOptionsForLvl5() {
        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_161), 1,
                context.getResources().getString(R.string.insane_lvl_question_161_option_1), context.getResources().getString(R.string.insane_lvl_question_161_option_2),
                context.getResources().getString(R.string.insane_lvl_question_161_option_3), context.getResources().getString(R.string.insane_lvl_question_161_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_162), 3,
                context.getResources().getString(R.string.insane_lvl_question_162_option_1), context.getResources().getString(R.string.insane_lvl_question_162_option_2),
                context.getResources().getString(R.string.insane_lvl_question_162_option_3), context.getResources().getString(R.string.insane_lvl_question_162_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_163), 2,
                context.getResources().getString(R.string.insane_lvl_question_163_option_1), context.getResources().getString(R.string.insane_lvl_question_163_option_2),
                context.getResources().getString(R.string.insane_lvl_question_163_option_3), context.getResources().getString(R.string.insane_lvl_question_163_option_4)));

        list.add(new ItemQuestion(R.drawable.img_shoes_question, context.getResources().getString(R.string.insane_lvl_question_164), 1,
                context.getResources().getString(R.string.insane_lvl_question_164_option_1), context.getResources().getString(R.string.insane_lvl_question_164_option_2),
                context.getResources().getString(R.string.insane_lvl_question_164_option_3), context.getResources().getString(R.string.insane_lvl_question_164_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_165), 3,
                context.getResources().getString(R.string.insane_lvl_question_165_option_1), context.getResources().getString(R.string.insane_lvl_question_165_option_2),
                context.getResources().getString(R.string.insane_lvl_question_165_option_3), context.getResources().getString(R.string.insane_lvl_question_165_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_166), 4,
                context.getResources().getString(R.string.insane_lvl_question_166_option_1), context.getResources().getString(R.string.insane_lvl_question_166_option_2),
                context.getResources().getString(R.string.insane_lvl_question_166_option_3), context.getResources().getString(R.string.insane_lvl_question_166_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_167), 2,
                context.getResources().getString(R.string.insane_lvl_question_167_option_1), context.getResources().getString(R.string.insane_lvl_question_167_option_2),
                context.getResources().getString(R.string.insane_lvl_question_167_option_3), context.getResources().getString(R.string.insane_lvl_question_167_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_168), 1,
                context.getResources().getString(R.string.insane_lvl_question_168_option_1), context.getResources().getString(R.string.insane_lvl_question_168_option_2),
                context.getResources().getString(R.string.insane_lvl_question_168_option_3), context.getResources().getString(R.string.insane_lvl_question_168_option_4)));

        list.add(new ItemQuestion(R.drawable.img_tower_question, context.getResources().getString(R.string.insane_lvl_question_169), 4,
                context.getResources().getString(R.string.insane_lvl_question_169_option_1), context.getResources().getString(R.string.insane_lvl_question_169_option_2),
                context.getResources().getString(R.string.insane_lvl_question_169_option_3), context.getResources().getString(R.string.insane_lvl_question_169_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_170), 3,
                context.getResources().getString(R.string.insane_lvl_question_170_option_1), context.getResources().getString(R.string.insane_lvl_question_170_option_2),
                context.getResources().getString(R.string.insane_lvl_question_170_option_3), context.getResources().getString(R.string.insane_lvl_question_170_option_4)));

    }

    public void addQuestionsAndOptionsForLvl6() {
        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_171), 1,
                context.getResources().getString(R.string.insane_lvl_question_171_option_1), context.getResources().getString(R.string.insane_lvl_question_171_option_2),
                context.getResources().getString(R.string.insane_lvl_question_171_option_3), context.getResources().getString(R.string.insane_lvl_question_171_option_4)));

        list.add(new ItemQuestion(R.drawable.img_flag_g, context.getResources().getString(R.string.insane_lvl_question_172), 3,
                context.getResources().getString(R.string.insane_lvl_question_172_option_1), context.getResources().getString(R.string.insane_lvl_question_172_option_2),
                context.getResources().getString(R.string.insane_lvl_question_172_option_3), context.getResources().getString(R.string.insane_lvl_question_172_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_173), 2,
                context.getResources().getString(R.string.insane_lvl_question_173_option_1), context.getResources().getString(R.string.insane_lvl_question_173_option_2),
                context.getResources().getString(R.string.insane_lvl_question_173_option_3), context.getResources().getString(R.string.insane_lvl_question_173_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_174), 4,
                context.getResources().getString(R.string.insane_lvl_question_174_option_1), context.getResources().getString(R.string.insane_lvl_question_174_option_2),
                context.getResources().getString(R.string.insane_lvl_question_174_option_3), context.getResources().getString(R.string.insane_lvl_question_174_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_175), 2,
                context.getResources().getString(R.string.insane_lvl_question_175_option_1), context.getResources().getString(R.string.insane_lvl_question_175_option_2),
                context.getResources().getString(R.string.insane_lvl_question_175_option_3), context.getResources().getString(R.string.insane_lvl_question_175_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_176), 4,
                context.getResources().getString(R.string.insane_lvl_question_176_option_1), context.getResources().getString(R.string.insane_lvl_question_176_option_2),
                context.getResources().getString(R.string.insane_lvl_question_176_option_3), context.getResources().getString(R.string.insane_lvl_question_176_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_177), 1,
                context.getResources().getString(R.string.insane_lvl_question_177_option_1), context.getResources().getString(R.string.insane_lvl_question_177_option_2),
                context.getResources().getString(R.string.insane_lvl_question_177_option_3), context.getResources().getString(R.string.insane_lvl_question_177_option_4)));

        list.add(new ItemQuestion(R.drawable.img_smth_on_map, context.getResources().getString(R.string.insane_lvl_question_178), 2,
                context.getResources().getString(R.string.insane_lvl_question_178_option_1), context.getResources().getString(R.string.insane_lvl_question_178_option_2),
                context.getResources().getString(R.string.insane_lvl_question_178_option_3), context.getResources().getString(R.string.insane_lvl_question_178_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_179), 4,
                context.getResources().getString(R.string.insane_lvl_question_179_option_1), context.getResources().getString(R.string.insane_lvl_question_179_option_2),
                context.getResources().getString(R.string.insane_lvl_question_179_option_3), context.getResources().getString(R.string.insane_lvl_question_179_option_4)));

        list.add(new ItemQuestion(0, context.getResources().getString(R.string.insane_lvl_question_180), 2,
                context.getResources().getString(R.string.insane_lvl_question_180_option_1), context.getResources().getString(R.string.insane_lvl_question_180_option_2),
                context.getResources().getString(R.string.insane_lvl_question_180_option_3), context.getResources().getString(R.string.insane_lvl_question_180_option_4)));

    }

}
