package com.example.android.quizappmzansi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    int score = 0;

    //each question adds 1 to the score
    final int q1_Answer = R.id.q1_radiobutton_b;
    final int q2_Answer = R.id.q2_a;
    final int q3_Answer = R.id.q3_b;
    final int q4_Answer = R.id.q4_a;
    final String q8_Answer = "south western";
    final String q9_Answer = "9";
    final String q10_Answer = "1994";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // sets score to zero, checks answers, displays score
    public void checkAnswers(View view) {
        score = 0;
        checkQuestion1();
        checkQuestion2();
        checkQuestion3();
        checkQuestion4();
        checkQuestion5();
        checkQuestion6();
        checkQuestion7();
        checkQuestion8();
        checkQuestion9();
        checkQuestion10();

        String toastMessage = String.valueOf(score);
        Toast points = Toast.makeText(MainActivity.this, "Your score for the quiz is " + toastMessage, Toast.LENGTH_LONG);
        points.show();
    }


    //check question 1
    private void checkQuestion1() {
        //if the selected radio button is the same as the answer, 1 point is added to score.
        RadioGroup rg = (RadioGroup) findViewById(R.id.q1_group);

        if (rg.getCheckedRadioButtonId() == q1_Answer) {
            score += 1;
        }
    }

    //check question 2
    private void checkQuestion2() {
        RadioGroup rg = (RadioGroup) findViewById(R.id.q2_group);
        // if correct radio button is pressed, 1 point is added to score
        if (rg.getCheckedRadioButtonId() == q2_Answer) {
            score += 1;
        }

    }

    //check question 3
    private void checkQuestion3() {
        RadioGroup rg = (RadioGroup) findViewById(R.id.q3_group);
        // if correct radio button is pressed, 1 point is added to score
        if (rg.getCheckedRadioButtonId() == q3_Answer) {
            score += 1;
        }

    }

    //check question 4
    private void checkQuestion4() {
        RadioGroup rg = (RadioGroup) findViewById(R.id.q4_group);
        // if correct radio button is pressed, 1 point is added to score
        if (rg.getCheckedRadioButtonId() == q4_Answer) {
            score += 1;
        }

    }

    // this checks question 5
    private void checkQuestion5() {
        CheckBox q5ChkA = (CheckBox) findViewById(R.id.q5_a);
        CheckBox q5ChkB = (CheckBox) findViewById(R.id.q5_b);
        CheckBox q5ChkC = (CheckBox) findViewById(R.id.q5_c);
        CheckBox q5ChkD = (CheckBox) findViewById(R.id.q5_d);

        if (q5ChkA.isChecked() && q5ChkB.isChecked() && q5ChkD.isChecked() && !q5ChkC.isChecked()) {
            score += 1;
        }
    }

    // this checks question 6
    private void checkQuestion6() {
        CheckBox q6ChkA = (CheckBox) findViewById(R.id.q6_a);
        CheckBox q6ChkB = (CheckBox) findViewById(R.id.q6_b);
        CheckBox q6ChkC = (CheckBox) findViewById(R.id.q6_c);
        CheckBox q6ChkD = (CheckBox) findViewById(R.id.q6_d);

        if (q6ChkA.isChecked() && q6ChkB.isChecked() && q6ChkD.isChecked() && q6ChkC.isChecked()) {
            score += 1;
        }
    }

    // this checks question 7
    private void checkQuestion7() {
        CheckBox q7ChkA = (CheckBox) findViewById(R.id.q7_a);
        CheckBox q7ChkB = (CheckBox) findViewById(R.id.q7_b);
        CheckBox q7ChkC = (CheckBox) findViewById(R.id.q7_c);
        CheckBox q7ChkD = (CheckBox) findViewById(R.id.q7_d);

        if (!q7ChkA.isChecked() && q7ChkB.isChecked() && q7ChkD.isChecked() && !q7ChkC.isChecked()) {
            score += 1;
        }
    }

    // method to check question 8.
    public void checkQuestion8() {

        EditText q8EditTextAnswer = findViewById(R.id.q8Answer);
        String q8UserAnswer = q8EditTextAnswer.getText().toString();

        q8UserAnswer = q8UserAnswer.toLowerCase();
        if (q8UserAnswer.equals(q8_Answer)) {
            score += 1;
        }
    }

    // method to check question 9.
    private void checkQuestion9() {
        EditText q9EditTextAnswer = findViewById(R.id.q9Answer);
        String q9UserAnswer = q9EditTextAnswer.getText().toString();

        if (q9UserAnswer.equals(q9_Answer)) {
            score += 1;
        }
    }


    // method to check question 10.
    private void checkQuestion10() {
        EditText q10EditTextAnswer = findViewById(R.id.q10Answer);
        String q10UserAnswer = q10EditTextAnswer.getText().toString();

        if (q10UserAnswer.equals(q10_Answer)) {
            score += 1;
        }
    }

    // resetting all fields
    public void resetApp(View view) {
        score = 0;
        resetQ1();
        resetQ2();
        resetQ3();
        resetQ4();
        resetQ5();
        resetQ6();
        resetQ7();
        resetQ8();
        resetQ9();
        resetQ10();
    }

    private void resetQ1() {
        // this resets question 1
        RadioGroup q1RadioGroup = findViewById(R.id.q1_group);
        q1RadioGroup.clearCheck();
    }

    private void resetQ2() {
        // this resets question 2
        RadioGroup q2RadioGroup = findViewById(R.id.q2_group);
        q2RadioGroup.clearCheck();
    }

    private void resetQ3() {
        // this resets question 3
        RadioGroup q3RadioGroup = findViewById(R.id.q3_group);
        q3RadioGroup.clearCheck();
    }

    private void resetQ4() {
        // this resets question 4
        RadioGroup q4RadioGroup = findViewById(R.id.q4_group);
        q4RadioGroup.clearCheck();
    }

    // this unchecks checkboxes for question 5
    private void resetQ5() {

        CheckBox q5CheckBoxA = findViewById(R.id.q5_a);
        q5CheckBoxA.setChecked(false);

        CheckBox q5CheckBoxB = findViewById(R.id.q5_b);
        q5CheckBoxB.setChecked(false);

        CheckBox q5CheckBoxC = findViewById(R.id.q5_c);
        q5CheckBoxC.setChecked(false);

        CheckBox q5CheckBoxD = findViewById(R.id.q5_d);
        q5CheckBoxD.setChecked(false);
    }

    // this unchecks checkboxes for question 6
    private void resetQ6() {

        CheckBox q6CheckBoxA = findViewById(R.id.q6_a);
        q6CheckBoxA.setChecked(false);

        CheckBox q6CheckBoxB = findViewById(R.id.q6_b);
        q6CheckBoxB.setChecked(false);

        CheckBox q6CheckBoxC = findViewById(R.id.q6_c);
        q6CheckBoxC.setChecked(false);

        CheckBox q6CheckBoxD = findViewById(R.id.q6_d);
        q6CheckBoxD.setChecked(false);
    }

    // this unchecks checkboxes for question 7
    private void resetQ7() {

        CheckBox q7CheckBoxA = findViewById(R.id.q7_a);
        q7CheckBoxA.setChecked(false);

        CheckBox q7CheckBoxB = findViewById(R.id.q7_b);
        q7CheckBoxB.setChecked(false);

        CheckBox q7CheckBoxC = findViewById(R.id.q7_c);
        q7CheckBoxC.setChecked(false);

        CheckBox q7CheckBoxD = findViewById(R.id.q7_d);
        q7CheckBoxD.setChecked(false);
    }

    private void resetQ8() {
        EditText q8EditText = findViewById(R.id.q8Answer);
        q8EditText.setText("", TextView.BufferType.EDITABLE);
    }

    private void resetQ9() {
        EditText q9EditText = findViewById(R.id.q9Answer);
        q9EditText.setText("", TextView.BufferType.EDITABLE);
    }


    private void resetQ10() {
        EditText q10EditText = findViewById(R.id.q10Answer);
        q10EditText.setText("", TextView.BufferType.EDITABLE);
    }
}

