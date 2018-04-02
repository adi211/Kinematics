package com.example.adi.kinematics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.os.Handler;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        TextView output=(TextView) findViewById(R.id.output);

        InputStream is=null;

        try {

            is=openFileInput("input.txt");

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        }

        InputStreamReader tmp=new InputStreamReader(is);

        BufferedReader reader=new BufferedReader(tmp);

        String st="";

        StringBuffer buffer=new StringBuffer();

        try {

            while ((st=reader.readLine()) != null)

            {

                buffer.append(st+"\n");

            }

        } catch (IOException e) {

            e.printStackTrace();

        }

        try {

            is.close();

        } catch (IOException e) {

            e.printStackTrace();

        }

        output.setText("היי "+buffer+"\n זוהי אפליקציה ללימוד קינימטיקה מקווה שתהנה/י" );


    }



    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add("Credits");
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        Intent r=new Intent(this,Credits.class);
        startActivity(r);
        return true;
    }

    public void nk (View v){
        Intent t=new Intent(this,Main2Activity.class);
        startActivity(t);
    }

    public void tar (View v){
        Intent a=new Intent(this,Main3Activity.class);
        startActivity(a);
    }
    public void vp(View v){
        Intent a=new Intent(this,Main7Activity.class);
        startActivity(a);

    }
}
