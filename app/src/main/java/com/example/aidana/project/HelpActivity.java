package com.example.aidana.project;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.aidana.project.list.ListActivity;

import static com.example.aidana.project.R.menu.menumenu;

public class HelpActivity extends AppCompatActivity {
    TextView tv;
    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    ScrollView rel;

    final int MENU_COLOR_RED = 1;
    final int MENU_COLOR_GREEN = 2;
    final int MENU_COLOR_BLUE = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        rel = (ScrollView) findViewById(R.id.sc);
        setContentView(R.layout.activity_help);
        Typeface tp=Typeface.createFromAsset(getAssets(),"fonts/TinyShack.ttf");
        tv=(TextView) findViewById(R.id.textView4);
        tv.setTypeface(tp);
        tv1=(TextView) findViewById(R.id.textView5);
        tv1.setTypeface(tp);
        tv2=(TextView) findViewById(R.id.textView6);
        tv2.setTypeface(tp);
        tv3=(TextView) findViewById(R.id.textView7);
        tv3.setTypeface(tp);
        tv4=(TextView) findViewById(R.id.textView8);
        tv4.setTypeface(tp);
        tv5=(TextView) findViewById(R.id.textView11);
        tv5.setTypeface(tp);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(menumenu, menu);
        //menu.add(Menu.NONE, MENU_COLOR_RED, Menu.NONE, "Red");
//        menu.add(Menu.NONE, MENU_COLOR_GREEN, Menu.NONE, "Violet");
//        menu.add(Menu.NONE, MENU_COLOR_BLUE, Menu.NONE, "Blue");
        // menu.add("Help");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {



            case R.id.item1:
                Intent in = new Intent(this, ListActivity.class);
                startActivity(in);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
