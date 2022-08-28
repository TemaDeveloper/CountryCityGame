package com_country_city.country_city_java.countrycitygame.LVLconstructors;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

import com_country_city.country_city_java.countrycitygame.Main.FinishActivity;
import com_country_city.country_city_java.countrycitygame.Main.MainActivity;
import com_country_city.country_city_java.countrycitygame.Main.lists;
import com_country_city.country_city_java.countrycitygame.Moduls.ItemQuestion;
import com_country_city.country_city_java.countrycitygame.QestionsMatcher.LVLMediumQuestions;
import com_country_city.country_city_java.countrycitygame.QestionsMatcher.LvlEasyQuestions;
import com_country_city.country_city_java.countrycitygame.R;

public class LVLMediumActivity extends AppCompatActivity implements lists, View.OnClickListener, buildTimerOptions{

    private static final long START_TIME_IN_MILLIS = 25000;
    private TextView textTimer, textQuestion, textLvlTopic, textScore, textProgress;
    private CardView cardImgQuestion;
    private ImageView imgPerson, imgFlag, imgHeartOne, imgHeartTwo, imgHeartThree;
    private RadioGroup radioGroup;
    private RadioButton btnOptionOne, btnOptionTwo, btnOptionThree, btnOptionFour;
    private MaterialButton btnSubmit;
    private ProgressBar progressTimer;
    private ArrayList<ItemQuestion> questionsAndAnswers;
    private ItemQuestion itemQuestion;
    private int mistakes = 0, totalQuestions, qCounter = 0, score = 0;
    private CountDownTimer mCountDownTimer;
    private long mTimeLeftInMillis = START_TIME_IN_MILLIS;

    private ColorStateList dfRbColors;
    private boolean answered;

    private Dialog dialogLose;

    private String textIntentTitle;

