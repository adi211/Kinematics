package com.example.adi.kinematics;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class NameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        getSupportActionBar().hide();

    }

    public void write(View view) {
            EditText input = (EditText) findViewById(R.id.input);
            if (!input.getText().toString().equals(""))
                das();
            else
                Toast.makeText(NameActivity.this, "לא הוזן שם. הזן שוב", Toast.LENGTH_SHORT).show();
    }

    public void das() {

        EditText input = (EditText) findViewById(R.id.input);
        String in = input.getText().toString();

        FileOutputStream fos = null;

        try {

            fos = openFileOutput("input.txt", Context.MODE_PRIVATE);

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        }

        OutputStreamWriter osw = new OutputStreamWriter(fos);

        BufferedWriter bw = new BufferedWriter(osw);

        try {

            bw.write(in);

        } catch (IOException e) {

            e.printStackTrace();

        }

        try {

            bw.close();

        } catch (IOException e) {

            e.printStackTrace();

        }
        Intent r = new Intent(this, MainActivity.class);
        startActivity(r);

    }







}


