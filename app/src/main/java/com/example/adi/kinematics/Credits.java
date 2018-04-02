package com.example.adi.kinematics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Credits extends AppCompatActivity {

    TextView te;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
        getSupportActionBar().hide();

        te=(TextView)findViewById(R.id.textView7);
        te.setText("קרדיט: לעדי, למורה אלברט");
    }

    public void bbbb (View v){
        Intent t=new Intent(this,MainActivity.class);
        startActivity(t);
    }
}
