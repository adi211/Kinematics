package com.example.adi.kinematics;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {
    private QuetionLibrary mQuetionLibrary = new QuetionLibrary();

    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNmber = 0;
    AlertDialog.Builder adb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        mScoreView = (TextView) findViewById(R.id.Score);
        mQuestionView = (TextView) findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.choice1);
        mButtonChoice2 = (Button) findViewById(R.id.choice2);
        mButtonChoice3 = (Button) findViewById(R.id.choice3);

        adb = new AlertDialog.Builder(this);

        updateQuestion();

        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mButtonChoice1.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(Main6Activity.this, "correct :)", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Main6Activity.this, "wrong :(", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mButtonChoice2.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(Main6Activity.this, "correct :)", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Main6Activity.this, "wrong :(", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mButtonChoice3.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(Main6Activity.this, "correct :)", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Main6Activity.this, "wrong :(", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });


    }

    private void updateQuestion() {
        mQuestionView.setText(mQuetionLibrary.getQuestions(mQuestionNmber));
        mButtonChoice1.setText(mQuetionLibrary.getChoice1(mQuestionNmber));
        mButtonChoice2.setText(mQuetionLibrary.getChoice2(mQuestionNmber));
        mButtonChoice3.setText(mQuetionLibrary.getChoice3(mQuestionNmber));

        mAnswer = mQuetionLibrary.getCorrectAnswer(mQuestionNmber);
        if (mQuestionNmber == 6) {
            adb.setTitle("Your score is: " + mScore + " of " + mQuestionNmber);
            adb.setPositiveButton("Try Again", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            adb.setNegativeButton("Finish", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            AlertDialog ad = adb.create();
            ad.show();
            mQuestionNmber = 0;
            mScore = 0;
            updateQuestion();
            mScoreView.setText("0");
        } else mQuestionNmber++;
    }

    private void updateScore(int point) {
        mScoreView.setText("" + mScore);
    }

    public void Try(View view) {
        mQuestionNmber = 0;
        updateQuestion();
        mScore = 0;
        mScoreView.setText("0");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add("Credits");
        menu.add("Back");
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        String st = item.getTitle().toString();
        if (st.equals("Back")) {
            finish();
        } else {
            Intent r = new Intent(this, Credits.class);
            startActivity(r);
        }
        return true;
    }
}
