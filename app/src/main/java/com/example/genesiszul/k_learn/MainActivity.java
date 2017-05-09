package com.example.genesiszul.k_learn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnAp;
    Button btnPrac;
    Button btnPru;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAp = (Button) findViewById(R.id.btnA);
        btnAp.setOnClickListener(this);
        btnPrac = (Button) findViewById(R.id.btnPra);
        btnPrac.setOnClickListener(this);
        btnPru = (Button) findViewById(R.id.btnPru);

    }

    @Override
    public void onClick(View v) {

        Intent intent;
        switch (v.getId()){
            case R.id.btnA:
                intent = new Intent(MainActivity.this,OpcionesActivity.class);
                startActivity(intent);
                break;
            case R.id.btnPra:
                intent = new Intent(MainActivity.this,OpcionesActivity.class);
                startActivity(intent);
                break;
        }

    }
}
