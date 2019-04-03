package com.example.eva2_6_bundles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView txtVwDatos;
    Intent inDatos;
    Bundle bDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txtVwDatos = findViewById(R.id.txtVwDatos);

        inDatos = getIntent();
        bDatos = inDatos.getExtras();

        txtVwDatos.setText("Nombre: "+bDatos.getString("nom")+" \n");
        txtVwDatos.append("Altura: "+bDatos.getDouble("alt")+"\n");
        txtVwDatos.append("Hecho con Bundles!!");


    }
}
