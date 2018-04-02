package com.example.adi.kinematics;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {

    ListView ly1;
    AlertDialog.Builder adb;
    String[] a = {"a[m/sec^2]= תאוצה ", "t[sec]= זמן ", "0= התחלתי", "v[m/sec]= מהירות", "d= הפרש", "x[m]= העתק"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        ly1 = (ListView) findViewById(R.id.ly1);
        adb=new AlertDialog.Builder(this);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        ArrayAdapter<String> adp = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, a);
        ly1.setAdapter(adp);


    }

    public void vm(View v) {
        adb.setTitle("נוסחת המהירות הממוצעת");
        adb.setMessage("כאשר גוף נע בתנועה שוות-מהירות, מהירות הגוף מוגדרת כהעתק הגוף ביחידת זמן. כלומר אם בפרק זמן dt הגוף מעתיק את מקומו בשיעור dx אז מהירות הגוף היא v");
        adb.setPositiveButton("אוקיי הבנתי",new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog,int which){

            }
        });
        AlertDialog ad=adb.create();
        ad.show();
    }
    public void v(View v){
        adb.setTitle("נוסחת המהירות");
        adb.setMessage("");
        adb.setPositiveButton("אוקיי הבנתי",new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog,int which){

            }
        });
        AlertDialog ad=adb.create();
        ad.show();

    }

    public void x(View v){
        adb.setTitle("נוסחת ההעתק");
        adb.setMessage("");
        adb.setPositiveButton("אוקיי הבנתי",new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog,int which){

            }
        });
        AlertDialog ad=adb.create();
        ad.show();

    }
    public void x1(View v){
        adb.setTitle("נוסחת ההעתק");
        adb.setMessage("");
        adb.setPositiveButton("אוקיי הבנתי",new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog,int which){

            }
        });
        AlertDialog ad=adb.create();
        ad.show();

    }
    public void am(View v){
        adb.setTitle("נוסחת התאוצה הממוצעת");
        adb.setMessage("היחס בין השינוי במהירות של גוף לבין הזמן שבו חל שינוי זה, התאוצה היא גודל וקטורי");
        adb.setPositiveButton("אוקיי הבנתי",new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog,int which){

            }
        });
        AlertDialog ad=adb.create();
        ad.show();
    }
    public void v2(View v){
        adb.setTitle("נוסחת המהירות בריבוע");
        adb.setMessage("");
        adb.setPositiveButton("אוקיי הבנתי",new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog,int which){

            }
        });
        AlertDialog ad=adb.create();
        ad.show();

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
