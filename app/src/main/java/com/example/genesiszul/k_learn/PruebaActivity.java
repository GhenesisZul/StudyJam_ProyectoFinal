package com.example.genesiszul.k_learn;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PruebaActivity extends AppCompatActivity {

    private TextSwitcher palab;
    ImageButton btnsp;
   // private ImageSwitcher img1, img2, img3, img4;
   private RadioButton img1, img2, img3, img4;
    Button btnext;

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

    private int[] voc = {R.drawable.a, R.drawable.e, R.drawable.i, R.drawable.o,
            R.drawable.u};


    private TextView tv;

    RadioGroup radioGroup;
    RadioButton r1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba);
/*
        palab = (TextSwitcher) findViewById(R.id.pala);
        btnsp = (ImageButton) findViewById(R.id.btnspk);
        img1 = (ImageSwitcher) findViewById(R.id.ima1);
        img2 = (ImageSwitcher) findViewById(R.id.ima2);
        img3 = (ImageSwitcher) findViewById(R.id.ima3);
        img4 = (ImageSwitcher) findViewById(R.id.ima4);
        btnext = (Button) findViewById(R.id.btne);*/

  /*      palab = (TextSwitcher) findViewById(R.id.pala);
        btnsp = (ImageButton) findViewById(R.id.btnspk);
        img1 = (RadioButton) findViewById(R.id.ima1);
        img2 = (RadioButton) findViewById(R.id.ima2);
        img3 = (RadioButton) findViewById(R.id.ima3);
        img4 = (RadioButton) findViewById(R.id.ima4);

        int val = getIntent().getIntExtra("dato", 0);



        switch (val) {
            case 1:
                mostrarColores();
                break;
            case 2:
                mostrarNumeros();
                break;
            case 3:
                mostrarVocales();
                break;
            case 4:
                mostrarFormas();
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

        Animation anim = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);
        Animation anim2 = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);

        palab.setOutAnimation(anim);
        palab.setInAnimation(anim);

        pos = 0;

        palab.setText(listaTexto.get(pos));
        */

        radioGroup = (RadioGroup) findViewById(R.id.miRadioGroup);
        r1= (RadioButton)findViewById(R.id.ima1);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (r1.isChecked()== true){
                    Toast.makeText(getApplicationContext(), "Correcto", Toast.LENGTH_SHORT).show();
                }/*else if (checkedId == R.id.ima2){
                    Toast.makeText(getApplicationContext(),"dos",Toast.LENGTH_SHORT).show();
                }else if (checkedId == R.id.ima3) {
                    Toast.makeText(getApplicationContext(), "tres", Toast.LENGTH_SHORT).show();
                }
                else if (checkedId == R.id.ima4) {
                    Toast.makeText(getApplicationContext(), "cuatro", Toast.LENGTH_SHORT).show();
                }*/
            }
        });

    }

    public void mostrarColores() {

      /*  listaTexto = Arrays.asList(getResources().getStringArray(R.array.nombres));
        //listaImg = Arrays.asList(getResources().getIntArray(R.array.image));
        cantTexto = listaTexto.size();

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
                   // img.setImageResource(im[pos]);

                }
            }
        });
        pos=0;*/
    }

    public void mostrarNumeros(){

    }

    public void  mostrarVocales(){

    }

    public void mostrarFormas(){

    }
}
