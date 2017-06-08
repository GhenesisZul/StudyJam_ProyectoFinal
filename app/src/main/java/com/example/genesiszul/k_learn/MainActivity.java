package com.example.genesiszul.k_learn;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnAp;
    Button btnPrac;
    Button btnPru;

    private Typeface tf_thing;
    private Typeface tf_bold;
    private Typeface tf_light;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        btnAp = (Button) findViewById(R.id.btnA);
        btnAp.setOnClickListener(this);
        /*btnPrac = (Button) findViewById(R.id.btnPra);
        btnPrac.setOnClickListener(this);*/
        btnPru = (Button) findViewById(R.id.btnPru);
        btnPru.setOnClickListener(this);


        //adaptador = new CustomAdapter(activity,datos);


     /*   tf_thing = Typeface.createFromAsset(getAssets(), "fonts/roboto_thin.ttf");
        tf_bold = Typeface.createFromAsset(getAssets(), "fonts/roboto_black.ttf");
        btnAp.setTypeface(tf_thing);
        btnPrac.setTypeface(tf_thing);
        btnPru.setTypeface(tf_thing);*/


    }


    @Override
    public void onClick(View v) {

        Intent intent;
        switch (v.getId()) {
            case R.id.btnA:
                intent = new Intent(MainActivity.this, OpcionesActivity.class);
                startActivity(intent);

                break;
            case R.id.btnPru:
                intent = new Intent(MainActivity.this, PruebaActivity.class);
                startActivity(intent);
                break;
        }

    }
}