    private LvlEasyQuestions lvlOneQuestions;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvlmedium);

        initFields();
        switchNextLvl();

        totalQuestions = questionsAndAnswers.size();
        progressTimer.setMax(25);

        getColors();
        showNextQuestion();
        textScore.setText(score + "/" + questionsAndAnswers.size());

        startTimer();

        btnSubmit.setOnClickListener(this::onClick);

        updateCountDownText();

    }

    private void getColors() {
        dfRbColors = btnOptionOne.getTextColors();
    }

    private void initFields(){
        questionsAndAnswers = new ArrayList<>();
        textTimer = findViewById(R.id.text_timer);
        imgFlag = findViewById(R.id.img_question);
        imgPerson = findViewById(R.id.img_person);
        btnSubmit = findViewById(R.id.btn_submit);
        textLvlTopic = findViewById(R.id.text_lvl_title);
        cardImgQuestion = findViewById(R.id.card_img_question);

        radioGroup = findViewById(R.id.radio_group);
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

        getIntentLvl();
    }

    private void getIntentLvl() {
        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            int resImage = bundle.getInt("image_lvl");
            imgPerson.setImageResource(resImage);
        }
        textIntentTitle = getIntent().getStringExtra("num");
        textLvlTopic.setText("LV" + textIntentTitle);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private void switchNextLvl() {

        @SuppressLint({"NewApi", "LocalSuppress"}) Map<String, Consumer<String>> switchNextLvMap = Map.of(
                "1.Ordinary Person", (value) -> addQuestionListForPerson(),
                "2.Teacher", (value) -> addQuestionListForTeacher(),
                "3.Voyager", (value) -> addQuestionListForVoyager(),
                "4.Businessman", (value) -> addQuestionListForBusinessman(),
                "5.Adventurer", (value) -> addQuestionListForAdventurer(),
                "6.Alien", (value) -> addQuestionListForAlien()

        );

        Optional.ofNullable(switchNextLvMap.get(textIntentTitle)).orElse((value) -> addQuestionListForPerson()).accept(textIntentTitle);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private void checkAnswer() {

        answered = true;
        RadioButton rbSelected = findViewById(radioGroup.getCheckedRadioButtonId());
        int answerNo = radioGroup.indexOfChild(rbSelected) + 1;
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

        if (qCounter < totalQuestions) {
            btnSubmit.setText("Next");
        } else {
            btnSubmit.setText("Finish");
        }

    }

    private void changeDefaultConditionOfButtons(){

        btnOptionOne.setBackgroundResource(R.drawable.radio_btn_selector_medium);
        btnOptionTwo.setBackgroundResource(R.drawable.radio_btn_selector_medium);
        btnOptionThree.setBackgroundResource(R.drawable.radio_btn_selector_medium);
        btnOptionFour.setBackgroundResource(R.drawable.radio_btn_selector_medium);

        btnOptionOne.setEnabled(true);
        btnOptionTwo.setEnabled(true);
        btnOptionThree.setEnabled(true);
        btnOptionFour.setEnabled(true);
        radioGroup.clearCheck();
    }

    private void showNextQuestion() {

        if (qCounter < totalQuestions) {

            btnOptionOne.setTextColor(dfRbColors);
            btnOptionTwo.setTextColor(dfRbColors);
            btnOptionThree.setTextColor(dfRbColors);
            btnOptionFour.setTextColor(dfRbColors);

            itemQuestion = questionsAndAnswers.get(qCounter);


            if (itemQuestion.getImage() != 0) {
                imgFlag.setVisibility(View.VISIBLE);
                cardImgQuestion.setVisibility(View.VISIBLE);
                imgFlag.setImageResource(itemQuestion.getImage());
            } else {
                imgFlag.setVisibility(View.GONE);
                cardImgQuestion.setVisibility(View.GONE);
            }

            textQuestion.setText(itemQuestion.getQuestion());
            btnOptionOne.setText(itemQuestion.getOptionOne());
            btnOptionTwo.setText(itemQuestion.getOptionTwo());
            btnOptionThree.setText(itemQuestion.getOptionThree());
            btnOptionFour.setText(itemQuestion.getOptionFour());

            changeDefaultConditionOfButtons();

            qCounter++;
            btnSubmit.setText("Submit");
            textProgress.setText(qCounter + "/" + totalQuestions);

            answered = false;

        } else {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.setClass(getApplicationContext(), FinishActivity.class);
            intent.putExtra("scoreIntent", score + "");
            intent.putExtra("lvlTitle", textIntentTitle + " Medium");
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
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
                textTimer.setText("Over");
                lose();
            }
        }.start();
    }

    private void lose() {
        dialogLose.setContentView(R.layout.lose_layout_dialog);
        dialogLose.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        FloatingActionButton fabMenu = dialogLose.findViewById(R.id.btn_all_levels);
        fabMenu.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), MainActivity.class)));
        dialogLose.show();

        dialogLose.setCanceledOnTouchOutside(false);
    }

    @Override
    public void addQuestionListForPerson() {
        LVLMediumQuestions mediumQuestions = new LVLMediumQuestions(questionsAndAnswers, this);
        mediumQuestions.addQuestionsAndOptionsForLvl1();
        Collections.shuffle(questionsAndAnswers);
    }

    @Override
    public void addQuestionListForTeacher() {
        LVLMediumQuestions mediumQuestions = new LVLMediumQuestions(questionsAndAnswers, this);
        mediumQuestions.addQuestionsAndOptionsForLvl2();
        Collections.shuffle(questionsAndAnswers);
    }

    @Override
    public void addQuestionListForVoyager() {
        LVLMediumQuestions mediumQuestions = new LVLMediumQuestions(questionsAndAnswers, this);
        mediumQuestions.addQuestionsAndOptionsForLvl3();
        Collections.shuffle(questionsAndAnswers);
    }

    @Override
    public void addQuestionListForBusinessman() {
        LVLMediumQuestions mediumQuestions = new LVLMediumQuestions(questionsAndAnswers, this);
        mediumQuestions.addQuestionsAndOptionsForLvl4();
        Collections.shuffle(questionsAndAnswers);
    }

    @Override
    public void addQuestionListForAdventurer() {
        LVLMediumQuestions mediumQuestions = new LVLMediumQuestions(questionsAndAnswers, this);
        mediumQuestions.addQuestionsAndOptionsForLvl5();
        Collections.shuffle(questionsAndAnswers);
    }

    @Override
    public void addQuestionListForAlien() {
        LVLMediumQuestions mediumQuestions = new LVLMediumQuestions(questionsAndAnswers, this);
        mediumQuestions.addQuestionsAndOptionsForLvl6();
        Collections.shuffle(questionsAndAnswers);
    }

    @Override
    protected void onStop() {
        super.onStop();
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

    @SuppressLint("ResourceAsColor")
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_submit:
                if (answered == false) {
                    if (btnOptionOne.isChecked() || btnOptionTwo.isChecked()
                            || btnOptionThree.isChecked() || btnOptionFour.isChecked()) {
                        checkAnswer();
                        mCountDownTimer.cancel();
                    } else {
                        Snackbar.make(view, "Select an option", Snackbar.LENGTH_SHORT)
                                .setTextColor(getResources().getColor(R.color.white))
                                .setBackgroundTint(getResources().getColor(R.color.pink))
                                .show();
                    }
                } else {
                    showNextQuestion();
                    mCountDownTimer.cancel();
                    resetTimer();
                    startTimer();
                }
                break;
        }
    }

}