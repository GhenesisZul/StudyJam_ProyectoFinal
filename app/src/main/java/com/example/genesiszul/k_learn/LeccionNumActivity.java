package com.example.genesiszul.k_learn;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeccionNumActivity extends AppCompatActivity {



    private TextSwitcher palab;
    ImageButton btnsp;
    private ImageSwitcher img;
    Button btnext;

    private Activity activity;

    private ArrayList<Aprender> datos;

    private Typeface tf_thing;
    private Typeface tf_bold;

    private List<String> listaTexto;
    private List<Integer> listaImg;
    private ArrayList<Integer> listaSonido;
    private int cantTexto;
    private int pos;
    private int[] im = {R.drawable.rojo, R.drawable.azul, R.drawable.amarillo, R.drawable.verde,
            R.drawable.morado, R.drawable.blanco, R.drawable.marron, R.drawable.anaranjado, R.drawable.negro};

    private int[] num = {R.drawable.cero, R.drawable.uno, R.drawable.dos, R.drawable.tres,
            R.drawable.cuatro, R.drawable.cinco, R.drawable.seis, R.drawable.siete, R.drawable.ocho,
            R.drawable.nueve};

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leccion_num);


        palab = (TextSwitcher) findViewById(R.id.pala);
        btnsp = (ImageButton) findViewById(R.id.btnspk);
        img = (ImageSwitcher) findViewById(R.id.ima);
        btnext = (Button) findViewById(R.id.btne);
        /*tf_thing = Typeface.createFromAsset(getAssets(), "fonts/roboto_thin.ttf");
        tf_bold = Typeface.createFromAsset(getAssets(), "fonts/roboto_black.ttf");

        palab.setTypeface(tf_bold);
        btnext.setTypeface(tf_thing);
        Log.e("hola","llegue hasta aqui");
*/
        int val = getIntent().getIntExtra("dato", 0);

        switch (val) {
            case 1:
                cargarColores();
                break;
            case 2:
                cargarNumeros();
                break;
            case 3:
                cargarVocales();
                break;
            case 4:
                cargarFormas();
                break;
        }

        palab.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                tv = new TextView(getApplicationContext());
                tv.setTextSize(50);
                tv.setTextColor(Color.parseColor("#FF000000"));
                tv.setText("Text");
                //tv.setShadowLayer(6, 6, 6, Color.BLACK);
                return tv;
            }
        });
        img.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView iv = new ImageView(getApplicationContext());
                return iv;
            }
        });

        Animation anim = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);
        Animation anim2 = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);

        Animation anim3 = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
        img.setInAnimation(anim);
        img.setOutAnimation(anim2);

        palab.setOutAnimation(anim);
        palab.setInAnimation(anim);

        pos = 0;

        palab.setText(listaTexto.get(pos));
        img.setImageResource(im[pos]);

        btnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pos++;
                if (cantTexto == pos) {
                    Intent intent = new Intent(getApplicationContext(), OpcionesActivity.class);
                    //intent.putExtra("resul", 4);
                    startActivity(intent);
                } else {
                    tv.setBackgroundColor(Math.round(10));
                    palab.setText(listaTexto.get(pos));
                    img.setImageResource(im[pos]);
                    img.setImageResource(num[pos]);
                }
            }
        });

        pos = 0;


        palab.setText(listaTexto.get(pos));
        img.setImageResource(num[pos]);

        btnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pos++;
                if (cantTexto == pos) {
                    Intent intent = new Intent(getApplicationContext(), OpcionesActivity.class);
                    //intent.putExtra("resul", 4);
                    startActivity(intent);
                } else {
                    tv.setBackgroundColor(Math.round(10));
                    palab.setText(listaTexto.get(pos));
                    img.setImageResource(im[pos]);
                    img.setImageResource(num[pos]);
                }
            }
        });


    }

    public void cargarColores() {
        listaTexto = Arrays.asList(getResources().getStringArray(R.array.nombres));
        //listaImg = Arrays.asList(getResources().getIntArray(R.array.image));
        cantTexto = listaTexto.size();
    }

    public void cargarNumeros() {
        listaTexto = Arrays.asList(getResources().getStringArray(R.array.nomnum));
        // listaImg = Arrays.asList(getResources().getIntArray(R.array.image));
        cantTexto = listaTexto.size();
    }

    public void cargarVocales() {

    }

    public void cargarFormas() {

    }
}
