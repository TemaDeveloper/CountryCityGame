package com_country_city.country_city_java.countrycitygame.New_LVLs;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

import com_country_city.country_city_java.countrycitygame.LVLconstructors.buildTimerOptions;
import com_country_city.country_city_java.countrycitygame.Main.FinishActivity;
import com_country_city.country_city_java.countrycitygame.Main.MainActivity;
import com_country_city.country_city_java.countrycitygame.Moduls.ItemQuestion;
import com_country_city.country_city_java.countrycitygame.QestionsMatcher.FlagQuestions;
import com_country_city.country_city_java.countrycitygame.QestionsMatcher.LVLCountryCapitalQuestions;
import com_country_city.country_city_java.countrycitygame.QestionsMatcher.LVLCurrencyQuestions;
import com_country_city.country_city_java.countrycitygame.R;

public class CountryCapitalLVLActivity extends AppCompatActivity implements View.OnClickListener, buildTimerOptions {

    private static final long START_TIME_IN_MILLIS = 10000;
    private int mistakes = 0, totalQuestions, qCounter = 0, score = 0;
    private CountDownTimer mCountDownTimer;
    private long mTimeLeftInMillis = START_TIME_IN_MILLIS;
    private RadioButton btnOptionOne, btnOptionTwo, btnOptionThree, btnOptionFour;
    private ProgressBar progressTimer;
    private ArrayList<ItemQuestion> questionsAndAnswers;
    private ItemQuestion itemQuestion;
    private TextView textTimer, textQuestion, textLvlTopic, textScore, textProgress;
    private Dialog dialogLose;
    private boolean losing = false;
    private ImageView imgHeartOne, imgHeartTwo, imgHeartThree;
    private ColorStateList dfRbColors;

