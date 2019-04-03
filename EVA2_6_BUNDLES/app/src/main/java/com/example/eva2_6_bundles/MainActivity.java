package com.example.eva2_6_bundles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Intent inSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inSecond = new Intent(this,SecondActivity.class);

    }

    public void onClicl(View v){
        Bundle bDatos = new Bundle();
        bDatos.putString("nom", "Martín Carrasco");
        bDatos.putDouble("alt", 1.70);
        inSecond.putExtras(bDatos);
        startActivity(inSecond);
    }
}
