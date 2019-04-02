package com.example.eva2_5_extras_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView txtMostrar;
    Intent inDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txtMostrar = findViewById(R.id.txtMostrar);

        inDatos = getIntent();
        txtMostrar.append("Nombre: "+inDatos.getStringExtra("nombre")+"\n");
        txtMostrar.append("Edad: "+inDatos.getStringExtra("edad")+"\n");
        txtMostrar.append("Salario: "+inDatos.getDoubleExtra("Salario",2.2)+"\n");
        if(inDatos.getBooleanExtra("trabaja",false)){
            txtMostrar.append("Trabaja: Sí \n");
        }else{
            txtMostrar.append("Trabaja: No \n");
        }
        txtMostrar.append("Estado: "+inDatos.getStringExtra("estado")+"\n");

    }
}