    private FloatingActionButton fabBack;
    private int answerNo = 0;
    private String intentDemon;
    private LVLCountryCapitalQuestions lvlCountryCapitalQuestions;


    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_capital_lvl);

        init();

        intentDemon = getIntent().getStringExtra("CAPITALS_DEMON");
        if(intentDemon.equals("COUNTRY_CAPITAL_DEMON_1")){
            lvlCountryCapitalQuestions = new LVLCountryCapitalQuestions(questionsAndAnswers, this);
            lvlCountryCapitalQuestions.addQuestionsCountryCapital();
            Collections.shuffle(questionsAndAnswers);
        }else if(intentDemon.equals("COUNTRY_CAPITAL_DEMON_2")){
            lvlCountryCapitalQuestions = new LVLCountryCapitalQuestions(questionsAndAnswers, this);
            lvlCountryCapitalQuestions.addQuestionsCountryCapital2();
            Collections.shuffle(questionsAndAnswers);
        }



        totalQuestions = questionsAndAnswers.size();
        progressTimer.setMax(10);

        getColors();
        showNextQuestion();
        textScore.setText(score + "/" + questionsAndAnswers.size());

        startTimer();

        updateCountDownText();

        btnOptionOne.setOnClickListener(this);
        btnOptionTwo.setOnClickListener(this);
        btnOptionThree.setOnClickListener(this);
        btnOptionFour.setOnClickListener(this);
        fabBack.setOnClickListener(this);

    }

    @Override
    protected void onStop() {
        super.onStop();
        if(losing == true){
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
        }
    }

    private void init() {
        questionsAndAnswers = new ArrayList<>();
        textTimer = findViewById(R.id.text_timer);
        textLvlTopic = findViewById(R.id.text_lvl_title);
        fabBack = findViewById(R.id.fab_back);

        imgHeartOne = findViewById(R.id.img_heart_first);
        imgHeartTwo = findViewById(R.id.img_heart_second);
        imgHeartThree = findViewById(R.id.img_heart_third);

        btnOptionOne = findViewById(R.id.btn_option_one);
        btnOptionTwo = findViewById(R.id.btn_option_two);
        btnOptionThree = findViewById(R.id.btn_option_three);
        btnOptionFour = findViewById(R.id.btn_option_four);

        textQuestion = findViewById(R.id.text_question);
        textProgress = findViewById(R.id.text_progress);
        textScore = findViewById(R.id.text_score);
        progressTimer = findViewById(R.id.progress_timer);

        dialogLose = new Dialog(this);

    }

    @Override
    public void onRestart() {
        super.onRestart();
        startActivity(getIntent());
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    private void getColors() {
        dfRbColors = btnOptionOne.getTextColors();
    }

    private void showNextQuestion() {

        if (qCounter < totalQuestions) {

            changeDefaultConditionOfButtons();

            btnOptionOne.setTextColor(dfRbColors);
            btnOptionTwo.setTextColor(dfRbColors);
            btnOptionThree.setTextColor(dfRbColors);
            btnOptionFour.setTextColor(dfRbColors);

            itemQuestion = questionsAndAnswers.get(qCounter);

            textQuestion.setText(itemQuestion.getQuestion());
            btnOptionOne.setText(itemQuestion.getOptionOne());
            btnOptionTwo.setText(itemQuestion.getOptionTwo());
            btnOptionThree.setText(itemQuestion.getOptionThree());
            btnOptionFour.setText(itemQuestion.getOptionFour());


            qCounter++;
            textProgress.setText(qCounter + "/" + totalQuestions);

        } else {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.setClass(getApplicationContext(), FinishActivity.class);
            intent.putExtra("scoreIntent", score + "");
            if(intentDemon.equals("COUNTRY_CAPITAL_DEMON_1")){
                intent.putExtra("lvlTitle", "COUNTRY_CAPITAL_DEMON_1");
            }else{
                intent.putExtra("lvlTitle", "COUNTRY_CAPITAL_DEMON_2");
            }
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
    }

    private void changeDefaultConditionOfButtons(){
        btnOptionOne.setBackgroundResource(R.drawable.radio_currecny_selector);
        btnOptionTwo.setBackgroundResource(R.drawable.radio_currecny_selector);
        btnOptionThree.setBackgroundResource(R.drawable.radio_currecny_selector);
        btnOptionFour.setBackgroundResource(R.drawable.radio_currecny_selector);

        btnOptionOne.setEnabled(true);
        btnOptionTwo.setEnabled(true);
        btnOptionThree.setEnabled(true);
        btnOptionFour.setEnabled(true);

        btnOptionOne.setChecked(false);
        btnOptionTwo.setChecked(false);
        btnOptionThree.setChecked(false);
        btnOptionFour.setChecked(false);
    }

    @SuppressLint("ResourceAsColor")
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_option_one:
                btnOptionOne.setChecked(true);
                btnOptionTwo.setChecked(false);
                btnOptionThree.setChecked(false);
                btnOptionFour.setChecked(false);

                btnOptionTwo.setEnabled(false);
                btnOptionThree.setEnabled(false);
                btnOptionFour.setEnabled(false);

                answerNo = 1;
                checkAnswer();
                doNewHandler();
                mCountDownTimer.cancel();
                break;
            case R.id.btn_option_two:
                btnOptionOne.setEnabled(false);
                btnOptionThree.setEnabled(false);
                btnOptionFour.setEnabled(false);

                btnOptionTwo.setChecked(true);
                btnOptionOne.setChecked(false);
                btnOptionThree.setChecked(false);
                btnOptionFour.setChecked(false);

                answerNo = 2;
                checkAnswer();
                doNewHandler();
                mCountDownTimer.cancel();
                break;
            case R.id.btn_option_three:
                btnOptionOne.setEnabled(false);
                btnOptionTwo.setEnabled(false);
                btnOptionFour.setEnabled(false);

                btnOptionThree.setChecked(true);
                btnOptionOne.setChecked(false);
                btnOptionTwo.setChecked(false);
                btnOptionFour.setChecked(false);

                answerNo = 3;
                checkAnswer();
                doNewHandler();
                mCountDownTimer.cancel();
                break;
            case R.id.btn_option_four:
                btnOptionOne.setEnabled(false);
                btnOptionTwo.setEnabled(false);
                btnOptionThree.setEnabled(false);

                btnOptionFour.setChecked(true);
                btnOptionOne.setChecked(false);
                btnOptionTwo.setChecked(false);
                btnOptionThree.setChecked(false);

                answerNo = 4;
                checkAnswer();
                doNewHandler();
                mCountDownTimer.cancel();
                break;
            case R.id.fab_back:
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.setClass(getApplicationContext(), MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                break;
        }
    }

    private void doNewHandler(){
        new Handler().postDelayed(new Runnable() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void run() {
                showNextQuestion();
                mCountDownTimer.cancel();
                resetTimer();
                startTimer();
            }
        }, 1000);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private void checkAnswer() {
        if (answerNo == itemQuestion.getAnswer()) {
            score++;
            textScore.setText(score + "/" + totalQuestions);
        } else {
            mistakes++;
            switch(mistakes){
                case 1:
                    imgHeartThree.setColorFilter(ContextCompat.getColor(getApplicationContext(),
                            android.R.color.darker_gray), android.graphics.PorterDuff.Mode.MULTIPLY);
                    break;
                case 2:
                    imgHeartTwo.setColorFilter(ContextCompat.getColor(getApplicationContext(),
                            android.R.color.darker_gray), android.graphics.PorterDuff.Mode.MULTIPLY);
                    break;
                case 3:
                    imgHeartOne.setColorFilter(ContextCompat.getColor(getApplicationContext(),
                            android.R.color.darker_gray), android.graphics.PorterDuff.Mode.MULTIPLY);

                    lose();
                    break;
            }
        }
        btnOptionOne.setTextColor(getResources().getColor(R.color.red));
        btnOptionTwo.setTextColor(getResources().getColor(R.color.red));
        btnOptionThree.setTextColor(getResources().getColor(R.color.red));
        btnOptionFour.setTextColor(getResources().getColor(R.color.red));


        switch (itemQuestion.getAnswer()) {
            case 1:
                btnOptionOne.setBackgroundColor(getResources().getColor(R.color.green));
                btnOptionOne.setTextColor(getResources().getColor(R.color.white));
                break;
            case 2:
                btnOptionTwo.setBackgroundColor(getResources().getColor(R.color.green));
                btnOptionTwo.setTextColor(getResources().getColor(R.color.white));
                break;
            case 3:
                btnOptionThree.setBackgroundColor(getResources().getColor(R.color.green));
                btnOptionThree.setTextColor(getResources().getColor(R.color.white));
                break;
            case 4:
                btnOptionFour.setBackgroundColor(getResources().getColor(R.color.green));
                btnOptionFour.setTextColor(getResources().getColor(R.color.white));
                break;
        }

        btnOptionOne.setEnabled(false);
        btnOptionTwo.setEnabled(false);
        btnOptionThree.setEnabled(false);
        btnOptionFour.setEnabled(false);

    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void resetTimer() {
        mTimeLeftInMillis = START_TIME_IN_MILLIS;
        updateCountDownText();
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void updateCountDownText() {
        int seconds = (int) (mTimeLeftInMillis / 1000) % 60;
        String timeLeftFormatted = String.format(Locale.getDefault(), "%02d", seconds);
        textTimer.setText(timeLeftFormatted);
        progressTimer.setProgress(Integer.parseInt(timeLeftFormatted), false);
    }

    @Override
    public void startTimer() {
        mCountDownTimer = new CountDownTimer(mTimeLeftInMillis, 1000) {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onTick(long millisUntilFinished) {
                mTimeLeftInMillis = millisUntilFinished;
                progressTimer.setProgress((int) mTimeLeftInMillis);
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                lose();
            }
        }.start();
    }

    private void lose() {
        dialogLose.setContentView(R.layout.lose_layout_dialog);
        dialogLose.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        FloatingActionButton fabMenu = dialogLose.findViewById(R.id.btn_all_levels);
        FloatingActionButton fabRestart = dialogLose.findViewById(R.id.btn_restart);
        fabMenu.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), MainActivity.class)));
        fabRestart.setOnClickListener(view -> {
            onRestart();
            losing = false;
        });
        dialogLose.show();
        dialogLose.setCanceledOnTouchOutside(false);
        losing = true;
    }

}