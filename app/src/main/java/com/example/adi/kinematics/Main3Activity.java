package com.example.adi.kinematics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Main3Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
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

    public void sip(View v){
        Intent t=new Intent(this,Main4Activity.class);
        startActivity(t);
    }
    public void aasd(View v){
        Intent t=new Intent(this,Main5Activity.class);
        startActivity(t);
    }
    public void saa(View v){
        Intent t=new Intent(this,Main6Activity.class);
        startActivity(t);
    }
}
