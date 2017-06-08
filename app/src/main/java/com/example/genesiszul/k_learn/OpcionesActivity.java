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

public class OpcionesActivity extends AppCompatActivity implements View.OnClickListener {

    TextView titulo;
    Button btncol;
    Button btnnum;
    Button btnvoc;
    Button btnfor;
    private Activity activity;

    private ArrayList<Aprender> datos;



    private Typeface tf_thing;
    private Typeface tf_bold;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones);



        btncol = (Button) findViewById(R.id.col);
        btncol.setOnClickListener(this);
        btnnum = (Button) findViewById(R.id.num);
        btnnum.setOnClickListener(this);
        btnvoc = (Button) findViewById(R.id.voc);
        btnvoc.setOnClickListener(this);
        btnfor = (Button) findViewById(R.id.form);
        btnfor.setOnClickListener(this);


        /*activity = this;
        datos = new ArrayList<Aprender>();

        llenarArrayList();*/


        tf_thing = Typeface.createFromAsset(getAssets(), "fonts/roboto_thin.ttf");
        tf_bold = Typeface.createFromAsset(getAssets(), "fonts/roboto_black.ttf");
        btncol.setTypeface(tf_thing);
        btnnum.setTypeface(tf_thing);
        btnvoc.setTypeface(tf_thing);
        btnfor.setTypeface(tf_thing);


    }

   /* public void llenarArrayList() {

        Resources resources = getResources();
        String[] arraynombres = resources.getStringArray(R.array.nombres);
        TypedArray imgs= resources.obtainTypedArray(R.array.image);

        for (int i=0; i < arraynombres.length;i++){
            datos.add(new Aprender(arraynombres[i],imgs.getResourceId(i,-1)));
        }
    }
*/

    @Override
    public void onClick(View v) {

      //  Intent intent; = new Intent(getApplicationContext(), LeccionActivity.class);
        Intent intent;
        switch (v.getId()) {
            case R.id.col:
                intent = new Intent(getApplicationContext(),LeccionActivity.class);
                intent.putExtra("dato", 1);
                startActivity(intent);
                break;
            case R.id.num:
                intent = new Intent(getApplicationContext(),LeccionActivity.class);
                intent.putExtra("dato", 2);
                startActivity(intent);
                break;
            case R.id.voc:
                intent = new Intent(getApplicationContext(),LeccionActivity.class);
                intent.putExtra("dato", 3);
                startActivity(intent);
                break;
            case R.id.form:
                intent = new Intent(getApplicationContext(),LeccionActivity.class);
                intent.putExtra("dato", 4);
                startActivity(intent);
                break;
        }

    }
}
