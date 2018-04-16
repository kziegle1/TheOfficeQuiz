package com.example.android.theofficequiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
     * This is a quiz app .
     */
    public class MainActivity extends AppCompatActivity {
//Question 1
        RadioButton question1_choice1;

        //Question 2
        EditText question2_answer;

        // Question 3
        CheckBox question3_choice1;
        CheckBox question3_choice2;
        CheckBox question3_choice3;
        CheckBox question3_choice4;
        //Question 4
        RadioButton question4_choice2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


        public void submitAnswers(View view) {
            CharSequence resultsDisplay;
            int answer1_score;
            int answer2_score;
            int answer3_score;
            int answer4_score;
            int final_score;


                //------------------------------------------------------------------------------------------
                // Question 1 - Correct Answer is #1 (A. Kent, Joe, Madge)
                //------------------------------------------------------------------------------------------
                Boolean answer1;

                question1_choice1 = (RadioButton) this.findViewById(R.id.question1_choice1);
                answer1 = question1_choice1.isChecked();
                if (answer1) {
                    answer1_score = 1;
                } else {
                    answer1_score = 0;
}
//------------------------------------------------------------------------------------------
            // Question 2 - Correct Answer is "Vulcanizing"
            //------------------------------------------------------------------------------------------
            String answer2;
            question2_answer = (EditText) this.findViewById(R.id.question2_answer);
            answer2 = question2_answer.getText().toString().toLowerCase();
            if (answer2.equals("neck")) {
                answer2_score = 1;
            } else {
                answer2_score = 0;
            }
            //------------------------------------------------------------------------------------------
            // Question 3  - Correct Answers are #1 (Creed) and #4 (Michael)
            //------------------------------------------------------------------------------------------
            Boolean answer3_choice1;
            Boolean answer3_choice2;
            Boolean answer3_choice3;
            Boolean answer3_choice4;
            question3_choice1 = (CheckBox) this.findViewById(R.id.question3_choice1);
            question3_choice2 = (CheckBox) this.findViewById(R.id.question3_choice2);
            question3_choice3 = (CheckBox) this.findViewById(R.id.question3_choice3);
            question3_choice4 = (CheckBox) this.findViewById(R.id.question3_choice4);
            answer3_choice1 = question3_choice1.isChecked();
            answer3_choice2 = question3_choice2.isChecked();
            answer3_choice3 = question3_choice3.isChecked();
            answer3_choice4 = question3_choice4.isChecked();
            if (answer3_choice1 && !answer3_choice2 && !answer3_choice3 && answer3_choice4) {
                answer3_score = 1;
            } else {
                answer3_score = 0;
            }

            //------------------------------------------------------------------------------------------
            // Question 4  - Correct Answers is b. "beets"
            //------------------------------------------------------------------------------------------
            Boolean answer4;
            question4_choice2 = (RadioButton) this.findViewById(R.id.question4_choice2);
            answer4 = question4_choice2.isChecked();
            if (answer4) {
                answer4_score = 1;
            } else {
                answer4_score = 0;
            }   //------------------------------------------------------------------------------------------
                        // Final Score
                        //------------------------------------------------------------------------------------------
                        final_score = answer1_score + answer2_score + answer3_score + answer4_score;
            if (final_score == 4) {
            resultsDisplay = "Perfect! You scored 4 out of 4";
        } else {
            resultsDisplay = "Try again. You scored " + final_score + " out of 4";
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, resultsDisplay, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}