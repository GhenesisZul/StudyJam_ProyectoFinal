package com.example.genesiszul.k_learn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OpcionesActivity extends AppCompatActivity implements View.OnClickListener{

    Button btncol;
    Button btnnum;
    Button btnvoc;
    Button btnfor;

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
    }

    @Override
    public void onClick(View v) {

        Intent intent;
        switch (v.getId()){
            case R.id.col:
                intent = new Intent(this,LeccionActivity.class);
                startActivity(intent);
                break;
            case R.id.num:
                intent = new Intent(this,LeccionActivity.class);
                startActivity(intent);
                break;
            case R.id.voc:
                intent = new Intent(this,LeccionActivity.class);
                startActivity(intent);
                break;
            case R.id.form:
                intent = new Intent(this,LeccionActivity.class);
                startActivity(intent);
                break;
        }
    }
}
