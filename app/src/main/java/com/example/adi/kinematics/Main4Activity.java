package com.example.adi.kinematics;

import android.content.Intent;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

public class Main4Activity extends AppCompatActivity {
    int e=0;
    int t=0;
    int n=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

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
    public void ee (View v){
        ImageView a1 = (ImageView) findViewById(R.id.eee);
        e++;
        if (e%2==0){
           a1.setImageResource(R.drawable.es);
        }
        else a1.setImageResource(R.drawable.ep);
    }
    public void tt (View v){
        ImageView b1 = (ImageView) findViewById(R.id.ttt);
        t++;
        if (t%2==0){
            b1.setImageResource(R.drawable.te);
        }
        else b1.setImageResource(R.drawable.tep);
    }
    public void nn (View v){
        ImageView c1 = (ImageView) findViewById(R.id.nnn);
        n++;
        if (n%2==0){
            c1.setImageResource(R.drawable.ns);
        }
        else c1.setImageResource(R.drawable.np);
    }
}
