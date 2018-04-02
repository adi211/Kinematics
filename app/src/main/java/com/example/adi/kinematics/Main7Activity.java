package com.example.adi.kinematics;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.net.URL;

public class Main7Activity extends AppCompatActivity {

    //WebView wb;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayShowHomeEnabled(true);



    }
    public void bro1(View v){
        Intent br=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=oTe7rRCrbDE&list=PLNGEkKcKe0CR0tgjfeIyT4SZejqyg-KTd"));
        startActivity(br);
    }
    public void bro2(View v){
        Intent br=new Intent(Intent.ACTION_VIEW, Uri.parse("http://meyda.education.gov.il/files/katalog_hinuchi/books/mehanika_nyutonit_a.pdf"));
        startActivity(br);
    }
    public void bro3(View v){
        Intent br=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=XNq-lvALx08"));
        startActivity(br);
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

















        /* String Url = "https://youtu.be/oTe7rRCrbDE";
        wb = (WebView) findViewById(R.id.wv);


        wb.getSettings().setJavaScriptEnabled(true);
        wb.setWebViewClient(new myB());
        wb.getSettings().getJavaScriptEnabled();
        wb.loadUrl(Url);

    }
}
   private class myB extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

}
        */